package step4.test;

class Car {
	int serialNumber; // field
	static int counter; // static V

	Car() {
		counter++;
		serialNumber = counter;
	}
}

public class StaticExamTest4 {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		System.out.println("========== non - static Variable ==========");
		System.out.println(c1.serialNumber); // 1
		System.out.println(c2.serialNumber); // 2
		System.out.println(c3.serialNumber); // 3

		System.out.println(" ");
		System.out.println("========== static Variable ==========");
		System.out.println(c1.counter); // 3
		System.out.println(c2.counter); // 3
		System.out.println(c3.counter);	// 3
		System.out.println(Car.counter);	//3   <-- 이게 좋은 접근 방법임.
	}
}
