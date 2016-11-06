package org.kosta.ohanza.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.ohanza.model.BoardDTO;
import org.kosta.ohanza.model.MemberDTO;
import org.kosta.ohanza.service.TypeBoardService;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class TypeBoardController extends MultiActionController{
	private String path;

	public void setPath(String path) {
		this.path = path;
	}
	
	private TypeBoardService typeBoardService;

	public void setTypeBoardService(TypeBoardService typeBoardService) {
		this.typeBoardService = typeBoardService;
	}
	
	public ModelAndView getBoard(HttpServletRequest request,
			HttpServletResponse response, BoardDTO boardDTO) throws Exception {
	
		BoardDTO bDTO = typeBoardService.getBoard(boardDTO);
		
		return new ModelAndView("content", "bDTO", bDTO);
	}
	
	public ModelAndView writeBoard(HttpServletRequest request,
			HttpServletResponse response, HttpSession session, BoardDTO boardDTO) throws Exception {
		
		MemberDTO loginMember = (MemberDTO)session.getAttribute("dto");
		if(loginMember!=null)
		{
			boardDTO.setMemberDTO(loginMember);
			typeBoardService.writeBoard(boardDTO);
			return new ModelAndView("redirect:board.do?command=getBoard","boardDTO",boardDTO);
		}
		
		return new ModelAndView("index");
	}
	
	public ModelAndView updateBoard(HttpServletRequest request,
			HttpServletResponse response, BoardDTO boardDTO) throws Exception{
		
		int typeBoardNo = Integer.parseInt(request.getParameter("no"));
		boardDTO.setNo(typeBoardNo);
		typeBoardService.updateBoard(boardDTO);
		
		return new ModelAndView("redirect:board.do?command=getBoard","boardDTO",boardDTO);
	}
	
	public ModelAndView deleteBoard(HttpServletRequest request,
			HttpServletResponse response, BoardDTO boardDTO) throws Exception {
		
		int typeBoardNo = Integer.parseInt(request.getParameter("no"));
		boardDTO.setNo(typeBoardNo);
		typeBoardService.updateBoard(boardDTO);
		
		return new ModelAndView("subpage01");
	}
	
	public ModelAndView searchBy_Title(HttpServletRequest request,
			HttpServletResponse response, BoardDTO boardDTO) throws Exception{
		
		String title = request.getParameter("title"); 
		boardDTO.setTitle(title);
		List<BoardDTO> list = typeBoardService.searchBy_Title(title);
		
		return new ModelAndView("subpage01","list",list);
	}
	
	public ModelAndView searchBy_Writer(HttpServletRequest request,
			HttpServletResponse response, BoardDTO boardDTO) throws Exception {
		
		String nickname = request.getParameter("nickname");
		boardDTO.setContent(nickname);
		List<BoardDTO> list = typeBoardService.searchBy_Writer(nickname);
		
		return new ModelAndView("subpage01","list",list);
	}
	
	public ModelAndView searchMyText(HttpServletRequest request,
			HttpServletResponse response, BoardDTO boardDTO) throws Exception {
		
		String ssn = request.getParameter("ssn");
		boardDTO.setContent(ssn);
		List<BoardDTO> list = typeBoardService.searchMyText(ssn);
		
		return new ModelAndView("subpage01","list",list);
	}
	
	public ModelAndView searchBy_Category(HttpServletRequest request,
			HttpServletResponse response, BoardDTO boardDTO) throws Exception {
		
		String category = request.getParameter("category");
		boardDTO.setCategory(category);
		List<BoardDTO> list = typeBoardService.searchBy_Category(category);
	
		return new ModelAndView("subpage01","list",list);
	}
	/////////////////////////////////////////////////////////////////
	public ModelAndView bestOfBest(HttpServletRequest request, 
			HttpServletResponse response, BoardDTO boardDTO) throws Exception {
		
		/*boardDTO.getHits();
		typeBoardService.bestOfBest();*/
		
		return new ModelAndView("index");
	}
	public ModelAndView likeBoard(HttpServletRequest request,
			HttpServletResponse response, BoardDTO boardDTO) throws Exception {
		
		int typeBoardNo = Integer.parseInt(request.getParameter("no"));
		boardDTO.setNo(typeBoardNo);
		typeBoardService.likeBoard(boardDTO);
		
		return new ModelAndView("redirect:board.do?command=getBoard","boardDTO",boardDTO);
	}

	public ModelAndView hateBoard(HttpServletRequest request,
			HttpServletResponse response, BoardDTO boardDTO) throws Exception {
		
		int typeBoardNo = Integer.parseInt(request.getParameter("no"));
		boardDTO.setNo(typeBoardNo);
		typeBoardService.hateBoard(boardDTO);
		
		return new ModelAndView("redirect:board.do?command=getBoard","boardDTO",boardDTO);
	}

	public ModelAndView getBoardList(HttpServletRequest request,
			HttpServletResponse response, BoardDTO boardDTO) throws Exception {
		//boardDTO.getCategory();
		List<BoardDTO> list = typeBoardService.getBoardList();
		
		return new ModelAndView("subpage01","list",list);
	}
}