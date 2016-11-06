package jdb.step1.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * ========================== JDBC 4�ܰ� ==========================
 * 
 * 1. Driver Loading.
 * 2. DB����.
 * 	  Conncetion conn = DriverManager.getConnection();
 * ----------------------------------------------------------------
 * db�� ����Ÿ�� �ְ�(insert) ����(delete) ����(update) �����ü�(select) �ִ�.
 * :: CRUD �۾��̶� �Ѵ�.
 * :: CRUD �۾��� sql������ �Ѵ�.
 * ----------------------------------------------------------------
 * ex) create table member(name vachar2(20));
 * 
 * 3. Statement ��ü ����.
 * 	  Statement st = conn.createStatement();
 * 	  
 * 4. sql�� ����.. sql���� �̿��ؼ� ����Ÿ�� ��� CRUD	�Ѵ�.
 * 	  ResultSet rs = st.executeQuery("sql��");
 * 	  int row = st.execyteUpdate("sql��");
 */
 
   public class DBConnectionTest3 {
  DBConnectionTest3() throws Exception {
	  // 1. ����̹� �ε�..
	  Class.forName("oracle.jdbc.driver.OracleDriver");
	  System.out.println("1. ����̹� �ε� ����");
	  // 2. ��� ����..
	  String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";	// sid
	  String user = "hr";
	  String pass = "hr";
	  Connection conn = DriverManager.getConnection(url, user, pass);
	  System.out.println("2. ��� ���� ����");
	  
	  Statement st = conn.createStatement();
	  System.out.println("3. Statement ����..");
	  
	  //member��� ���̺� ����.. ����Ÿ�� ����.. ����Ÿ���� insert �ϰڴ�.
	  // String query = "INSERT INTO member VALUES('kosta104', '�ڰ���', 34)";	// query�� �ۼ�
	  // int row = st.executeUpdate(query);									// query�� ����
	  
	  String query = "INSERT INTO member VALUES('kosta104', '�ֹ���', 28)";	// query�� �ۼ�
	  int row = st.executeUpdate(query);									// query�� ����
	  
	  
	  
	  System.out.println("insert ok.." + row);
  }
  

	public static void main(String[] args) throws Exception{
		new DBConnectionTest3();
	}
}
