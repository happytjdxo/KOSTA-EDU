package prepare.step3.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import config.OracleInfo;

/*
 * ���� ::
 * 1. OracleInfo�� ������� ���
 * 2. PreparedStatement�� ��� ::
 * ------------------------------
 * 1) id�� kim�� ����� �̸��� ���̸� ������, 46���� ���� ---- query1
 * 2) id�� kosta's �� ����� member ���̺��� ����. ---- query2
 * 3) member ���̺� ��� ����Ÿ�� �����ͼ� ���� �ַܼ� ����ؼ� Ȯ���ϴ� ������ �ۼ�.
 */
public class PreparedSeltTest3 {

	public static void main(String[] args)throws Exception{
		Class.forName(OracleInfo.DRIVER_NAME);
		System.out.println("driver roading..");

		Connection conn = DriverManager.getConnection(OracleInfo.URL,
				OracleInfo.USER,
				OracleInfo.PASS);
		System.out.println("db connecting ok..");

		//������ ����� �⺻Ű�� ������ ��� �÷����̴�.
		/*String query1 = "update member set name = ?, age = ? where id = ?";
	      PreparedStatement ps = conn.prepareStatement(query1);
	      ps.setString(1, "������");
	      ps.setInt(2, 46);
	      ps.setString(3, "kim");
	      int row = ps.executeUpdate();
	      System.out.println(row+"row update");*/


		/*String query2 = "delete from member where id =?";
	      PreparedStatement ps = conn.prepareStatement(query2);
	      ps.setString(1, "kosta's");
	      int row = ps.executeUpdate();
	      System.out.println(row+"row delete");*/

		String query3 = "select id, name from member";
		PreparedStatement ps = conn.prepareStatement(query3);

		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			System.out.println(rs.getString("id")+"\t"+rs.getString("name"));
		}

	}
}
