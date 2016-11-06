package properties.step5.test;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;



/*
 * 인터페이스에 서버의 정보를 상수값으로 저장하는 방식을 넘어서
 * 이번에는 Map방식의 Properties 파일에 스트링값으로 서버의 정보를 저장
 * 이름과 값이 쌍으로 저장되는데....
 * 이런 방식이 프로그램에서 어떻게 발전되어 갈수 있는지를 잘 살펴 보아야 한다.
 * ::
 * 1. 서버정보와 프로그램 로직의 완벽한 분리가 일어난다.
 * 2. sql 쿼리문과 프로그램 로직의 분리도 완벽하게 일어난다.
 */
public class PropertiesDBTest5 {
	public static void main(String[] args)throws Exception{
		Properties p = new Properties();
		p.load(new FileInputStream("src/config/db.properties"));
		String driverName = p.getProperty("jdbc.oracle.driver");
		String url = p.getProperty("jdbc.oracle.url");
		String user = p.getProperty("jdbc.oracle.user");
		String pass = p.getProperty("jdbc.oracle.pass");
		///////////////////////////////////////////////////////////
		String insertQuery = p.getProperty("jdbc.sql.insert");
		String deleteQuery = p.getProperty("jdbc.sql.delete");
		String selectQuery = p.getProperty("jdbc.sql.select");
		
		Class.forName(driverName);
		System.out.println("driver Loading...");
		
		Connection conn=DriverManager.getConnection(url, user, pass);
		System.out.println("db conn....ok..");
		
		//insert문 작성...
		PreparedStatement ps=conn.prepareStatement(insertQuery);
		//바인딩
		ps.setString(1,"kosta");
		ps.setString(2,"ko77");
		ps.setString(3,"하바리");
		ps.setString(4,"서현동");
		
		//쿼리문 실행
		int row = ps.executeUpdate();
		System.out.println(row+" row INSERT OK!!");
		
		/*
		 * delete와  select를 알아서 작성해보세여...
		 */

	}
}


















