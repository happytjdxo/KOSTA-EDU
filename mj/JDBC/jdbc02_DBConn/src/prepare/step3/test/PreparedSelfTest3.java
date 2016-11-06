package prepare.step3.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import config.OracleInfo;

/*
 * 조건 ::
 * 1. OracleInfo의 상수값을 사용
 * 2. PreparedStatement를 사용 ::
 * ---------------------------------------
 * 1) id가 kim인 사람의 이름과 나이를 김제똥, 46으로 수정---query1
 * 2) id가 kosta's 인 사람을 member 테이블에서 삭제 ---query2
 * 3) member 테이블에 모든 데이타를 가져와서 직접 콘솔로 출력해서 확인하는
 *    로직을 작성
 * 
 */
public class PreparedSelfTest3 {
	public static void main(String[] args) throws Exception{
		Class.forName(OracleInfo.DRIVER_NAME);
		System.out.println("드라이버 로딩...");
		
		Connection conn=  
				DriverManager.getConnection(OracleInfo.URL, 
											OracleInfo.USER, 
											OracleInfo.PASS);
		System.out.println("디비 연결 성공....");	
		
		//수정의 대상은 기본키를 제외한 모든 컬럼들이다.
/*		String query1 = "UPDATE member SET name=? , age=? WHERE id=?";
		PreparedStatement ps = conn.prepareStatement(query1);
		
		ps.setString(1, "김제똥");
		ps.setInt(2, 46);
		ps.setString(3, "kim");
		
		int row = ps.executeUpdate();
		System.out.println(row+" row UPDATE ok!!");*/
		
/*		String query2 = "DELETE FROM member WHERE id=?";
		PreparedStatement ps = conn.prepareStatement(query2);
		
		ps.setString(1, "kosta's");		
		int row = ps.executeUpdate();
		System.out.println(row+" row DELETE ok!!");*/
		
		String query3 = "SELECT id, name FROM member";
		PreparedStatement ps = conn.prepareStatement(query3);		
		
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			System.out.println(rs.getString("id")+"\t"+rs.getString("name"));
		}
	}
}









