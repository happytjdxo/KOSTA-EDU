package org.kosta.ohanza.controller;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.ohanza.model.BoardDTO;
import org.kosta.ohanza.model.MemberDTO;
import org.kosta.ohanza.service.Tip_BoardService;
import org.kosta.ohanza.service.TypeBoardService;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class BoardController extends MultiActionController {
	private TypeBoardService typeBoardService;
	boolean isLike = false;
	boolean isHate = false;

	public void setTypeBoardService(TypeBoardService typeBoardService) {
		this.typeBoardService = typeBoardService;
	}

	public ModelAndView getBoard(HttpServletRequest request,
			HttpServletResponse response, BoardDTO boardDTO) throws Exception {
		int no = Integer.parseInt(request.getParameter("no"));
		// String board = request.getParameter("board");
		boardDTO = typeBoardService.getBoard(no);
		MemberDTO dto = (MemberDTO) request.getSession().getAttribute("dto");
		
		if (dto == null) {
			return new ModelAndView("redirect:/index.jsp");
		} else {
			// System.out.println(board);
			typeBoardService.updateCount(request.getParameter("no"));
			typeBoardService.getBoard(no);
		}
		return new ModelAndView("typeboard_content", "boardDTO", boardDTO);
	}

	public ModelAndView writeBoard(HttpServletRequest request,
			HttpServletResponse response, HttpSession session, BoardDTO boardDTO)
			throws Exception {

		MemberDTO memberDTO = (MemberDTO) request.getSession().getAttribute(
				"dto");

		if (memberDTO != null) {
			boardDTO.setCategory("게임 팁");
			boardDTO.setMemberDTO(memberDTO);
			typeBoardService.writeBoard(boardDTO);
			System.out.println(boardDTO);
			return new ModelAndView("typeboard_content", "boardDTO", boardDTO);
		} else {
			return new ModelAndView("index");
		}
	}

	public ModelAndView updateView(HttpServletRequest request,
			HttpServletResponse response, BoardDTO boardDTO)
			throws SQLException {
		int no = Integer.parseInt(request.getParameter("no"));
		return new ModelAndView("updateBoard", "boardDTO", typeBoardService.getBoard(no));

	}
	
	public ModelAndView updateBoard(HttpServletRequest request,
			HttpServletResponse response, BoardDTO boardDTO)
			throws SQLException {
		int no = Integer.parseInt(request.getParameter("no"));
		
		System.out.println(no);
		boardDTO.setCategory("게임 팁");
		typeBoardService.updateBoard(boardDTO);
		//return new ModelAndView("tipboard_content", "boardDTO", tip_BoardService.getBoard(no));
	return new ModelAndView("redirect:/board.do?command=getBoard&&no="+no);
	}



	public ModelAndView deleteBoard(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		int no = Integer.parseInt(request.getParameter("no"));
		typeBoardService.deleteBoard(no);
		List<BoardDTO> list = typeBoardService.getBoardList();
		return new ModelAndView("subpage01", "list", list);
	}

	public ModelAndView searchBy_Title(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		return new ModelAndView();
	}

	public ModelAndView searchBy_Writer(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		return new ModelAndView();
	}

	public ModelAndView searchMyText(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		return new ModelAndView();
	}

	public ModelAndView searchBy_Category(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		return new ModelAndView();
	}

	public ModelAndView bestOfBest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		return new ModelAndView();
	}

	public ModelAndView likeBoard(HttpServletRequest request,
			HttpServletResponse response, BoardDTO boardDTO) throws Exception {
		int no=Integer.parseInt(request.getParameter("no"));
		String path = "";
		
		
		if(isLike==false){
			typeBoardService.likeBoard(boardDTO);
			isLike = true;
		}
		path = "typeboard_content";	
		
		return new ModelAndView(path, "boardDTO", typeBoardService.getBoard(no));
	}
	
	public ModelAndView hateBoard(HttpServletRequest request,
			HttpServletResponse response, BoardDTO boardDTO) throws Exception {
		int no=Integer.parseInt(request.getParameter("no"));
		
		String path = "";
		if(isHate==false){
			typeBoardService.hateBoard(boardDTO);
			isHate = true;
		}
			
			path = "typeboard_content";

		return new ModelAndView(path, "boardDTO", typeBoardService.getBoard(no));
	}
	
	public ModelAndView getBoardList(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		List<BoardDTO> list = typeBoardService.getBoardList();
		return new ModelAndView("subpage01", "list", list);
	}
}