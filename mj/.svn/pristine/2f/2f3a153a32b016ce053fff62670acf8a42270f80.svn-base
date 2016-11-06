package service;

import parent.Person;
import child.Employee;
import child.Instructor;
import child.Student;

public class KostaService {
	public void printAllInfo(Person[] p){
		for(Person person : p){
			if(person instanceof Student){
				System.out.println(person);
				Student s =(Student)person;
				System.out.println(s.attend());
			}else if(person instanceof Employee){
				System.out.println(person);
				Employee e = (Employee)person;
				e.planEducation();
			}else{
				System.out.println(person);
				Instructor i = (Instructor)person;
				i.sumScore();
			}
		}
	}
}
