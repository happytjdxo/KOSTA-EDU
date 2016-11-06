package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardDao;
import model.BoardVO;

public class SearchIdController implements Controller {

	@Override
	public ModelAndView execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		/*
		 * 이름, ssn 받아와서
		 * 비지니스 로직 호출해서
		 * 리턴받아서
		 * request에 바인딩해서
		 * searchId_result.jsp로 이동
		 */
		
		String name = request.getParameter("name");
		String ssn = request.getParameter("ssn");
		String rName = BoardDao.getInstance().searchID(name, ssn);
		if(!rName.equals("")){
			request.setAttribute("rName", rName);
		}
		return new ModelAndView("searchId_result.jsp");
	}

}
