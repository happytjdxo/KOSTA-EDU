package controller;

import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberDAO;
import model.MemberDTO;

public class SelectController implements Controller {

   @Override
   public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
	     System.out.println("SelectController starts!");
	   	
         String id = request.getParameter("id");
         MemberDTO rdto = MemberDAO.getInstance().findMemberById(id);
         String value = rdto.getName() + " " + rdto.getAddr();
         System.out.println("SelectController has " + value);
         value = URLDecoder.decode(value, "utf-8");
         response.getWriter().println(value);
         return null;
      }
}