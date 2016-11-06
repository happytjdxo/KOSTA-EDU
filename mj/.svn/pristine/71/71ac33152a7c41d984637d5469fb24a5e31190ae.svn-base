package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import model.BoardDao;
import model.MemberVO;

public class UpdateMemberController implements Controller{

	@Override
	public ModelAndView execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		String id= request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String nickname = request.getParameter("nickname");
		
		MemberVO vo = new MemberVO(id, password, name, nickname);
		MemberVO loginMember = BoardDao.getInstance().modifyMemberInfo(vo);
		
		HttpSession session = request.getSession();
		session.setAttribute("loginMember", loginMember);
		
		return new ModelAndView("main.do",true);
	}
}