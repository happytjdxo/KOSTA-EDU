package user.exception.step7.test;

/*
 * 사용자정의 Exception ::
 * 1. 특정한 조건이 만족될때 고의적으로 Exception을 내가 발생시키는 것
 *                    (Exception 객체를 생성..이때 new 앞에 throw 사용)
 * 2. Exception api를 사용하는 것이 아니라, 
 *      상속받아서 내가 직접 Exception 클래스를 정의해서 사용하는 것 
 */

class ZeroNotDevide extends Exception {

	// 생성자 앞에 super,this키워드를 사용해서 완벽한 클래스로 다시 작성
	
	ZeroNotDevide() {
		this("분모가 0이면 안되요!!");
	}

	public ZeroNotDevide(String message) {
		super(message); // Exception(String message);
	}

}

class User {
	public void go() throws ZeroNotDevide {
		int i = 0;
		int j = 10;
		if (i == 0)
			throw new ZeroNotDevide("분모가 0이면 안되요!!"); // 여기서 사제 폭탄이 터짐...
	}
}

public class UserExceptionTest7 {
	public static void main(String[] args) {
		User user = new User();
		System.out.println("폭탄이 이리로 날라옵니다");
		try {
			user.go();
		} catch (ZeroNotDevide e) {
			// System.out.println("폭탄 잡았음....");
			System.out.println(e.getMessage());
		}
		System.out.println("사제 폭탄 처리 끝");
	}
}