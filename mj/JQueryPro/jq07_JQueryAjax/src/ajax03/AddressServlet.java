package ajax03;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddressServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap<String, String> map = new HashMap<String, String>();
	
	@Override
	public void init() throws ServletException {
		   map.put("류현진", "LA");
	       map.put("푸이그", "LA");
	       map.put("추신수", "Texas");
	       map.put("박찬호", "Korea");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		System.out.println(name);
		out.print(map.get(name));
		
		out.close();
	}
}
