package jdbc.step1.test;
/*
 * step1 :
 * 디비와 연결하는 프로그램을 작성하려면 제일 먼저,
 * 서버에 대한 정보를 담고 있는 드라이버가 프로그램이 실행되는 측의
 * 메모리에 떠 있어야 한다.
 * 이 정보를 바탕으로 클라이언트의 프로그램은 디비 서버와 연결될수 있다.
 * 이 과정이 드라이버 로딩  단계이다.
 */
public class DriverLoadingTest1 {
	DriverLoadingTest1(){
		//드라이버 로딩하기...
		//1. 드라이버 이름....FQCN
		//2. ~.jar 파일의 classpath가 잡혀져 있지 않다.
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공....");
		}catch(ClassNotFoundException e){
			System.out.println("드라이버 로딩 실패....");
		}
	}
	public static void main(String[] args) {
		new DriverLoadingTest1();
	}
}





