package config;
//Oracle 서버에 대한 상수값의 정보를 저장하는 틀...
public interface OracleInfo {
	String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	String URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String USER = "hr";
	String PASS = "hr";
}
