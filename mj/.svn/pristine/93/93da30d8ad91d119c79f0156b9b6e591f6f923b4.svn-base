package org.kosta.ohanza.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.ohanza.dao.MemberService;
import org.kosta.ohanza.model.MemberDTO;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class MemberController extends MultiActionController{
	private MemberService memberService;

	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}
	
	public ModelAndView registerMember(HttpServletRequest request, HttpServletResponse response, MemberDTO memberDTO)
	throws Exception{
		
		memberService.registerMember(memberDTO);
		return new ModelAndView("register_ok","member",memberDTO);
	}
	
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response,HttpSession session ,MemberDTO memberDTO)
			   throws Exception{
			       MemberDTO rdto=memberService.login(memberDTO);
			      System.out.println(memberDTO);
			      System.out.println(rdto);
			      
			      if(rdto != null){
			      session.setAttribute("dto", rdto);
			      }
			      return new ModelAndView("login_result");
			   }
}