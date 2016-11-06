package ajax01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloajaxServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;
  
    public HelloajaxServlet() {
        super();
    }

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String name = request.getParameter("name");
      
      System.out.println("ajax...doPost() Call..."+name);
   }

}