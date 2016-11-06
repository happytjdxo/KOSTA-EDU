package fly.step1;
/*
 *  interface를 상속할 자식 클래스이다.
 *  부모가 interface 이기 때문에 추상메소드를 모두 구현해야 한다.
 *  만약에 하나라도 빠뜨리고 구현하지 않은것이 있다면 Bird는 추상클래스로 된다.
 *  클래스와 인터페이스는 implements
 */
public class Bird extends Animal implements Flyer{
	
	@Override
	public void fly() {
		System.out.println("새가 난다.");
	}

	@Override
	public void take_off() {
		System.out.println("새가 이륙 한다.");
	}

	@Override
	public void land() {
		System.out.println("새가 착륙 한다.");
	}
	// 자기 자신만의 기능..
	public String layEggs(){
		return "알을 깐다.";
	}
	
	public String buildNest(){
		return "둥지를 짓다.";
	}
}
