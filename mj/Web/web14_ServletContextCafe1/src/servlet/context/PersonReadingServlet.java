package servlet.context;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.context.vo.PersonVO;

public class PersonReadingServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      System.out.println("doGet()....");

      request.setCharacterEncoding("utf-8");
      response.setContentType("text/html;charset=utf-8");

      PrintWriter out = response.getWriter();   
      //1. 바인딩된 정보를 받아와서
      //2. 웹으로 출력.... name ,age
      
      PersonVO vo = (PersonVO)getServletContext().getAttribute("vo");
      out.println("<h2><b>ServletContext에 바인딩된 정보를 출력..</b></h2><p>");
      out.println("<h3>이름 : " + vo.getName() + "</h3><p>");
      out.println("<h3>나이 : " + vo.getAge() + "</h3><p>");
      //?로 전달한 값을 marquee 태그로 출력해보세요....
      String guestName = request.getParameter("guestName");
      out.println("<marquee bgcolor=yellow><h1>guestName......." + guestName + "</h1></marquee>");
      out.close();
      }
}