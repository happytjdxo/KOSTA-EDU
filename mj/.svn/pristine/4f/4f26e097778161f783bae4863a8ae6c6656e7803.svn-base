package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardDao;

public class UpdateRecommandController implements Controller {

	@Override
	public ModelAndView execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		int no = Integer.parseInt(request.getParameter("no"));
		String pageno= request.getParameter("pageno");
		BoardDao.getInstance().updateRecommend(no);
		System.out.println("pageno :: "+pageno);
		String path = "pageInfo.do?no="+no+"&&pageno="+pageno;
		
		return new ModelAndView(path, true);
	}
}
