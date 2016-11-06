package servlet.config;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// 결과적으로 DD에서 가져올 정보는 파일의 경로.
public class UsingConfigCountStore4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private String path;
    private int count;

	public void init() throws ServletException {
		//1. DD에 설정된 정보를 가져와서 path에 할당함..
		//2. 읽어들인 path정보를 바탕으로 파일을 읽어들이는 입력스트림을 생성.
		//3. 파일의 내용을 읽어서 필드인 count에 할당.
		System.out.println("init()...call"+path);

		path = getInitParameter("path");
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			String line = br.readLine();
			count = Integer.parseInt(line);
			
		} catch (FileNotFoundException e) {
			System.out.println("해당하는 파일을 찾지 못했습니다.");
		
		} catch (IOException e){

		}
		
		System.out.println("DD로 부터 읽어들인 경로를 가지고 초기화한 COUNT값 :: " + count);
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet()...call");
		request.setCharacterEncoding("utf-8");
    	response.setContentType("text/html;charset=utf-8");
    	
    	PrintWriter out = response.getWriter();
    	out.println("<h2><b>Count Value ::" + ++count+"</b></h2>");
    	
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy()..");
		/*	실행 후 반드시 서버를 stop 시키고 다시 돌리자.
		 * 1. 파일을 하나 생성.. path
		 * 2. getParentFile(), mkdirs() 사용
		 * 3. PrintWriter 스트림 생성.. 이때 해당 디렉토리 안에 출력용 파일 생성.
		 * 4. doGet()을 통해서 증가된 count값을 파일로 출력
		 * 5. close();
		 */
		
		File file = new File(path);
		file.getParentFile().mkdirs();
		
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(file),true);
			pw.println(count);	//txt 파일로 count 값이 출력됨..
			pw.close();
		} catch (Exception e) {

		}
	}
}
