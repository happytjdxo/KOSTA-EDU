package org.education.kosta.test;

import org.education.kosta.service.KostaEducationService;
import org.education.kosta.vo.*;

public class KostaEducationServiceTest {

	public static void main(String[] args) {

		KostaEducationService service = new KostaEducationService(100);
		
		Company[] com = {
				new Company("Ahnlab", "A"),
				new Company("NHN", "A"),
				new Company("Nexon", "B"),
				new Company("NC Soft", "B"),
				new Company("Netmable", "C"),
				new Company("Kakao", "C")
		};

		ClassMember[] member = { // 3.학생 배열 생성
		new Teacher("하승현", 36, 'F', 15, com), new Student("주은성", 26, 'M'),
				new Student("강혜진", 21, 'F'), new Student("최관우", 25, 'M'),
				new Student("최민재", 28, 'M'), new Student("공유", 30, 'F'),
				new Student("아이유", 20, 'F'), new Student("홍길동", 40, 'M'),
				new Student("김유정", 22, 'F'), new Student("이순신", 30, 'M'),
				new Student("이효리", 30, 'M') };

		service.register(member); // 4.수강 신청

		for (int i = 0; i < 31; i++) {
			for (int j = 0; j < member.length - 1; j++) {
				if ((member[j] != null) && (member[j] instanceof Student)) {
					Student s = (Student)member[j];
					
					int tf = (int) (Math.random() * 2);
					if (tf == 0) {
						s.attend(false);
					} else {
						s.attend(true);
					}
				}
			}

			service.setMember(member);
			System.out.println();
		}

		service.inputScore();
		service.menu();
	}

}
