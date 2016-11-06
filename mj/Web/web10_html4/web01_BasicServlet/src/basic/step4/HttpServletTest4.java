package basic.step4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 *  Client�� ��û�� �ϸ� �������� ��û�� �����ϱ� ���ؼ� ���������� service()�� �����ߴ�.
 *  ������ HttpServlet�� ��ӹ��� ������ service() ��ſ� doPost() / doGet()�� �̿��ؼ�
 *  ��û�� ó���Ѵ�. ����� �����ϰ� ���´�. �׷��� �Ѵ� �ѹ��� ������ �� ���� �� �� �ϳ��� ��� �����ϴ�.
 *  ���߿��� �⺻���� ��û�� ó���ϴ� �޼ҵ�� doGet()�̴�.
 *  http://127.0.0.1:7777/web01_BasicServlet/HttpServletTest4 --> (�⺻��û) ������ doGet()�� ȣ�����ش�.
 */
public class HttpServletTest4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	// �̰����� ��û�� ����..
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);		//doPost()�� ��ȣ��.
	}
	
	// ���� ������ ���⼭ �ۼ�..
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("euc-kr");
		PrintWriter out = response.getWriter();
		out.println("�ȳ�? ����..");
		
		out.close();
	}
}
