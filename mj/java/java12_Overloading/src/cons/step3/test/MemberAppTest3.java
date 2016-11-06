package cons.step3.test;

import cons.step3.Member;
import cons.step3.RegisterDate;

public class MemberAppTest3 {
	public static void main(String[] args) {
		// 1. Member를 세명 생성.. m1, m2, m3
		// m1는 인자값 하나
		// m2는 ssn, tel
		// m3는 인자값 꽉 채워서

		/*Member m1 = new Member("0707");
		Member m2 = new Member("0707", 065);*/
		Member m3 = new Member("0707", "제임스", 065, "NewYork", "james@james.com",new RegisterDate(2015,5,6));

		// 2. m1은 헬스, m2는 요가,

		/*m1.register("Health");
		m2.register("요가");
		// m3는 암벽등반, 3레벨로 등록

		m2.register("암벽등반", 3);*/

		/*System.out.println(m1.getDetails());	// 기본값 출력
		System.out.println(m2.getDetails());	// 기본값 출력
		System.out.println(m3.getDetails());
		System.out.println(m3);
*/
	}
}
