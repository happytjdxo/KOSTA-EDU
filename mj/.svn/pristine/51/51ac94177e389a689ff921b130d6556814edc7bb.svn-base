package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardDao;

public class SearchPassController implements Controller {

	@Override
	public ModelAndView execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String ssn = request.getParameter("ssn");
		
		String rpass = BoardDao.getInstance().searchPass(id, name, ssn);
		
		if(rpass != null){
		request.setAttribute("id", id);
		request.setAttribute("rpass", rpass);
		}else{
		request.setAttribute("error","해당하는 id가 존재하지 않습니다." );
		}
		
		return new ModelAndView("searchPass_result.jsp");
	}
}
