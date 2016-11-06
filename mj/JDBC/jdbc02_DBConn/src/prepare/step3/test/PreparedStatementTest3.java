package prepare.step3.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import config.OracleInfo;

/*
 * step2 
 * ::
 * step1에서는 url, user, pass에 대한 값을 하드코딩--> 상수값
 * 상수값도 일종의 하드코딩이라고 볼수 있다...
 * 이것을 어떻게 해결할까?
 * ::
 * 특정한 값과 프로그램의 완벽한 분리 --> 인터페이스 사용
 */
public class PreparedStatementTest3 {
	public static void main(String[] args) throws Exception{
		Class.forName(OracleInfo.DRIVER_NAME);
		System.out.println("드라이버 로딩...");
		
		Connection conn=  
				DriverManager.getConnection(OracleInfo.URL, 
											OracleInfo.USER, 
											OracleInfo.PASS);
		System.out.println("디비 연결 성공....");
		
		//PreparedStatement 생성
		String query = "INSERT INTO member VALUES(?,?,?)";
		PreparedStatement ps=conn.prepareStatement(query); //pre compile
		
		//바인딩
		ps.setString(1,"kosta's");
		ps.setString(2,"James'Bond");
		ps.setInt(3, 69);
		
		//쿼리문 실행
		int row=ps.executeUpdate();
		System.out.println(row+" row INSERT ok!!");
		
		ps.close();
		conn.close();

	}
}

























