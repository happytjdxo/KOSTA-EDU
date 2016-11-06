package controller;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.MemberService;
import model.MemberVO;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class MemberController extends MultiActionController{
	private MemberService memberService;

	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}
	//service의 biz() 호출....
	//redirect 방식으로 전송
	public ModelAndView register(HttpServletRequest request, HttpServletResponse response, MemberVO vo) throws Exception{
		memberService.registerMember(vo);
		return new ModelAndView("redirect:/member.do?command=getAllMember");
	}
	
	public ModelAndView idcheck(HttpServletRequest request, HttpServletResponse response) throws Exception{
		boolean bool = memberService.idcheck(request.getParameter("id"));
		request.setAttribute("checkId", bool);
		return new ModelAndView("check_id.jsp");
	}
	//주의!!..login_ok, login_fail
	//메소드의 인자값 주의...사용자의 정보를 session에 바인딩 해야 한다..
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response, HttpSession session, MemberVO pvo) throws SQLException{
		MemberVO vo = memberService.login(pvo);
		session.setAttribute("vo", vo);
		return new ModelAndView("login_ok.jsp"); 
	}
	
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws SQLException{
		if(session.getAttribute("vo") != null)
			session.invalidate();
		
		return new ModelAndView("index.jsp");
	}
	
	//HttpSession을 인자값으로 넣지 않고 진행하자....
	public ModelAndView updateMember(HttpServletRequest request, HttpServletResponse response, MemberVO pvo) throws SQLException{
		memberService.updateMember(pvo);
		MemberVO vo = memberService.login(pvo);
		request.getSession().setAttribute("vo", vo);
		return new ModelAndView("update_result.jsp");
	}	
	
	public ModelAndView getAddressKind(HttpServletRequest request, HttpServletResponse response) throws SQLException{
		List<String> list = memberService.getAddressKind();
		return new ModelAndView("findByAddress.jsp", "list", list);		
	}
	
	public ModelAndView findByAddress(HttpServletRequest request, HttpServletResponse response) throws SQLException{
		List<MemberVO> memList = memberService.findByAddress(request.getParameter("address"));
		return new ModelAndView("findByAddress_result.jsp", "memList", memList);
	}
	
	public ModelAndView getAllMember(HttpServletRequest request, HttpServletResponse response) throws SQLException{
		return null;	
	}
}
