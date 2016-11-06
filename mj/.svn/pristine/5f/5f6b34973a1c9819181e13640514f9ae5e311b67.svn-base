package org.kosta.ohanza.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.ohanza.model.MemberDTO;
import org.kosta.ohanza.service.MemberService;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class MemberController extends MultiActionController {
	private MemberService memberService;

	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}

	// MemberService
	public ModelAndView registerMember(HttpServletRequest request,
			HttpServletResponse response, MemberDTO memberDTO) throws Exception {

		System.out.println(memberDTO);
		memberService.registerMember(memberDTO);

		return new ModelAndView("register_ok", "member", memberDTO);
	}

	public ModelAndView idCheck(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		String id = request.getParameter("id");
		boolean flag = memberService.idCheck(id);

		return new ModelAndView("JsonView", "flag", flag);
	}

	public ModelAndView login(HttpServletRequest request,
			HttpServletResponse response, HttpSession session,
			MemberDTO memberDTO) throws Exception {
		MemberDTO rdto = memberService.login(memberDTO);
		System.out.println(memberDTO);
		System.out.println(rdto);

		if (rdto != null) {
			session.setAttribute("dto", rdto);
		}
		return new ModelAndView("login_result");
	}
	// MemberService 끝

	public ModelAndView logout(HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws SQLException{

		if(session.getAttribute("dto") != null)
			session.invalidate();

		return new ModelAndView("redirect:/views/index.jsp");
	}

	public ModelAndView updateMember(HttpServletRequest request,
			HttpServletResponse response, MemberDTO memberDTO) throws Exception {

		memberService.updateMember(memberDTO);
		request.getSession().setAttribute("dto", memberDTO);

		return new ModelAndView("update_ok");
	}

	public ModelAndView findId(HttpServletRequest request,
			HttpServletResponse response, MemberDTO memberDTO) throws Exception {

		String ssn = request.getParameter("ssn");
		String id = memberService.findId(ssn);
		
		return new ModelAndView("searchId&Password","id",id);
	}

	public ModelAndView findPassword(HttpServletRequest request, HttpServletResponse response,MemberDTO memberDTO)
			throws Exception{
		/*System.out.println(request.getParameter("id"));
			      System.out.println(request.getParameter("password"));
			      System.out.println(memberDTO);*/
		String password = memberService.findPassword(memberDTO);
		//System.out.println(password);
		return new ModelAndView("searchId&Password","password",password);
	}
}
