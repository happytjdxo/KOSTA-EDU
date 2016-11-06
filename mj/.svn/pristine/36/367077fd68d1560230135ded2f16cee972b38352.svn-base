package inheritance.test;

import inheritance.child.Engineer;
import inheritance.child.Manager;
import inheritance.child.Secretary;
import inheritance.parent.Employee;
import inheritance.util.MyDate;

public class InheritanceTest1 {
	public static void main(String[] args) {
		Employee e = new Employee("고슬링", 35000.0, new MyDate(1999,06,19));
		// 1. Manager 객체를 하나 생성.. 생성자가 호출..이름은 m
		Manager m = new Manager("둘리", 500.5, new MyDate(1985,06,19), "만화");
		
		
		// 2. Engineer 객체를 생성.. 이름은 eg
		Engineer eg = new Engineer("최민재", 99999.9, new MyDate(2015,07,28), "IT");
		
		// 3. Secretary 객체를 생성.. 이름은 s
		Secretary s = new Secretary("james", 99999.9, new MyDate(2015,07,28), "관리자");
		
		// 4. Manager 객체의 정보를 콘솔로 출력
		System.out.println(m.getDetails());
		System.out.println(e.getDetails());
		System.out.println(eg.getDetails());
		System.out.println(s.getDetails());
	}
}






















// Q) 생일에서 toString 을 불러와야 하는거 아님?