package step4.test;

class Car2 {
	
	int serialNumber;
	static int counter;
	
	Car2() {
		counter++;
		serialNumber = counter;
	}
}

public class StaticExamTest44{
	public static void main(String[] args){
		
		Car2 c2 = new Car2();
		Car2 c3 = new Car2();
		
		System.out.println("== non - static Variable ==");
		System.out.println(c2.serialNumber);
		System.out.println(c3.serialNumber);
		
		System.out.println("== static Variable ==");
		System.out.println(c2.counter);
		System.out.println(c3.counter);
		System.out.println(Car2.counter);
		
		
	}
}