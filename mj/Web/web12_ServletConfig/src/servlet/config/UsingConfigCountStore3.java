package servlet.config;
/*
 * web04_LifeCycle에서는 클라이언트가 요청할 때마다 카운트를 증가시키고
 * 증가된 카운트를 필드에 저장하는 로직을 다뤘다.
 * 그런데 이런방식으로 저장하면 서버가 다운되면 카운트 값을 영구적으로 보관할 수 
 * 없었다.. 파일에 저장.
 * 파일저장 -- destroy()
 * 저장된 파일 값을 다시 찾아오는 로직 ---- init()..다음번 실행시 동작.
 * ---------------------------------------------------
 * step1의 문제점 : 프로그램상에 파일 경로가 하드카피 되어져있다.
 * -----------------------------------------------
 * step2
 * 파일을 포함한 경로에 대한 정보를 컨테이너 차원의 환경정보로 저장 하겠다.
 * web.xml에 매핑 시키자.
 * 이정보는 서버가 가동되자마자 메모리에 로딩될 것이고(서버가 정보를 읽어들인다..)
 * 클라이언트 요청이 들어오기 전에 서블릿에 초기화 정보로 로딩시킬수 있다.
 * init() 안에서, ServletConfig의 getInitParameter
 * ""
 * init() : 정보를 가져온다.. dd에서 path, file 이름.ㅇ
 */
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UsingConfigCountStore3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@Override
	public void init() throws ServletException {
		
	}
    
	public UsingConfigCountStore3() {
   
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
}
