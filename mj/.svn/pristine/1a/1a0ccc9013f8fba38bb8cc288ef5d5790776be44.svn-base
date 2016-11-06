package org.school.test;

import org.school.exception.DuplicateTelException;
import org.school.exception.RecordNotFoundException;
import org.school.service.SchoolManager;
import org.school.vo.Employee;
import org.school.vo.Person;
import org.school.vo.Student;
import org.school.vo.Teacher;

public class SchoolmanagerTest {
	public static void main(String[] args) {

		SchoolManager manager = new SchoolManager(10);

		Teacher t01 = new Teacher("하승현", 38, "판교", 123456, "java");
		Teacher t02 = new Teacher("최민재", 28, "부천", 110605, "java");

		Student s01 = new Student("박정완", 25, "서울", 987654, "걸뱅이");
		Student s02 = new Student("박정기", 28, "서울", 654321, "걸뱅이");

		Employee e01 = new Employee("박 진", 30, "신림", 555555, "영업부");
		Employee e02 = new Employee("온 유", 25, "대방", 333333, "회계부");

		System.out.println("============ add Person() ============\n");
		try {
			manager.addPerson(t01);
		} catch (DuplicateTelException d) {
			System.out.println(d.getMessage());
		}
		try {
			manager.addPerson(t02);
		} catch (DuplicateTelException d) {
			System.out.println(d.getMessage());
		}
		try {
			manager.addPerson(s01);
		} catch (DuplicateTelException d) {
			System.out.println(d.getMessage());
		}
		try {
			manager.addPerson(s02);
		} catch (DuplicateTelException d) {
			System.out.println(d.getMessage());
		}
		try {
			manager.addPerson(e01);
		} catch (DuplicateTelException d) {
			System.out.println(d.getMessage());
		}
		try {
			manager.addPerson(e02);
		} catch (DuplicateTelException d) {
			System.out.println(d.getMessage());
		}
	}
}
		//manager.getPersons();

		/*System.out.println("\n");
		System.out.println("============ delete Person() ============\n");
		try{
			manager.deletePerson(555555);
		} catch (RecordNotFoundException r){
			System.out.println(r.getMessage());
		}

		manager.getPersons();

		System.out.println("\n");
		System.out.println("============ findPerson(int tel) ============\n");

		Person p = manager.findPerson(654321);
		System.out.println("findPerson(tel) :: " + p);

		System.out.println("\n");
		System.out
				.println("============ findPerson(String name) ============\n");

		Person[] persons = manager.findPerson(" 온 유 ");
	}
}*/

/*
 * 
 * 
 * SchoolManager manager = new SchoolManager();
 * 
 * Teacher t01 = new Teacher("하승현", 38, "판교", 123456, "java"); Teacher t02 = new
 * Teacher("최민재", 28, "부천", 110605, "java");
 * 
 * Student s01 = new Student("박정완", 25, "서울", 987654, "걸뱅이"); Student s02 = new
 * Student("박정기", 28, "서울", 654321, "걸뱅이");
 * 
 * Employee e01 = new Employee("박 진", 30, "신림", 555555, "영업부"); Employee e02 =
 * new Employee("온 유", 25, "대방", 333333, "회계부");
 */