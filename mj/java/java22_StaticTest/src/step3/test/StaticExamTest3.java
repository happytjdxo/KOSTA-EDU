package step3.test;
/*
 * Member V 와 Class V의 차이점을 구분할 수 있는 로직.
 * Class V가 생성된 객체들이 공유한다는 의미를 다뤄보겠다.
 * 주로 Counting 할때 사용한다.
 */
class Member{
	static int counter;
	Member(){	//객체가 생성될때마다
		counter++;
	}
}
public class StaticExamTest3 {
	public static void main(String[] args) {
		Member mem1 = new Member();
		Member mem2 = new Member();
		Member mem3 = new Member();
		System.out.println("현재까지 생성된 객체의 숫자 :: " + Member.counter);
		System.out.println(mem1.counter);
		System.out.println(mem2.counter);
		System.out.println(mem3.counter);
	}
}


