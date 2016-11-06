package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DispatcherServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//로직은 여기다 작성....
		String uri = request.getRequestURI();
		String context = request.getContextPath();
		String command=uri.substring(context.length()+1);
//		String command=  request.getParameter("command");
		Controller controller = HandlerMapping.getInstance().createController(command);
		
		ModelAndView mv = null;
		boolean isRedirect = false;
		String path = "error.jsp";
		
		System.out.println(command);
		try {
			mv = controller.execute(request, response);
			path = mv.getPath();
			isRedirect = mv.isRedirect();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(!isRedirect){
			request.getRequestDispatcher(path).forward(request, response);
		}else{
			response.sendRedirect(path);				
		}
	}
}
