package pizza.parent;
/*
 *  추상클래스의 용도 ::
 *  1. 피자를 만들어 내기 위한, 공통적인 작업(field, method)은 자식에게 물려주고
 *  	--> 피자를 만들어 내기 위한 90%의 공통의 설계도
 *  2. 반면에 다양한 종류의 피자가 만들어 지기위한 결정적인 부분은 template(구멍, 가로)로
 * 		선언해 둔다.
 * 
 * 현업 Project의 경우를 생각해보자.
 * 설계자 : Pizza의 template부분을 작성.
 * 코더들 : PotatoPizza, PineApplePizza, CheezePizza
 * 실제 클래스를 작성하는 사람이 여러명일 경우,
 * 각각의 실제 자식클래스를 어떤 강제사항도 두지 않으면 서로 제각각의 
 * 클래스를 만들어 낼 수 밖에 없다.(필드, 메소드..)
 * 이런 것들을 동일한 Template안에서 강제사항으로 묶어 둘수 있는 요소가
 * 추상 클래스의 사용법에서 중요한 역할을 한다.
 */
abstract public class Pizza {

	protected int price;
	protected String storeMaker;
	
	public Pizza(){}
	public Pizza(int price, String storeMaker) {
		this.price = price;
		this.storeMaker = storeMaker;
	}
	
	public void makeDough(){
		System.out.println("피자 반죽과 함께 도우를 만들다.");
	}
	
	public void baking(){
		System.out.println("180 도에서 구워낸다.");
	}
	
	public void cutting(){
		System.out.println("8등분으로 조각낸다.");
	}
	
	public void boxing(){
		System.out.println("종이 박스에 담는다.");
	}
	
	abstract public void topping();
	
	@Override
	public String toString() {
		return storeMaker + " " + price + "won";
	}
	
	public void makePizza(){
		makeDough();
		baking();
		cutting();
		boxing();
	}
}
