package cons.test;

import cons.step1.Car;
import cons.step1.Engine;
import cons.step1.Person;

/*
 *  특정한 사람이 ( 2사람을 생성..)
 *  각각의 차량을 구매한 정보를 출력하는 로직을 작성하세요.
 */

public class PersonAppTest1 {

	public static void main(String[] args) {
		Person p01 = new Person("홍길동", 28, "판교");
	Person p02 = new Person("김두환", 50, "분당");

	Car c01 = new Car("투싼", 3000, "흰색", new Engine(250, 4000));
	Car c02 = new Car("싼타페", 4000, "흰색", new Engine(280, 4500));


	System.out.println(p01.getPersonInfo() + c01.getCarInfo());
	}

}











/*
Person p01 = new Person("홍길동", 28, "판교");
Person p02 = new Person("손오공", 28, "분당");					// 여기까지....
Car car01 = new Car("투싼", 3000, "흰색", new Engine(200, 7000));			// p01.Car("투싼", 3000, "흰색", 3000, 3000);
Car car02 = new Car("싼타페", 3500, "흰색", new Engine(200, 7000));		// System.out.println(p01);
Engine en01 = new Engine(200, 7000);
Engine en02 = new Engine(200, 7000);

System.out.println(p01);
System.out.println(p02);*/