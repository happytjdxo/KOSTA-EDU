package jdb.step1.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * ========================== JDBC 4단계 ==========================
 * 
 * 1. Driver Loading.
 * 2. DB연결.
 * 	  Conncetion conn = DriverManager.getConnection();
 * ----------------------------------------------------------------
 * db에 데이타를 넣고(insert) 빼고(delete) 수정(update) 가져올수(select) 있다.
 * :: CRUD 작업이라 한다.
 * :: CRUD 작업은 sql문으로 한다.
 * ----------------------------------------------------------------
 * ex) create table member(name vachar2(20));
 * 
 * 3. Statement 객체 생성.
 * 	  Statement st = conn.createStatement();
 * 	  
 * 4. sql문 실행.. sql문을 이용해서 데이타를 디비에 CRUD	한다.
 * 	  ResultSet rs = st.executeQuery("sql문");
 * 	  int row = st.execyteUpdate("sql문");
 */
 
   public class DBConnectionTest3 {
  DBConnectionTest3() throws Exception {
	  // 1. 드라이버 로딩..
	  Class.forName("oracle.jdbc.driver.OracleDriver");
	  System.out.println("1. 드라이버 로딩 성공");
	  // 2. 디비 연결..
	  String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";	// sid
	  String user = "hr";
	  String pass = "hr";
	  Connection conn = DriverManager.getConnection(url, user, pass);
	  System.out.println("2. 디비 연결 성공");
	  
	  Statement st = conn.createStatement();
	  System.out.println("3. Statement 생성..");
	  
	  //member라는 테이블 생성.. 데이타가 없다.. 데이타부터 insert 하겠다.
	  // String query = "INSERT INTO member VALUES('kosta104', '박과장', 34)";	// query문 작성
	  // int row = st.executeUpdate(query);									// query문 수행
	  
	  String query = "INSERT INTO member VALUES('kosta104', '최민재', 28)";	// query문 작성
	  int row = st.executeUpdate(query);									// query문 수행
	  
	  
	  
	  System.out.println("insert ok.." + row);
  }
  

	public static void main(String[] args) throws Exception{
		new DBConnectionTest3();
	}
}
