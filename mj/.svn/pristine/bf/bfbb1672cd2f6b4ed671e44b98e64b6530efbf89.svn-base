package user.exception.test;

/*
 *	사용자 정의 Exception은 프로그램의 흐름을 제어하는
 *	강력한 제어문으로 사용될 수 있다.
 *	그에 해당하는 로직을 작성해 보겠다.
 *	::
 *	19세 미만의 나이가 영화를 관람하면 입장이 안되도록 로직을 작성
 *	이때 사용자정의 Exception을 정의하자..	UserAgeException
 */
class UserAgeException extends Exception {
	public UserAgeException() {
		this("19세 미만 얼라는 꺼져 ");
	}

	public UserAgeException(String message) {
		super(message);
	}
	
}

class AdultMovie {
	public void enter(int age) throws UserAgeException {
		if (19 > age) {
			throw new UserAgeException("19세 미만 얼라는 꺼져 ");
		} else {
			System.out.println("Ticketing..입장");
			System.out.println("당신은 성인영화를 관람하실 수 있습니다.");
		}
	}
}

public class AdultMovieExceptionTest1 {
	public static void main(String[] args) {
		AdultMovie movie = new AdultMovie();
		try {
			movie.enter(34);
		} catch (UserAgeException e) {
			System.out.println(e.getMessage());
		}
	}
}

