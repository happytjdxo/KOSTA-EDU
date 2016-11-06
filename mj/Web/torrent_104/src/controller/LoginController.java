package controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.BoardDao;
import model.MemberVO;

public class LoginController implements Controller {

	@Override
	public ModelAndView execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String id =request.getParameter("id");
		String password = request.getParameter("password");
		
		String path="login_fail.jsp";
		
		try{
			MemberVO loginMember = BoardDao.getInstance().login(id, password);
			if(loginMember!=null){
				System.out.println(loginMember);
				HttpSession session = request.getSession();
				session.setAttribute("loginMember", loginMember);
				path="main.do";
			}
		}
		catch(SQLException e){
			path="login_fail.jsp";
		}
		
		
		return new ModelAndView(path, true);
	}
}
