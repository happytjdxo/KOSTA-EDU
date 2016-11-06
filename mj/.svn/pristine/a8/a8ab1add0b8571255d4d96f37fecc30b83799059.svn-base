package exception.runtime.step6.test;

/*
 * 	사용자정의 Exception 에 대해서..
 * 	고의적으로 특정 조건에 합당하면 내가 폭탄을 터트릴 수 있다.
 *	이렇게 함으로써 문장의 흐름을 강하게 제어한다.
 */
class Throw2 {
	public void go() {
		int i = 0;
		int j = 30;
		if (i == 0) {
			// 폰탄을 터뜨린다.
			new ArithmeticException();
		}
	}
}

public class ThrowsTest7 {
	public static void main(String[] args) {
		Throw2 th2 = new Throw2();
		try {
			th2.go();
		} catch (ArithmeticException e) {
			System.out.println("막음");
		}
	}
}
