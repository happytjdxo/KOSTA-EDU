package exception.self3.test;

class MemberArray {
	public static void printMember(String name) throws DuplicateNameException {
		String[] names = { "서현", "유리", "아이유", "지나" };
		/*
		 * 구현.. 소녀시대 멤버들의 이름이 출력되고 실행시 입력받은 아이돌가수의 이름이 마지막에 출력되도록 로직을 작성
		 */
		for (int i = 0; i < names.length; i++) {
			if (name.equals(names[i]))
				throw new DuplicateNameException(name + " (이)라는 회원은 이미 저장되어 있습니다.");
		}

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println(name);
	}
}

class DuplicateNameException extends Exception {

	DuplicateNameException() {
		this("그런 사람 이미 있습니다.");
	}

	DuplicateNameException(String message) {
		super(message);
	}

}

public class MemberArrayTest3 {
	public static void main(String[] args) {
		// 이부분에서 예외가 발생....적어도 2개 발생...예외를 처리..
		// 하나는 api / 나머지 하나는 사제폭탄(DuplicateNameException)
		try {
			String str = args[0];// 실행시 아이돌 여자가수 이름을 하나 입력

			MemberArray.printMember(str);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("입력이 안되었습니다.. 실행시 회원 이름을 입력 바랍니다.");
		} catch (DuplicateNameException e) {
			System.out.println(e.getMessage());
		}
	}
}

/*
 * package exception.self3.test;
 * 
 * class MemberArray { public static void printMember(String name) throws
 * DuplicateNameException { String[] names = { "서현", "유리", "아이유", "지나" };
 * 
 * 구현.. 소녀시대 멤버들의 이름이 출력되고 실행시 입력받은 아이돌가수의 이름이 마지막에 출력되도록 로직을 작성
 * 
 * for (int i = 0; i < names.length; i++) {
 *  if (names[i].equals(name)) throw new
 * DuplicateNameException(name + " 라는 회원은 이미 저장되어 있습니다."); 
 * } for(int i =0;
 * i<names.length; i++){
 *  System.out.println(names[i]); 
 * }
 * System.out.println(name);
 *  } 
 * }
 * 
 * class DuplicateNameException extends Exception {
 * 
 * public DuplicateNameException(String message) {
 *  super(message); 
 *  }
 * 
 * }
 * 
 * public class MemberArrayTest3 { public static void main(String[] args) { //
 * 이부분에서 예외가 발생....적어도 2개 발생...예외를 처리.. // 하나는 api / 나머지 하나는
 * 사제폭탄(DuplicateNameException) try{ String str = args[0];// 실행시 아이돌 여자가수 이름을 하나
 * 입력
 * 
 * MemberArray.printMember(str); }catch(DuplicateNameException e){
 * System.out.println(e.getMessage()); 
 * }catch(ArrayIndexOutOfBoundsException d){
 * System.out.println(d.getMessage());
 *  		} 
 *  	} 
 *  }
 * 
 * 
 * 1.길이가 4인 String 배열에 차례대로 회원의 이름 “서현”,”유리”,”아이유”,”지나”가 저장되어 있습니다
 * 
 * 2.실행시 입력받은 값이 만약에 1에서 저장된 회원의 이름이면 DuplicateNameException 강제적으로 발생시키고 “XXX 라는
 * 회원은 이미 저장되어 있습니다” 가 출력되게 합니다
 * 
 * 3.만약에 배열에 이미 저장된 이름이 아닌,새로운 회원의 이름을 실행때 입력받게되면 기존 회원의 이름과 함께 마지막에 입력된 회원의 이름이
 * 함께 출력되도록 하세요
 * 
 * 4.명령형 매개변수가 입력되지 않는 경우도 예외로 처리할수 있도록 하세요. 그리고 예외를 처리하는 키워드 try, catch,
 * throws, throw 4가지 키워드를 모두 사용하세요
 * 
 * 5. 실행결과는 다음 페이지에 캡처되어 있습니다.(참고하세여)
 */

