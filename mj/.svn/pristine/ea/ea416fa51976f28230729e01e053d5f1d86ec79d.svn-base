package test;

import child.Employee;
import child.Instructor;
import child.Student;
import parent.Person;

public class KostaEducationAppTest2 {
	public static void main(String[] args) {
		//1. Person 타입의 배열을 생성.....사이즈는 5
		//학생 3, 선생1, 직원1을 할당...
		
		Person[ ] p = {
				new Student("손연재", "여의도", 24, 1122),
				new Student("장나라", "신대방", 22, 2233),
				new Student("소유", "여의도", 21, 3344),
				new Instructor("제임스", "판교", 50),
				new Employee("장그래", "신림동", 27, "기획부")
		};
		
		//2. 배열 안에있는 객체들의 정보를 콘솔창으로 출력...
		for(int i=0; i<p.length; i++){
			System.out.println(p[i]);		
			//3. 각각의 객체만의 기능을 호출할려면???	
			if(p[i] instanceof Student){
				Student stu = (Student)p[i];
				System.out.println(stu.attend());
			}if(p[i] instanceof Employee){
				Employee emp = (Employee)p[i];
				emp.planEducation();
			}if(p[i] instanceof Instructor){
				Instructor ins = (Instructor)p[i];
				ins.sumScore();
			}				
		}
		
	}
}