package servlet.context;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.context.vo.PersonVO;

public class EnteranceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<PersonVO> list = Collections.synchronizedList(new ArrayList<PersonVO>());
	
	
	public EnteranceServlet() {
		System.out.println("생성자 호출.. 서블릿 객체 생성..");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("init()...call..");
		System.out.println("ServletContext가 저장된 위치값 : " + getServletContext());
		
		getServletContext().setAttribute("list", list);
		System.out.println("ServletContext에 가입자 명단을 저장할 List를 먼저 저장해 놓습니다.");
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//양방향의 한글처리.. 이 부분을 생략..
		
		PrintWriter out= response.getWriter();
		System.out.println("1. 폼으로부터 값을 받아옴");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));

		System.out.println("2. vo에 바인딩..");
		PersonVO vo= new PersonVO(name, age);
		
		System.out.println("3. vo를 List에 저장..");
		list.add(vo);
		System.out.println("List주소값 확인 1 : " + list.hashCode());	//동일한지 확인..
		
		System.out.println("4. 페이지 이동..");
		out.println(name+"님이 카페 가입 하셨습니다.<p>");
		System.out.println(name+"님이 카페 가입 하셨습니다.");
		
		out.println("<a href= ViewServlet?name="+name+"> viewServlet으로 이동하기.. 입장 명단 확인</a>");
		out.close();
	}
}
