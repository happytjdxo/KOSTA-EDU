package prepare.step3.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrepareStatementTest3 {
	Connection conn;
	Statement st;
	ResultSet rs;
	
	static final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	static final String USER = "scott";
	static final String PASS = "tiger";
	PrepareStatementTest3()throws Exception{
		//1. 드라이버 로딩
		Class.forName(DRIVER_NAME);
		System.out.println("Driver Loading.....");
						
	}
	public void updateMember(String id, String name, int age)throws SQLException{
		conn = DriverManager.getConnection(URL, USER, PASS);
		System.out.println("db conn....");
		
		st = conn.createStatement();
		System.out.println("statement creating...");
		
		/*String query = "UPDATE member SET name="+"name"+" WHERE id="+"id";
		int row = st.executeUpdate(query);
		System.out.println(row+" rwo update ok....");*/
	}
	public static void main(String[] args) throws Exception{
		PrepareStatementTest3 test3 = new PrepareStatementTest3();
		test3.updateMember("lee", "James'lee", 53);
	}
}











