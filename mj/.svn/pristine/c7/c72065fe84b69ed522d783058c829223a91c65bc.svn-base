package poly.test.step1;

import poly.child.step1.Cat;
import poly.child.step1.Dog;
import poly.child.step1.Man;
import poly.parent.step1.Animal;

public class AnimalAppTest1 {
	public static void main(String[] args) {
		
		// 1. 부모 타입으로 자식객체들을 생성..Cat, Dog, Man
		
		/*
		 *  Virtual Method Invocation의 원리 :: (오버라이딩에만 적용됨)
		 *  1) 컴파일 시점의 메소드 : 부모 메소드가 호출..
		 *  2) 실행시점의 메소드 : 자식 메소드가 최종적으로 호출..
		 *  부모 타입으로 자식객체를 생성하고 
		 *  부모타입의 변수로 오버라이딩된 메소드를 호출하면
		 *  자식의 메소드가 결국에는 구동된다.
		 */
		
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		Animal a3 = new Man();
		
		// 2. 객체변수들을 이용해서 eat()를 호출
		
		a1.eat();
		a2.eat();
		a3.eat();	//Man의 eat()이 구동 되었다..
		
		// 부모가 가지지 않는 멤버를 부모에 할당하면 안된다..
		//a3.drive();
		//a3.jooryang = false;
		Man m = (Man)a3;
		m.jooryang = false;
		m.drive();
	
	}

}
