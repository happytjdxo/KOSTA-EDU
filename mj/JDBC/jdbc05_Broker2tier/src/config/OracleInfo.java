package config;
// Oracle ������ ���� ������� ������ �����ϴ� Ʋ..
public interface OracleInfo {

	//Ư���� ��������� �̷���� ��Ÿ ����Ÿ�� ������ ��� �������̽��� �и� ���״�.
	
	String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	String URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String USER = "scott";
	String PASS = "tiger";
}
