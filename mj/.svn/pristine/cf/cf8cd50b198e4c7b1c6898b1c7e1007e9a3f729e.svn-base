package prob;

public class StringProb3 {
	public static void main(String[] args) {
		System.out.println("<< 첫 번째 메시지 >>");
		handleMessage("PROD-00001:iPhone4:940000:4:애플");
		System.out.println("<< 두 번째 메시지 >>");
		handleMessage("PROD-00002:갤럭시S:960000:삼성");
	}

	private static void handleMessage(String string) {
	// 구현하세여...
		String[] str = string.split(":");
		if(str.length == 5){
			System.out.println("제품아이디 : " +str[0]);
			System.out.println("제품명 : " +str[1]);
			System.out.println("가격 : " +str[2]);
			System.out.println("수량 : " +str[3]);
			System.out.println("제조사 : " +str[4]);
		}else{
			System.out.println("메시지 형식이 잘못되었습니다.");
			System.out.println("메시지 형식은 제품명:가격:수량:제조사 형식이어야 합니다.");
		}

	}
}
