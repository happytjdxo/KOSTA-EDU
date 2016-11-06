package test;

import child.Employee;
import child.Instructor;
import child.Student;
import parent.Person;
import service.KostaService;

public class KostaEducationAppTest3 {
	public static void main(String[] args) {		
		Person[ ] p = {
				new Student("손연재", "여의도", 24, 1122),
				new Student("장나라", "신대방", 22, 2233),
				new Student("소유", "여의도", 21, 3344),
				new Instructor("제임스", "판교", 50),
				new Employee("장그래", "신림동", 27, "기획부")
		};
			
		KostaService service = new KostaService();
		service.printAllInfo(p);
	}
}

/*Person p = new Person("이정재", "방배동", 35);
		Employee e = new Employee("장그래", "신림동", 27, "기획부");
		Student s = new Student("손연재", "여의도", 24, 1122);
		Instructor i = new Instructor("제임스", "판교", 50);

		System.out.println("============ Print Information ============");
		System.out.println("Person :: " + p);
		System.out.println("Employee :: " + e);
		System.out.println("Student :: " + s);
		System.out.println("Instructor ::" + i);*/