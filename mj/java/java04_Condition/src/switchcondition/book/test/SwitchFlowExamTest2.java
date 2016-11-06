package switchcondition.book.test;
// 89page [예제 4-9]
// break 키워드의 사용 여부.
public class SwitchFlowExamTest2 {
	public static void main(String[] args) {
		int score = (int)(Math.random()*10)+1;
		String msg ="";

		score*=100;
		msg = "당신의 점수는 " + score + "이고, 상품은 ";
		switch(score){
		case 1000 :
			msg += "자전거, ";
		case 900 :
			msg += "TV, ";
		case 800 :
			msg += "노트북, ";
		case 700 :
			msg += "자전거, ";
		default :
			msg += "볼펜";
		}
		System.out.println(msg + "입니다.");
	}
}
