package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutController implements Controller {

	@Override
	public ModelAndView execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
	    HttpSession session = (HttpSession)request.getSession();
			 if(session.getAttribute("loginMember")!=null){
		         session.invalidate();
		      }
		      String path = "logout.jsp";
		      return new ModelAndView(path);
	}

}
