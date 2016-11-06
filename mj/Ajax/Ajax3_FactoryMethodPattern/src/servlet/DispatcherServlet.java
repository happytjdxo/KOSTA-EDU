package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.Controller;
import controller.HandlerMapping;
import controller.ModelAndView;
public class DispatcherServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;
        
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doProcess(request, response);
   }
   
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doProcess(request, response);
   }   
   protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      //로직은 여기다 작성...
      String command = request.getParameter("command");
      String id = request.getParameter("id");
      Controller controller = HandlerMapping.getInstance().createController(command);
      ModelAndView mv = null;
      
      try{
         mv = controller.execute(request, response);
      }catch(Exception e){
         e.printStackTrace();
      }
      /////////////////////////////////////////////////////////
      if(mv != null){
    	  if(mv.isRedirect()){
	         response.sendRedirect(mv.getPath());
	      }else{
	         request.getRequestDispatcher(mv.getPath()).forward(request, response);
	      }
      }
   }
}






















