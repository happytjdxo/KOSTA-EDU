package jdbc.step1.test;
/*
 * step1 :
 * ���� �����ϴ� ���α׷��� �ۼ��Ϸ��� ���� ����,
 * ������ ���� ������ ��� �ִ� ����̹��� ���α׷��� ����Ǵ� ����
 * �޸𸮿� �� �־�� �Ѵ�.
 * �� ������ �������� Ŭ���̾�Ʈ�� ���α׷��� ��� ������ ����ɼ� �ִ�.
 * �� ������ ����̹� �ε�  �ܰ��̴�.
 */
public class DriverLoadingTest1 {
	DriverLoadingTest1(){
		//����̹� �ε��ϱ�...
		//1. ����̹� �̸�....FQCN
		//2. ~.jar ������ classpath�� ������ ���� �ʴ�.
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����....");
		}catch(ClassNotFoundException e){
			System.out.println("����̹� �ε� ����....");
		}
	}
	public static void main(String[] args) {
		new DriverLoadingTest1();
	}
}





