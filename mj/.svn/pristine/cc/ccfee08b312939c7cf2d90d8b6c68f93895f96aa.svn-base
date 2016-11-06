package servlet.ajax;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EncodingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8"); 
		PrintWriter out = response.getWriter();
		//자바 스크립트에서 get방식으로 보낸 id값을 받아온다...
		//이때 id값이 한글일 경우 문제가 생긴다...확인해보자
		String id = request.getParameter("id");
		id=URLDecoder.decode(id, "utf-8");
		try{
			Thread.sleep(5000);
		}catch(InterruptedException e){
			
		}
		out.print(id);
		
	}

}
