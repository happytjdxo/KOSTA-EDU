package servlet.context;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContextParam extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ServletContext cont;
    //private String userName1, userName2, userName3;
    
	public void init() throws ServletException {
		cont = getServletContext();
		Enumeration<String> en = cont.getInitParameterNames();
		while(en.hasMoreElements()) {
			String key = en.nextElement();
			String value = cont.getInitParameter(key);
			System.out.println(key + " : " + value);
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		out.println("<h3><b>Checking..Server..Consol..</b></h3>");
		out.close();
	}
}
