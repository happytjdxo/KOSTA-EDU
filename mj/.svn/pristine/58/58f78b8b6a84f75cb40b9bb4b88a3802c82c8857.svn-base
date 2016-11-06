package step2.test;
/*
 * 해당 소스는 static은 static끼리 통한다..는 의미를 알수 있는 코드로 작성.
 * static 블럭 안에서는 this를 사용하지 못한다.
 */
public class StaticExamTest2 {
	int i = 10;	//field
	static int j = 20; // static v, Class V, 전역 V
	
	public void test(){
		System.out.println("member V :: " + i);	// 10
		System.out.println("static V :: " + j);	// 20
	}

	/*
	 *  static 은 static 끼리 통한다.!!
	 *  non-Static 변수를 접근할려면 객체생성(메모리 올리고) 하고 접근해야 한다.
	 */
	
	public static void test2(){
		//System.out.println("member V :: " + i);	// 10
		System.out.println("static V :: " + j);	// 20
		System.out.println("static V :: " + StaticExamTest2.j);	// 20
		StaticExamTest2 test2 = new StaticExamTest2();
		System.out.println("static V :: " + test2.i);	// 10
	}

	public static void main(String[] args) {
		//StaticExamTest2 test2 = new StaticExamTest2();
		test2();	// 바로 호출 가능..
		StaticExamTest2 fff2 = new StaticExamTest2();
		fff2.test();
		
		// this.i = 100;	//객체 자기자신
		StaticExamTest2.j = 200;
	}

}
