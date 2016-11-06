package ajax05;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SerializeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private HashMap<String, String> map = new HashMap<String, String>();
    
    @Override
    public void init() throws ServletException {
    	map.put("ajax", "최민재");
    	map.put("jquery", "김준성");
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		String command = request.getParameter("command");
		if(command.equals("register")){ // 회원가입이라면..
			String name = request.getParameter("name");
			String addr = request.getParameter("addr");
			//biz logic..
			out.print(addr + " 에 사는 " + name + "님 가입성공!");
		}else if (command.equals("idcheck")){
			String id = request.getParameter("id");
			if(map.get(id)==null){ // 디비에 해당하는 아이디가 없는 경우
				out.print(false); // 폼으로 부터 입력받은 아이디가 디비에 없는경우.. 사용가능
			}else{
					out.print(true); //form에 입력한 아이디가 ajax, jquery로 넣었을경우.. 사용 불가
			}
			out.close();
		}
	}
}
