package servlet.context;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.context.vo.PersonVO;

public class PersonWritingServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      System.out.println("doGet()....");
      
      request.setCharacterEncoding("utf-8");
      response.setContentType("text/html;charset=utf-8");
      
      PrintWriter out = response.getWriter();
      //1. (폼에 입력된 값 받아서....)
      //2. vo를 생성할때 이 값을 넣는다.
      //3. (Dao 객체를 생성)
      //4. (Business Logic 호출....리턴되는 값이 있다면)
      //5. 리턴되는 값을 Binding....ServletContext
      //5. 다음 서블릿으로 연결함...
      
      PersonVO vo = new PersonVO("손연재",23);
      getServletContext().setAttribute("vo", vo);
      out.println("<b>vo 객체를 ServletContext에 바인딩 했습니다..</b><br>");
      out.println("<a href='PersonReadingServlet?guestName=habaree'> PersonReaingServlet으로 이동함...");
      
      out.close();
   }
}