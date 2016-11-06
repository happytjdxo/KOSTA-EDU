package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.BoardDao;
import model.MemberVO;

public class DeletePassController implements Controller{

	@Override
	public ModelAndView execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		String password = request.getParameter("password");
		
		String id = request.getParameter("id");
		System.out.println(password);
		System.out.println(id);
		MemberVO deleteboard = BoardDao.getInstance().searchMember(id);
		System.out.println("deleteboard = " + deleteboard);
		boolean check = false;
		if(password.equals(deleteboard.getPassword())){
			System.out.println("111111111");
			check=true;
		}
		request.setAttribute("check", check);
		System.out.println("check= " + check);
		
		return new ModelAndView("deletePass_result.jsp");
	}
}
