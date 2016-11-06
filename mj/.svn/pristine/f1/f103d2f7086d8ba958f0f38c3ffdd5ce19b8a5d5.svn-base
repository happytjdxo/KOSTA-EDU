package form.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 * 1. 한글처리
 * 2. PrintWriter 받고
 * 3. thml폼에 입력된 값을 받아서 웹으로 출력
 * 	  이때 getParameter(), getParameterValues()를 사용
 */
public class CheckBoxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		// getParameterMap()으로 다시 작성.
				
		/*String Kisu = request.getParameter("Kisu");
		String gender = request.getParameter("gender");
		String[ ] menu = request.getParameterValues("menu");
		out.println("<html><body><h2><b>");
		out.println("다음은" + Kisu + "기" + gender + " 성들이 좋아하는 메뉴들입니다..<br>");
		out.println("</b></h2><p>");
		for(String s : menu) {
			out.println("<li>" + s + "<br>");
		}
		out.println("</body></html>");*/
		
	}
}
