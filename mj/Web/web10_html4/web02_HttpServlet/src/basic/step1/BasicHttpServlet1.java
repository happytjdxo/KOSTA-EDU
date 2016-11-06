package basic.step1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BasicHttpServlet1 extends HttpServlet{
	private static final long serialVersionUID = 1L;

	// Ŭ���̾�Ʈ�� ��û�� �ϸ� �����̳ʿ� ���ؼ� �ڵ� ȣ��Ǵ� �Լ�..
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		// �����ϰ��� �ϴ� ������ �ۼ�.

		/*
		 * ���������� ������ �ұ�..
		 * �����ȭ�� ���³�! �� ���
		 * 
		 * �ܼ�â���� ��ȭ������ ���� ���� ���ô�..
		 * 
		 * DD ���� �ۼ� ���� ::
		 * ���� ���� �̸� : BasicServlet
		 * Ŭ���̾�Ʈ�� url�� ��û�ϴ� �̸� : Basic
		 */
		response.setCharacterEncoding("euc-kr");
		PrintWriter out = response.getWriter();

		out.println("<h2> ������ �ұ� �Դϴ�..</h2><br>");
		out.println("<h3> ���� ��ȭ�� ���� ��!</h3><br>");
		System.out.println("��ȭ�������� �� ���� ���ô�.");
		out.close();
	}
}
