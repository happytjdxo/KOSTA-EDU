package switchcondition.step1.test;

public class ScoreSwitchTest1 {
	public static void main(String[] args) {
		// Math 클래스의 random() 사용해서 1~10까지의 값이 할당.
		int score = (int)(Math.random() * 10 + 1);	
		System.out.println("Score :: " + score * 10);
		switch(score * 10){
		case 100:
		case 90 : 
			System.out.println("A");
			break;
		case 80:
		case 70:
			System.out.println("B");
			break;
		case 60:
		case 50:
		case 40:
			System.out.println("C");
			break;
		default:
			System.out.println("Try~~");
		}
	}

}
