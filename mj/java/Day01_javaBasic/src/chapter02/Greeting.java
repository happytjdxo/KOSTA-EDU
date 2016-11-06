package chapter02;

// 인사말을 출력하기 위한 클래스 .. 를 작성.
class Greeting{
	String greet = "Hello Java World~~";
	String greet2 = "Hello KOSTA";		// '='는 대입이다(값을 할당). 우측에서 왼쪽으로.

	public void printConsol () {
		System.out.println(greet);
	}
	public void printConsol2 () {
		System.out.println(greet2);
	}
} // class가 닫힘. 