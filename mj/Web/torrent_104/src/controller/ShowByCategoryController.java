package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardDao;
import model.BoardVO;

public class ShowByCategoryController implements Controller {

	@Override
	public ModelAndView execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		String category = request.getParameter("category");
		System.out.println("Controller :: category :: " + category);
		ArrayList<BoardVO> contentList = BoardDao.getInstance().ShowContents(category);
		request.setAttribute("contentList", contentList);
		
		for(BoardVO vo : contentList){
			System.out.println(vo);
		}
		
		return new ModelAndView("main.jsp");
	}

}
