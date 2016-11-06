package servlet.context;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class ReadingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ServletContext cont;
    private HashMap userList;
    
	public void init() throws ServletException {
		cont = getServletContext();
		System.out.println("Context 받아옴.....RS...");
		System.out.println("Context Path :: "+cont.getContextPath());
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("2. doGet()...call....");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		userList = (HashMap)cont.getAttribute("userList");
		
		out.println("<h2>다음은 UserList안에 들어있는 접속자 정보입니다...</h2><p>");
		Set<String> set=userList.keySet();
		Iterator<String> it=set.iterator();
		while(it.hasNext()){
			String key = it.next();
			String value = (String)userList.get(key);
			out.println(key+"  :  "+ value+"<br>");
		}
		out.close();
	}
}
















