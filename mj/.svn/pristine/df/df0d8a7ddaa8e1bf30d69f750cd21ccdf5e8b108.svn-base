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
		//1. 드라이버 로딩
		Class.forName(DRIVER_NAME);
		System.out.println("Driver Loading.....");
				
		//2. 디비연결
		conn = DriverManager.getConnection(URL, USER, PASS);
		System.out.println("db conn.....");
		
		//3. statement 생성
		st=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		System.out.println("statement 생성");
		
		//4.
		String query = "SELECT * FROM member";
		rs = st.executeQuery(query);
		
		//5. 커서의 위치를 EOE로 가도록 로직을 작성
		System.out.println("=====afterLast()======");
		rs.afterLast();
		System.out.println(rs.isAfterLast());//eoe이면..true

		//6. rs의 맨 아래 데이타 부터 위쪽으로 데이타가 출력되도록 로직을 작성
		if(rs != null){
			while(rs.previous()){ //next()의 반대방향..위로 돈다
				System.out.println(rs.getString("id")+"\t"
								  +rs.getString("name"));				
			}//while
		}//if
	}//생성자
	public static void main(String[] args) throws Exception{
		new ScrollResultSetTest2();
	}
}
















