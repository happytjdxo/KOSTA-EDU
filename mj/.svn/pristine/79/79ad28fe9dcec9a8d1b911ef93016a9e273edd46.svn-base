package jdb.step1.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * 1단계 : 드라이버 로딩
 * e2단계 : 디비연결
 */
public class DBConnectionTest2 {
	DBConnectionTest2(){
		// 1.드라이버 로딩.
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Fileloading..Ok!");
			
		// 2. 디비연결(특정한 디비서버의 주소로 직접 연결한다.)
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			Connection conn = DriverManager.getConnection(url, "hr", "hr");
			System.out.println("DB Connection Ok");
		
		}catch(ClassNotFoundException e){
			System.out.println("Driver Loading..fail..");
		
		}catch(SQLException e){
			System.out.println("DB Connection fail..");
		}
	}
	public static void main(String[] args) {
		new DBConnectionTest2();	//생성자 호출
	}
}
