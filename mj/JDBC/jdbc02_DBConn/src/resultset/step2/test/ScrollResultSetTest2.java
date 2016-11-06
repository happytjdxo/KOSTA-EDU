package resultset.step2.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScrollResultSetTest2 {
	Connection conn;
	Statement st;
	ResultSet rs;
	
	static final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	static final String USER = "scott";
	static final String PASS = "tiger";
	
	ScrollResultSetTest2()throws Exception{
		//1. ����̹� �ε�
		Class.forName(DRIVER_NAME);
		System.out.println("Driver Loading.....");
				
		//2. ��񿬰�
		conn = DriverManager.getConnection(URL, USER, PASS);
		System.out.println("db conn.....");
		
		//3. statement ����
		st=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		System.out.println("statement ����");
		
		//4.
		String query = "SELECT * FROM member";
		rs = st.executeQuery(query);
		
		//5. Ŀ���� ��ġ�� EOE�� ������ ������ �ۼ�
		System.out.println("=====afterLast()======");
		rs.afterLast();
		System.out.println(rs.isAfterLast());//eoe�̸�..true

		//6. rs�� �� �Ʒ� ����Ÿ ���� �������� ����Ÿ�� ��µǵ��� ������ �ۼ�
		if(rs != null){
			while(rs.previous()){ //next()�� �ݴ����..���� ����
				System.out.println(rs.getString("id")+"\t"
								  +rs.getString("name"));				
			}//while
		}//if
	}//������
	public static void main(String[] args) throws Exception{
		new ScrollResultSetTest2();
	}
}
















