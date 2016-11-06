package constructor;

import constructor.cons.Student;

// java.lang package는 기본적으로 import되어 있는데 나머지는 개인이 해줘야 한다.
// import java.util.*;			-->	

class StudentTest{
	public static void main(String[] args)	{
		System.out.println("----- Using Constructor -----");

		//	1. 객체를 하나 생성,, 이때 이름은 stu라고 하자
				Student stu = new Student("김하늘", 700, "연기");
				Student stu2 = new Student("김연우", 999, "가수");

		//	2. 정보를 입력하는 부분을 제외하고 get~~ 으로 출력해 보자.
				System.out.println(stu.getStudentInfo());
				System.out.println(stu2.getStudentInfo());

				// 주소값이 다르다는 것은 서로다른 객체임을 나타낸다.
				System.out.println("첫번째 생성한 Student : " + stu);	// 주소값
				System.out.println("두번째 생성한 Student : " + stu2);	// 주소값
	}
}
