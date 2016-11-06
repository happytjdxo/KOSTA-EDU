package string.test;

/*
 * String class의 메소드 ::
 * length(), replace(), subString()
 */
public class StringTest33 {
	public static void main(String[] args) {
		System.out
				.println("========== length(), replace(), subString() ==========");
		String str = "김연아";
		//str의 문자열의 길이 : XXX
		System.out.println("1. str의 문자열의 길이 : " + str.length());

		// 아--> 경 으로 수정.
		System.out.println(" ");
		System.out.println(" ");
		String str2 = str.replace('아','경');
		System.out.println("2. 김연아 --> 김연경 으로 변경 : " + str2);
		
		// 연경만 추출해서 출력되도록
		System.out.println(" ");
		System.out.println(" ");
		String str3 = str2.substring(1,3);
		System.out.println("3. 김연경 --> '연경 '만 출력 : " + str3);
		// 결과적으로 str, str2, str3 객체가 계속 생성된 것이고 str은 변함이 없었다.
		
		System.out.println("\n ========== trim() : 문자열의 앞뒤 공백을 제거 ==========");
		
		// 가운데 공백을 주느냐 안주느냐의 여부에 따라 s1과 s2, s3를 구분했다.
		String s1 = "제임스고슬링";
		String s2 = " 제임스 고슬링";
		String s3 = "제임스 고슬링 ";

		System.out.println(" ");
		System.out.println(" ");
		String ss = s2.trim();
		System.out.println("4. 앞에 빈공간 지우기 ' 제임스 고슬링' --> '제임스 고슬링'으로 변경 :" + ss);
		
		System.out.println("\n ===== 가운데 공백은 어떻게 제거할까? =====");

	}
}
