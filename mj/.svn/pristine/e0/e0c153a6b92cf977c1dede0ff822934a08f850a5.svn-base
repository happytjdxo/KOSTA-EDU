package exception.runtime.step2.test;

/*
 * Runtime 계열의 Exception
 * ArrayIndexOutOfBoundsException :: 배열의 인덱스 지정이 잘못됬을 경우 발생
 * NullPointerException :: 객체 생성하지 않고 접근 했을 경우 발생 
 */
public class RuntimeExceptionTest2 {
	public static void main(String[] args) {
		System.out.println("========= NullPointerException =========");
		String str = new String("KOSTA");
		str = null;

		try {
			System.out.println("Str의 길이 : " + str.length());
			System.out.println("Str의 주소값 : " + str.toString()); // Overriding
		} catch (NullPointerException e) {
			System.out.println("잡았다1");
		}
	}
}