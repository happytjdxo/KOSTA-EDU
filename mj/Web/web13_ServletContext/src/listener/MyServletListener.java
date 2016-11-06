package listener;
/*
 * ServletContextEvent를 감지하는 리스너..ServletContextListener
 * 이벤트를 감지하기 위해서는 반드시 DD에 등록되어져 있어야 한다.
 * <listener>
 * 	<listener-class> listener.MyServletListener</listener-class>
 * </listener>
 * 
 * 이벤트 발생시.. 해당 이벤트를 감지하고 메소드를 호출한다.
 * <content-param>
 * 		<param-name>a</param-name>
 * 		<param-value>aa</param-value>
 * <content-param>
 * 
 * 호출하는 메소드를 우리가 리스너를 구현한 클래스에서 오버라이딩 하면 된다.
 * contextDestroyed(ServletContextEvent){
 * contextInitialized(ServletContextEvent){
 * 		// 이 안에서 dd에 설정된 값을 끌어당기는 로직
 * 			getInitParameter()
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletListener implements ServletContextListener{
	private ServletContext cont;
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("꼴까닥..");
	}
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("contextInitialized.. call..");
		/*
		 * 1. ServletContext를 받아온다.
		 * 2. getInitparameter()로 dd에 등록된 값을 받아온다.. path
		 * 3. 파일에 저장된 내용을 읽어서..
		 * 	  BufferedReader
		 * 	  getResourceAsStream()을 사용하세요.
		 * 4. 콘솔로 출력한다.
		 */
		
		cont = sce.getServletContext(); 
		String fileName = cont.getInitParameter("userFile");
		System.out.println("userFile: " + fileName);
		
		InputStream is = null;
		BufferedReader br = null;
		try {
			cont.getResourceAsStream(fileName);
			System.out.println("getResourceAsStream() call");
			br = new BufferedReader(new InputStreamReader(is));
			System.out.println("BufferedReader 생성..");
			String line = null;
			System.out.println("파일의 내용을 읽어들입니다..");
			while((line = br.readLine())!=null){
				System.out.println(line);
			}
		}catch(IOException e){
			System.out.println("파일의 내용을 읽어오지 못했습니다..");
		}
	}
}
// 얜 server를 껏다가 킨다. 그리고 아무거나 열어도 된다. 어제 만든 context1.html을 열자