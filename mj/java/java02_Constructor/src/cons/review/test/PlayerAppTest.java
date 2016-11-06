package cons.review.test;

import cons.review.Player;

public class PlayerAppTest {
	public static void main(String[] args) {

		System.out.println("===== Player Information ===== \n");
		// 1. p1, p2, p3 라는 이름으로 선수를 각각 세명 생성 : 값을 이때 직접 주입
		
			Player p1 = new Player("최민재", 9600.5, "범박", true);
			Player p2 = new Player("김준성", 9500.5, "역곡", true);
			Player p3 = new Player("기러기", 90.5, "서울", false);
			
		System.out.println("===== Player Year Salary ===== \n");
		// 2. 각각 선수들의 연봉을 출력
		
		System.out.println(p1.getPlayerDetails() + " : " + p1.getYearsalary());
		System.out.println(p2.getPlayerDetails() + " : " + p2.getYearsalary());
		System.out.println(p3.getPlayerDetails() + " : " + p3.getYearsalary());
		
		System.out.println("===== Player Is Manager? ===== \n");
		// 3. 각각 선수들의 매니저 여부를 출력
		
		System.out.println(p1.getIsManager());
		System.out.println(p2.getIsManager());
		System.out.println(p3.getIsManager());
		
		
	}

}
