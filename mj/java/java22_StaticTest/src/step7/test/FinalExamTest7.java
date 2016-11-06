package step7.test;

/*
 * static 키워드와 final이란 키워드는 항상 같이 쓰는 경우가 많다.
 * super :: 부모 클래스의 멤버를 지칭할 때 사용.
 * this :: 해당 클래스 자기자신.
 * final :: "내가 마지막이야~~".
 * 
 * final 변수 - "내가 마지막 변수야~~"	--->	상수를 의미. 
 * final 메소드 - "내가 마지막 메소드야~~"	--->	오버라이딩 금지.
 * final 클래스 - "내가 마지막 클래스야~~"	--->	상속 금지.
 */
class A {
	static final int BASE_SALARY = 300; // 상수
	public final String test() {
		return "Overriding 금지";
	}
}

final class B { // 상속이 안됨.. 부모가 될 수 없다.

}

/*class C extends B {
}
 */
class D extends A{
	/*public final String test() {
		return "Overriding 금지";
	}*/		//오버라이딩 금지 확인 
}
public class FinalExamTest7 {
	public static void main(String[] args) {
		D d = new D();
		//d.BASE_SALARY = 3000;
		System.out.println("기본급 " + d.BASE_SALARY);
		System.out.println(d.test());
	}
}
