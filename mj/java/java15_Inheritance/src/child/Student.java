package child;

import parent.Person;

public class Student extends Person {
	private int StudentId;
	
	public Student(String name, String address, int age, int StudentId) {
		super(name, address, age);
		this.StudentId = StudentId;
	}

	@Override
	public String toString() {
		return super.toString()+ " " + StudentId;
	}
	
	// 기능
	public String attend(){
		return name + " :: 출석!!";
	}
}
