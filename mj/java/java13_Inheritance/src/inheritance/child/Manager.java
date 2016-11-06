package inheritance.child;

import inheritance.parent.Employee;
import inheritance.util.MyDate;

public class Manager extends Employee{	//1명 추가 그래서 5명.
	//
	private String dept;
	
	public Manager(String name, double salary, MyDate birthDate, String dept){
		
		// 부모 기본 생성자 호출이 무조건 일어난다.
		// 부모 객체가 무조건 하나 만들어져야 된다.
		// super();	
		super(name, salary, birthDate);
/*		this.name = name;
		this.salary = salary;
		this.birthDate = birthDate;																			<<-- 얘처럼 하기 싫으면 위에 super에 다 넣으면 됨. 이걸 할꺼면 super에는 기본값 super(); 이걸 해줘야함.
 */		this.dept = dept;
	}
	
	public String getDetails(){
		// return name + "\t" + salary + "\t" + birthDate + "\t" +dept;
		return super.getDetails() + "\t" + dept;	// 위에꺼랑 같은건데 더 간단히 한거.
	}
}
