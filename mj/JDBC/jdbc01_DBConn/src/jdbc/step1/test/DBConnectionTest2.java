package jdbc.step1.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * 1�ܰ� : ����̹� �ε�
 * 2�ܰ� : ��񿬰�
 */
public class DBConnectionTest2 {
	DBConnectionTest2(){
		
		try{
			//1.����̹� �ε�...
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loading....ok...");
			
			//2. ��� ����(Ư���� ��񼭹��� �ּҷ� ���� �����Ѵ�)
			String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
			Connection conn=DriverManager.getConnection(url,"hr","hr");
			System.out.println("DBConnection....ok...");
		}catch(ClassNotFoundException e){
			System.out.println("Driver Loading....fail...");
		}catch(SQLException e){
			System.out.println("DBConnection....fail...");
		}
	}
	public static void main(String[] args) {
		new DBConnectionTest2();
	}
}





