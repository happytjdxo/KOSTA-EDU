package template.player.test;
/*
 * 해당 클래스에서는 추상클래스의 문법적인 사용법을 가볍게 살펴보도록 하자.
 */

// super class(부모)

class player{
	int volum;
	String maker;
	
	public void play(){
		System.out.println("가동시키다..");	
	}

	public void stop(){
		System.out.println("멈추다..");	
	}
	
}

//sub class(자식)

class Audio extends player{
	boolean audiance;
}

/*
 * Modifier ::
 * 1) Access Modifier - private, protected, public
 * 2) Usage Modifier - abstract, static, final
 *  위 둘의 위치는 누가 앞이건 뒤건 상관 없음.
 */

abstract class TV extends player{	// usage Modifier
	TV(String maker){
		this.maker = maker;
	}
	public abstract String concreteTv();	// template
}

//sub class of TV

class CaptionTV extends TV{
	CaptionTV(){
		super("CaptionTV");
	}
	public String concreteTv(){
		return "Captiontv concrete...";
	}
}

class PlateTV extends TV{
	PlateTV(){
		super("PlateTV");
	}
	public String concreteTv(){
		return "PlateTV concrete..";
	}
}

//main class

public class AbstractPlayerTest {
	public static void main(String[] args) {
		// TV tv = new TV("TV");	// abstract class는 객체 생성 대상이 안된다.
		TV captionTV = new CaptionTV();
		TV plateTV = new PlateTV();
		
		//Virtual Method Invocation
		System.out.println(captionTV.concreteTv());
		System.out.println(plateTV.concreteTv());
	}
}

/*
 * Abstract Class (추상 클래스 ) ::
 * 완벽한 클래스라 불릴 수 없는 이유는 
 * 필드와 구현부를 가진 기능을 가지고 있다.
 * 이외에도 구현부를 가지지 않는 추상메소드를 가질 수 있다.
 * 추상 메소드는 일종의 Template 역할을 하는데 추상클래스를 상속받은 자식들이
 * 부모의 추상메소드를 자식에  맞게 오버라이딩 해서 사용하도록 만드는 것이 목적이다.
 * 
 * 1. 추상메소드 : public abstract return_type m.name();
 * 2. 1을 가진 클래스 선언부 앞에는 반드시 abstract 키워드를 class 앞에 지정
 * 3. abstract class는 완벽한 클래스(설계도)가 아니기 때문에
 * 	  객체 생성의 대상에서 제외된다.
 * 4. abstract class를 상속받은 자식을 생성할때 Type으로서 사용된다.
 * --> PolyMorPhism
 * 5. 추상 메소드를 가지지 않은 완벽한 클래스도 abstract로 만들수 있다.
 * 	  이렇게 되면 그 클래스는
 * 	1) 직접적인 객체생성의 대상이 되지 않고
 * 	2) 성질을 물려주는 부모로서만 동작한다.
 * 	3)결국 Type으로서만 작동한다는 것을 더 명확히 알 수 있다.
 */