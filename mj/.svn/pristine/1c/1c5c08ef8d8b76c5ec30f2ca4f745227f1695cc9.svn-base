package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardDao;
import model.BoardVO;

public class PageInfoController implements Controller {

	@Override
	public ModelAndView execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String category=null;
		int no = Integer.parseInt(request.getParameter("no"));
		String pageno = request.getParameter("pageno");
		String path="error.jsp";
		if(request.getParameter("category") != null){
			category = request.getParameter("category");
			request.setAttribute("category", category);
		}
		ArrayList<BoardVO> list = BoardDao.getInstance().showAllContents();
		int nextNo = 0;
		int preNo = 0;
		for(int i=0;i<list.size();i++){
			if(list.get(i).getNo()==no){//no=40/i=0

				if(i+1 != list.size()){//i+1=1/list.size=28
					nextNo = list.get(i+1).getNo();
					request.setAttribute("nextNo", nextNo);
					System.out.println("nextNo : " + nextNo);
				}
				if(i-1>=0){//i-1=-1
					preNo = list.get(i-1).getNo();
					request.setAttribute("preNo", preNo);
					System.out.println("preNo : " + preNo);
				}
			}
		}
		request.setAttribute("no", no);
		/*
		 * 일단 다 가져와서...
		 * 여기서 넘어온 no에 맞는거 찾아서...그거의 앞 뒤에 있는 거만
		 * no뽑아가지고...다음 인덱스, 전 인덱스, 현재 인덱스(no) 나오니까
		 * 이거를 request에 set해서 넘기면 되나..?
		 * path="showContent.do?no="+no+"&&nextNo="+next+"&&preNo="+pre+"&&category="+category;
		 * requestDispatcher방식
		 */
		path="showContent.do?pageno="+pageno;
		
		
		return new ModelAndView(path);
	}

}
