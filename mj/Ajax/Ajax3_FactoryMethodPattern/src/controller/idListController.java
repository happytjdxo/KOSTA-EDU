package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberDAO;
import model.MemberDTO;

public class idListController implements Controller {

	@Override
	public ModelAndView execute(HttpServletRequest request,
			HttpServletResponse respone) throws Exception {
		ArrayList<MemberDTO> list = null;
		list = MemberDAO.getInstance().showAllMember();
		request.setAttribute("list", list);
		String path = "step2_idlist.jsp";
						
		return new ModelAndView(path);
	}

}
