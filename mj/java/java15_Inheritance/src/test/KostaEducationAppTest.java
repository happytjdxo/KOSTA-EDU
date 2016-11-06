package test;

import child.Employee;
import child.Instructor;
import child.Student;
import parent.Person;

public class KostaEducationAppTest {
	public static void main(String[] args) {
		/*
		 * Person, Employee, Student, Instructor 객체를 각각 생성
		 * 객체이름은 p,e,s,i로 준다
		 * 
		 * 각각 객체의 정보를 출력
		 */
		Person p = new Person("이정재", "방배동", 35);
		Employee e = new Employee("장그래", "신림동", 27, "기획부");
		Student s = new Student("손연재", "여의도", 24, 1122);
		Instructor i = new Instructor("제임스", "판교", 50);
		
		System.out.println("=========Print Information===============");
		System.out.println("Person :: "+p);
		System.out.println("Employee :: "+e);
		System.out.println("Student :: "+s);
		System.out.println("Instructor :: "+i);
		
	}
}
