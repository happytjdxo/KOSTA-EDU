package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardDao;
import model.BoardVO;

public class SearchContentController implements Controller {

	@Override
	public ModelAndView execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		String category = request.getParameter("category");
		String title = request.getParameter("title");
		String searchContentCheck = request.getParameter("searchContentCheck");
		int pageno = 0;
		if(request.getParameter("pageno")!=null){
			pageno = Integer.parseInt(request.getParameter("pageno"));
		}
		if(pageno<1){
			pageno=1;
		}
		int recordNo = 10;
		int recordStart = (pageno - 1) * recordNo;
		int recordEnd = pageno * recordNo -1;

		//B.L 호출
		ArrayList<BoardVO> contentList = BoardDao.getInstance().searchContentByCategory(category, title);
		
		if(contentList!=null){
			request.setAttribute("contentList", contentList);
		}
		int recodeEndno = contentList.size();
		int pageEnd = (recodeEndno/recordNo)+(recodeEndno%recordNo>0?1:0);	//
		int group_no = pageno/5+(pageno%5>0?1:0);
		int page_eno = group_no*5;
		int page_sno = page_eno-(5-1);
		
		if(page_eno>pageEnd){
//			   현재 그룹 끝 번호d가 전체페이지 수 보다 클 경우		
				page_eno=pageEnd;
//			   현재 그룹 끝 번호와 = 전체페이지 수를 같게
		}

		request.setAttribute("searchContentCheck", searchContentCheck);
		request.setAttribute("recordStart", recordStart);
		request.setAttribute("recordEnd", recordEnd);
		request.setAttribute("pageno", pageno);
		request.setAttribute("page_eno", page_eno);
		request.setAttribute("page_sno", page_sno);
		request.setAttribute("pageEnd", pageEnd);
		request.setAttribute("category", category);
		request.setAttribute("title", title);

		String path = "main.jsp";
		
		request.setAttribute("contentList", contentList);
		return new ModelAndView(path);
		
	}

}
