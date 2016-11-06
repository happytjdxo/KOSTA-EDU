package jdbc4.step1.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/* step1
 * ::
 * 1. 새로 만든 scott 계정에 테이블을 다시 작성
 * 2. 어제 한 예제(jdbc01)에서는 url, user, password의 값이 
 *    프로그램안에서 하드코딩 되어져 있었다.
 *    이런값들은 언제라도 변경되어지는 값이 아니다
 *    --> 상수값으로 만들어서 세팅하겠다. 
 *    -->static final을 지정하자
 *    -->변수명은 대문자로 선언해서 상수임을 명료히 하자.
 * 3. 어제 한 예제(jdbc01)에서는 member 라는 테이블을 사용했다
 *    이때 각각의 record를 구분하는 기본키(값)을 부여하지 않았기에 때문에
 *    동일한 사람을 추가하면 에러가 나는 것이 아니라 두번 들어가는 현상이
 *    발생했다...알고는 있자.
 *    --> 이번에도 마찬가지로 insert/delete/update문을 작성하고 실행한 다음에는
 *        반드시 주석으로 처리합시다.
 * ---------------------member table creating------------------------
 * DDL (Data Definition Language)
 * CREATE TABLE member(
 * 				id varchar2(20),
 * 			    name varchar2(30),
 *              age number(3));
 * 
 * DML (Data Manuplation Language) : SELECT문은 제외
 * INSERT INTO member (id, name, age) VALUES('kim','김제동',40);
 * INSERT INTO member VALUES('lee','이경규',53);
 * DELETE~
 * UPDATE~
 */
/*
 * DB 접근하는 로직을 Business Logic이라 한다.
 * 이러한 Business Logic을 가지고 있는 클래스를 DAO라고 부른다.
 * DAO :: Data(Base) Aceess Objetc
 */
public class JDBC4StepTest1 {
	Connection conn;
	Statement st;
	ResultSet rs;
	
	static final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	static final String USER = "scott";
	static final String PASS = "tiger";
	
	JDBC4StepTest1()throws Exception{
		//1. 드라이버 로딩
		Class.forName(DRIVER_NAME);
		System.out.println("Driver Loading.....");
		
		//2. 디비연결
		conn = DriverManager.getConnection(URL, USER, PASS);
		System.out.println("db conn.....");
		
		//3. Statement 생성
		st = conn.createStatement();
		System.out.println("statement creating....");
		
		//5. insert문을 작성 + 실행
		/*String query1="INSERT INTO member VALUES('sung','성유리',31)";
		int row=  st.executeUpdate(query1);
		System.out.println(row+" row insert ok....");*/
		
		//6. delete 문을 작성 + 실행
		/*String query1 = "DELETE FROM member WHERE name='김제동'";
		int row = st.executeUpdate(query1);
		System.out.println(row+" row delete ok....");*/
		
		//7. id가 lee인 사람의 이름을 James'lee로 변경
		String query1 = "UPDATE member SET name='James''lee' WHERE id='lee'";
		int row = st.executeUpdate(query1);
		System.out.println(row+" row update ok...");
		
		//4. select문을 작성 + 실행 해서 콘솔로 출력
		String query = "SELECT name FROM member";
		rs = st.executeQuery(query);
		
		//김제동 row만을 출력
		/*rs.absolute(2); //2번째 줄
		System.out.println(rs.getString("id")+"\t"+rs.getString("name"));*/
		
		while(rs.next()){
			System.out.println(rs.getString("name"));
		}
		
	}
	public static void main(String[] args)throws Exception {
		new JDBC4StepTest1();
	}
}















