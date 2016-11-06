package metadata.step6.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import config.OracleInfo;

/*
 * MetaData 
 * ::
 * 디비서버, 서버에 대한 정보 혹은 기타 다른정보(sql문)를 별도의 파일로
 * 저장해서 관리하는 데이타.
 * 특히, 스트링 상수값 같은 조각 정보들을 저장하는 데이타이다.
 * 이때 Map 방식을 주로 이용하고 값들은 스트링으로 저장된다.
 * ex) db.properties / conn.properties
 * -----------------------------------------------------------
 * select * from tab; //모든 테이블 출력
 * 특정한 디비 테이블에 대한 정보를 다루는 클래스 ---> ResultSetMetaData
 * 
 */
public class ResultSetMetaTest6 {
	//초기화 작업...
	ResultSetMetaTest6()throws Exception{
		Class.forName(OracleInfo.DRIVER_NAME);
		System.out.println("드라이버 로딩...");
	}
	public  Connection dbConnect() throws SQLException{
		Connection conn = DriverManager.getConnection(OracleInfo.URL, 
													  OracleInfo.USER, 
													  OracleInfo.PASS);
		System.out.println("디비 연결 성공...");
		return conn;
	}
	public void showTableInfo(String tableName)throws Exception{
		Connection conn = null;
		PreparedStatement ps=  null;
		ResultSet rs = null;
		
		conn = dbConnect();
		String query = "SELECT * FROM "+tableName;
		ps = conn.prepareStatement(query);
		rs=ps.executeQuery();
		
		// 테이블의 정보를 알수있는 ResultSetMetaData를 리턴받는 기능을....
		//rs에 기능을 사용해서 ResultSetMetaData를 하나 받아오자.
		ResultSetMetaData mData=rs.getMetaData();
		
		//1. 해당 테이블의 컬럼의 갯수를 출력
		int count =mData.getColumnCount();
		System.out.println("컬럼들의 갯수 : "+ count);
		
		//2. for문을 이용해서 테이블의 모든 컬럼명을 다 출력
		for(int i=1; i<=count; i++){
			System.out.print(mData.getColumnName(i)+"\t");
		}
		//3. while문을 이용해서 컬럼들에 대한 값들을 다 출력		
		while(rs.next()){ //row를 내려줘야 한다.
			System.out.println("");
			for(int i=1; i<=count; i++){
				System.out.print(rs.getString(i)+"\t");
			}
		}
		
		rs.close();
		ps.close();
		conn.close();
	}
	public static void main(String[] args)throws Exception {
		ResultSetMetaTest6 test6 = new ResultSetMetaTest6();
		test6.showTableInfo("member");
	}
}





















