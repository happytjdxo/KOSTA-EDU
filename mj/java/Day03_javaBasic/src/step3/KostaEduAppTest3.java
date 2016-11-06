package step3;

import step3.kr.org.edu.KostaEdu;
import step3.kr.org.person.Student;

class KostaEduAppTest3{
	public static void main(String[] args)	{
		System.out.println("=====Kosta Education Information =====");
	
		// 1. KostaEdu 객체를 생성..
		KostaEdu kosta = new KostaEdu();
		Student s = new Student();

		// 2. KostaEdu의 setKosta()을 통해서 값을 주입.
		// 3. 이때 학생의 정보를 Student의 setStudent()를 이용하자.
		s.setStudent("손연재", "son", 23);

		kosta.setKosta("삼평동", 10, s);

		// 4. 최종적으로 KostaEdu의 정보를 콘솔로 출력.
		System.out.println("kosta의 강의장 수 :: " + kosta.getClassNum() + "\n");
		System.out.println(kosta.getStudent().getName()+ " :: " + kosta.attend());
	
/*		Student st = new Student();
		st.setStudent("홍길동", "kos", 280);
		System.out.println(st);

		KostaEdu ke = new KostaEdu();
		ke.setKosta("판교", 5, s);
*/

	}
}
