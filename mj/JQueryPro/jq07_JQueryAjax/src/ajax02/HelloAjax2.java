package ajax02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloAjax2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String id = request.getParameter("userId");
		
		// 시간을 지연시켜서 에러가 나도록 로직을 유도..
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e ){
			e.printStackTrace();
		}
		
		
		//실제 응답이 이뤄지는 부분
		out.print("id :: " + id);
		out.close();
	}
}
