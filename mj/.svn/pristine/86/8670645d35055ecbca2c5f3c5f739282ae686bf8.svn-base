package ajax06;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

public class JSonServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;

    public JSonServlet() {
        super();
    }

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("text/html;charset=utf-8");
      PrintWriter out = response.getWriter();
      
      //JsonObject를 하나 생성...
      JSONObject json = new JSONObject();
      json.put("name", "김연아");
      json.put("age", 26);
      json.put("address", "태능");
      
      out.print(json); //객체가 전송...html에서 data.name / data.age / data.address...키를 넣음
   }
}