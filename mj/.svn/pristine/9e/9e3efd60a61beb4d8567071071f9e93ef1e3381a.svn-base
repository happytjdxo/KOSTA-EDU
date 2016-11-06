package org.school.test;

import java.util.ArrayList;

import org.school.exception.DuplicateTelException;
import org.school.exception.RecordNotFoundException;
import org.school.service.SchoolManager;
import org.school.vo.Employee;
import org.school.vo.Person;
import org.school.vo.Student;
import org.school.vo.Teacher;

public class SchoolManagerTest {
	public static void main(String[] args) {
		SchoolManager manager   = new SchoolManager(100);
		
		Teacher t01 = new Teacher("하승현", 38, "판교", 123456, "java");
		Teacher t02 = new Teacher("최민재", 28, "부천", 110605, "java");

		Student s01 = new Student("박정완", 25, "서울", 987654, "걸뱅이");
		Student s02 = new Student("박정기", 28, "서울", 654321, "걸뱅이");

		Employee e01 = new Employee("박 진", 30, "신림", 555555, "영업부");
		Employee e02 = new Employee("온 유", 25, "대방", 333333, "회계부");
System.out.println("========================= addPerson() =================================\n");
		try{
		manager.addPerson(s01);		
		manager.addPerson(s02);
		manager.addPerson(e01);
		manager.addPerson(t01);
		//manager.addPerson(s1);	
		manager.addPerson(t02);		
		}catch(DuplicateTelException e){
			System.out.println(e.getMessage());
		}
		manager.getPersons();
		
		System.out.println("\n");
		System.out.println("============================ deletePerson() =============================\n");
		try{
		manager.deletePerson(123456);
	
		}catch(RecordNotFoundException e){
			System.out.println(e.getMessage());
		}
		manager.getPersons();
		
		
		System.out.println("\n");
		System.out.println("============================= findPerson(int tel) ===============================\n");
		
			Person p = manager.findPerson(987654);
			System.out.println("findPerson(tel) :: "+p);
		
		
	
		System.out.println("\n");
		System.out.println("============================= findPerson(String name) ===============================\n");
					ArrayList<Person> persons=manager.findPerson("박정기");
			for(Person p1 : persons){
				System.out.println(p1);
			}
		
		
			
		System.out.println("\n");
		System.out.println("============================= updatePerson() ==============================");
		System.out.println("------------------ 정보가 수정된 사람이 누구일까요? ---------------------------------\n");
		
		manager.updatePerson("온 유", 25, "대방", 333333, "회계부");
		manager.getPersons();	

	}
}