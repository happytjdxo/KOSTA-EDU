package servlet.ajax;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FindNickNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private HashMap<String, String> nickname = new HashMap<String, String>();
	
	public void init() throws ServletException{
		nickname.put("박정기", "엉끼엉끼");
		nickname.put("주은성", "주교수");
		nickname.put("유다형", "폴리");
		nickname.put("강혜진", "토끼");
		nickname.put("최란", "겨드란이");
	}
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String name=request.getParameter("uName");
		
		
		
		name = URLDecoder.decode(name, "utf-8");
		
		
		
		
		
		String nick = nickname.get(name);
		if(nick==null)
			out.print("해당 이름에 대한 별명은 없어요");
		else
			out.print(nick);
		
		out.close();
	}

}
