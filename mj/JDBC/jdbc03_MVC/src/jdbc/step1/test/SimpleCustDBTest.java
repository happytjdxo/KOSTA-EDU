package jdbc.step1.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import config.OracleInfo;

/*
 * jdbc ���α׷��� ������(DAO/VO/Test)���� �ۼ��ϱ⿡ �ռ�
 * Simple�ϰ� ������ �ϴ� �ۼ��غ��ڴ�...�׷� ������ ���������� ����(step2)
 * �� �ܼ��ϰ� �����Ͻ� ������ �ۼ��ϰڴٴ� �ǹ��̴�.
 * ---------------------------------------------------------------------
 * ���̺� ����
 
  DROP TABLE customer purge;
  CREATE TABLE customer(
  name varchar2(20),
  age number(3),
  height number(3),
  weight number(3),
  gender char(5));    
 */
public class SimpleCustDBTest {
	SimpleCustDBTest()throws ClassNotFoundException{
		Class.forName(OracleInfo.DRIVER_NAME);
		System.out.println("1. Driver Loading....");
	}//������
	
	//�������� ���...1. DB����
	public Connection getConn() throws SQLException{
		Connection conn = DriverManager.getConnection(OracleInfo.URL, 
				   OracleInfo.USER, 
				   OracleInfo.PASS);
		System.out.println("DB Connecting.....OK....");
		return conn;
	}
	
	//�������� ���...2. close()
	public void closeAll(Connection conn, PreparedStatement ps)
			throws SQLException{
		if(ps != null) ps.close();
		if(conn != null) conn.close();
	}
	public void closeAll(Connection conn, PreparedStatement ps, ResultSet rs)
			throws SQLException{
		if(rs != null) rs.close();
		closeAll(conn,ps);
	}
	
	public void insertCustomer
			(String name, int age, int height, int weight,String gender)
				throws SQLException{
		/*
		 * jdbc 2�ܰ� ~ 5�ܰ� ������ ������ �ۼ��Ǿ�� �Ѵ�.
		 * 2�ܰ� : ��񿬰�
		 * 3�ܰ� : ������ �ۼ�, PreparedStatement ��ü ����
		 * 4�ܰ� : ������ ����
		 * 5�ܰ� : �ڿ��� �ݴ´�...close()
		 */
		Connection conn = null;
		PreparedStatement ps = null;
		conn = getConn();
		
		String addQuery = "INSERT INTO customer VALUES(?,?,?,?,?)";
		ps = conn.prepareStatement(addQuery);
		ps.setString(1, name);
		ps.setInt(2, age);
		ps.setInt(3, height);
		ps.setInt(4, weight);
		ps.setString(5, gender);
		
		int row = ps.executeUpdate();
		System.out.println(row+" ���� "+ name +" ���� �߰���!!");
		
		closeAll(conn, ps);
	}
	public void deleteCustomer(String name)throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		conn = getConn();
		
		String delQuery = "DELETE FROM customer WHERE name=?";
		ps = conn.prepareStatement(delQuery);
		ps.setString(1, name);
		int row = ps.executeUpdate();
		
		System.out.println(row+" �� " +name+" ���� ����!!");
		closeAll(conn, ps);
	}
	public void updateCustomer
			(String name, int age, int height, int weight,String gender)
					throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		conn = getConn();
		
		String upQuery = "UPDATE customer SET age=?, height=?,weight=?"
						+ "	WHERE name=?";
		ps= conn.prepareStatement(upQuery);
		ps.setInt(1, age);
		ps.setInt(2, height);
		ps.setInt(3, weight);
		ps.setString(4, name);
		
		int row = ps.executeUpdate();
		System.out.println(row+" ���� ������ ����...!!");
		closeAll(conn, ps);
	}
	public void printAllCustomer()throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn = getConn();
		
		String allQuery = "SELECT * FROM customer";
		ps = conn.prepareStatement(allQuery);
		rs = ps.executeQuery();
		while(rs.next()){
			System.out.println(rs.getString(1)+"\t"+rs.getInt(2));
		}
		closeAll(conn, ps, rs);		
	}
	public void printACustomer(String name)throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		conn = getConn();
		String aQuery = "SELECT * FROM customer WHERE name=?";
		ps = conn.prepareStatement(aQuery);
		ps.setString(1, name);
		rs = ps.executeQuery();
		if(rs.next()){
			System.out.println(rs.getString(1)+"\t"+rs.getInt(2));
		}
	}
	public static void main(String[] args)
					throws ClassNotFoundException,SQLException {
		
		SimpleCustDBTest simple = new SimpleCustDBTest();
		//simple.insertCustomer("�嵿��", 42, 182, 78, "��");
		//simple.insertCustomer("����", 33, 184, 70, "��");
		//simple.deleteCustomer("����");
		//simple.updateCustomer("�嵿��", 44, 180, 78, "��");
		//simple.printAllCustomer();
		//simple.printACustomer("�̳���");
	}
}