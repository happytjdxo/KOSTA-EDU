package servlet.context;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class WritingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ServletContext cont;
    private HashMap userList;
    
	public void init() throws ServletException {
		System.out.println("1. init()....call...");
		
		cont = getServletContext();
		System.out.println("ServletContext return ...");
		
		userList=  new HashMap();
		System.out.println("userList creating.. ...");	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("2. doPost()...call....");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		String id = request.getParameter("userId");
		String pass = request.getParameter("userPass");
		String name = request.getParameter("userName");
		
		userList.put("id",id);
		userList.put("pass",pass);
		userList.put("name",name);
		
		cont.setAttribute("userList", userList);
		out.println("<html><body bgcolor='pink'>");
		out.println("<b>======= The Communication between Servlets=========<br>");
		out.println("사용자의 정보가 ServletContext에 저장되었습니다...</b><br><br>");
		
		out.println("<a href='RS'>접속자 명단 보기</a></body></html>");
		out.close();
		
	}
}












