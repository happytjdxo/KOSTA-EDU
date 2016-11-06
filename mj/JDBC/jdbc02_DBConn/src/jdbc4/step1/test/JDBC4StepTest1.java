package jdbc4.step1.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/* step1
 * ::
 * 1. ���� ���� scott ������ ���̺��� �ٽ� �ۼ�
 * 2. ���� �� ����(jdbc01)������ url, user, password�� ���� 
 *    ���α׷��ȿ��� �ϵ��ڵ� �Ǿ��� �־���.
 *    �̷������� ������ ����Ǿ����� ���� �ƴϴ�
 *    --> ��������� ���� �����ϰڴ�. 
 *    -->static final�� ��������
 *    -->�������� �빮�ڷ� �����ؼ� ������� ����� ����.
 * 3. ���� �� ����(jdbc01)������ member ��� ���̺��� ����ߴ�
 *    �̶� ������ record�� �����ϴ� �⺻Ű(��)�� �ο����� �ʾұ⿡ ������
 *    ������ ����� �߰��ϸ� ������ ���� ���� �ƴ϶� �ι� ���� ������
 *    �߻��ߴ�...�˰�� ����.
 *    --> �̹����� ���������� insert/delete/update���� �ۼ��ϰ� ������ ��������
 *        �ݵ�� �ּ����� ó���սô�.
 * ---------------------member table creating------------------------
 * DDL (Data Definition Language)
 * CREATE TABLE member(
 * 				id varchar2(20),
 * 			    name varchar2(30),
 *              age number(3));
 * 
 * DML (Data Manuplation Language) : SELECT���� ����
 * INSERT INTO member (id, name, age) VALUES('kim','������',40);
 * INSERT INTO member VALUES('lee','�̰��',53);
 * DELETE~
 * UPDATE~
 */
/*
 * DB �����ϴ� ������ Business Logic�̶� �Ѵ�.
 * �̷��� Business Logic�� ������ �ִ� Ŭ������ DAO��� �θ���.
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
		//1. ����̹� �ε�
		Class.forName(DRIVER_NAME);
		System.out.println("Driver Loading.....");
		
		//2. ��񿬰�
		conn = DriverManager.getConnection(URL, USER, PASS);
		System.out.println("db conn.....");
		
		//3. Statement ����
		st = conn.createStatement();
		System.out.println("statement creating....");
		
		//5. insert���� �ۼ� + ����
		/*String query1="INSERT INTO member VALUES('sung','������',31)";
		int row=  st.executeUpdate(query1);
		System.out.println(row+" row insert ok....");*/
		
		//6. delete ���� �ۼ� + ����
		/*String query1 = "DELETE FROM member WHERE name='������'";
		int row = st.executeUpdate(query1);
		System.out.println(row+" row delete ok....");*/
		
		//7. id�� lee�� ����� �̸��� James'lee�� ����
		String query1 = "UPDATE member SET name='James''lee' WHERE id='lee'";
		int row = st.executeUpdate(query1);
		System.out.println(row+" row update ok...");
		
		//4. select���� �ۼ� + ���� �ؼ� �ַܼ� ���
		String query = "SELECT name FROM member";
		rs = st.executeQuery(query);
		
		//������ row���� ���
		/*rs.absolute(2); //2��° ��
		System.out.println(rs.getString("id")+"\t"+rs.getString("name"));*/
		
		while(rs.next()){
			System.out.println(rs.getString("name"));
		}
		
	}
	public static void main(String[] args)throws Exception {
		new JDBC4StepTest1();
	}
}















