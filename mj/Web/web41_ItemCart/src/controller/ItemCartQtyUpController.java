package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cartbiz.CartBiz;

public class ItemCartQtyUpController implements Controller {

	@Override
	public ModelAndView handle(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//name을 받아온다.
		//CartBiz의 upCartQty()를 호출한다.
		//itemCartList.jsp로 이동
		
		String name = request.getParameter("name");
		CartBiz cartBiz = new CartBiz();
		cartBiz.upCartQty(request, name);
		
		ModelAndView mv=  new ModelAndView();
		mv.setUrl("itemCartList.do");
		mv.setRedirect(true);
		return mv;
	}

}










