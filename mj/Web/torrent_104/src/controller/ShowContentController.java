package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardDao;
import model.BoardVO;

public class ShowContentController implements Controller {
	
	@Override
	public ModelAndView execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		int no=Integer.parseInt(request.getParameter("no"));
		String update = request.getParameter("update");
		BoardVO bvo = null;
		String path = "showContent.jsp";
		if(update==null){
			BoardDao.getInstance().updateHits(no);
		}else{
			path="updateContent.jsp";
		}
		bvo = BoardDao.getInstance().ShowAContent(no);
		
		request.setAttribute("bvo", bvo);
		
		return new ModelAndView(path);
	}
}