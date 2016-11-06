package step3.kr.org.edu;

import step3.kr.org.person.Student;

public class KostaEdu{
	String address;
	int classNum;
	Student student;

/*	public void setStudent(Student stu){
		student = stu;
	}
*/
	public void setKosta(String addr, int cn, Student stu){
		address = addr;
		classNum = cn;
		student = stu;
	}

		public String getAdddress(){
			return address;
		}
		public int getClassNum(){
			return classNum;
		}
		public Student getStudent(){
			return student;
		}
		public String attend(){
			return "출석!";
		}


}