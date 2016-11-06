package controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.regexp.internal.REUtil;

import model.BoardDao;
import model.MemberVO;

public class RegisterController implements Controller {

	@Override
	public ModelAndView execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String id= request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String nickName = request.getParameter("nickname");
		String ssn = request.getParameter("ssn");
		
		
		MemberVO vo = new MemberVO(id, password, name, nickName, ssn);
		
		boolean checkId = BoardDao.getInstance().idExist(id);
		boolean checkSsn = BoardDao.getInstance().ssnExist(ssn);
		String path="index.jsp";
		try{
			BoardDao.getInstance().registerMember(vo);
			path="index.jsp";
		}catch(SQLException e){
			request.setAttribute("error", "이미 존재하는 회원입니다.");
			path="register_fail.jsp";
		}
		return new ModelAndView(path);
	}

}
