package fly.step1.test;

import fly.step1.Bird;
import fly.step1.Flyer;
import fly.step1.SuperMan;

public class FlyerTest {
	public static void main(String[] args) {

		// 부모 타입으로 다양한 자식 객체를 생성하는 것. : 다형성.
		Flyer b = new Bird();
		// 객체 생성은 안되지만 Type으로는 가능하니까.
		Flyer s = new SuperMan();

		b.fly();
		s.fly();

		Bird bird = (Bird) b;
		SuperMan supman = (SuperMan) s;

		System.out.println(bird.buildNest() + "      " + bird.layEggs());
		System.out.println(supman.stopBullet());
	}
}

/*
 * //추상 클래스와 마찬가지로 인터페이스도 객체생성 안된다. // Flyer f = new Flyer();
 * 
 * //객체 생성은 안되지만 Type으로서는 가능하다. //부모 타입으로 다양한 자식 객체를 생성.. 폴리몰피즘.
 * 
 * Flyer f = new Bird(); Flyer f1 = new SuperMan();
 * 
 * f.fly(); f1.fly();
 * 
 * // layEggs(), stopBullet()를 호출해서 출력
 * 
 * Bird b = (Bird)f; System.out.println(b.layEggs());
 * 
 * SuperMan s = (SuperMan)f1; System.out.println(s.stopBullet());
 * 
 * //////////////////////////////////////////////////////////////////////
 * 
 * System.out.println(f.speed); //150 // f.speed = 100;
 */