package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class TestController extends MultiActionController{
	
	public ModelAndView breakfast(HttpServletRequest request, HttpServletResponse response) 
											throws Exception{
		System.out.println("breakfast biz Logic Call....");
		return new ModelAndView("tabpage/breakfast","menu", "Cream Soup And Potato");
	}
	
	public ModelAndView lunch(HttpServletRequest request, HttpServletResponse response) 
			throws Exception{
		System.out.println("lunch biz Logic Call....");
		return new ModelAndView("tabpage/lunch","menu", "Tomato Spagetii");
	}
	
	public ModelAndView dinner(HttpServletRequest request, HttpServletResponse response) 
			throws Exception{
		System.out.println("dinner biz Logic Call....");
		return new ModelAndView("tabpage/dinner","menu", "Beer and Chicken");
	}
	//getSubject
	public ModelAndView getSubject(HttpServletRequest request, HttpServletResponse response) 
			throws Exception{
		System.out.println("getSubject() biz Logic Call....");
		return new ModelAndView("JsonView","info", "JAVA | JDBC | WEB | Framework | JQuery | Ajax");
	}
	
	//getCompany
	public ModelAndView getCompany(HttpServletRequest request, HttpServletResponse response) 
			throws Exception{
		System.out.println("getCompany() biz Logic Call....");
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Tomato System");
		list.add("Ahn Lab Coporation");
		list.add("East Engineering");
		list.add("Sun MicroSystems");
		list.add("NCSoftware");
		list.add("Nexon Coporation");
		return new ModelAndView("JsonView","info",list);
	}
	// autocomplete
	
	public ModelAndView autocomplete(HttpServletRequest request, HttpServletResponse response) 
			throws Exception{
		System.out.println("autocomplete() biz Logic Call....");
		String term = request.getParameter("term");
		
		ArrayList<String> list = new ArrayList<String>();
		
		if(term.equals("맛집")){
			list.add("하남 돼지 갈비집 맛집");
			list.add("담소 순대국 맛집");
			list.add("소호정 맛집");
			list.add("집밥 맛집");
			list.add("찡따오 양꼬치 맛집");
		
		}else if (term.equals("여행")){
			list.add("이발사.. 이탈리아 정통 여행");
			list.add("Earth 여행");
			list.add("커플 여행");
			list.add("솔로 여행");
			
		}else if (term.equals("공연")){
			list.add("서울시 공연");
			list.add("청소년 돕기 공연");
			list.add("조성진 쇼팽 공연");
			list.add("리베라 합창단 공연");
			list.add("존레논을 회상하며 공연");
			
		}
		
		return new ModelAndView("JsonView","course",list);
	}
	
	//search
	public ModelAndView search(HttpServletRequest request, HttpServletResponse response) 
			throws Exception{
		System.out.println("search() biz Logic Call....");
		
		String word = request.getParameter("word");
		return new ModelAndView("JsonView","result", word + "....Best Choose!!");
	}
}