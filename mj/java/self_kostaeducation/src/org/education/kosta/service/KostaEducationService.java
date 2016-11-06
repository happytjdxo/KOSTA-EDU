package org.education.kosta.service;

import java.util.Scanner;
import org.education.kosta.vo.*;

public class KostaEducationService {
	private ClassMember[] member;
	private int index = 0;
	private int studentIndex = 1;
	private int classRoomIndex = 1;

	public KostaEducationService(int size) {
		member = new ClassMember[size];
	}

	public void inputScore() {
		for (int i = 0; i < index; i++) {
			if (member[i] instanceof Student) {
				Student stu = (Student) member[i];
				stu.setScore((int) (Math.random() * 30 + 71));
				if(stu.getScore() >= 90) stu.setGrade("A");
				else if(stu.getScore() >= 80) stu.setGrade("B");
				else if(stu.getScore() >= 70) stu.setGrade("C");
				else stu.setGrade("F");
			}
		}
	}

	public void printAllInfo() {
		for (int i = 0; i < index; i++) {
			if (member[i] instanceof Teacher) {
				Teacher te = (Teacher) member[i];
				System.out.print(te.getName() + " 선생님의 경력은 " + te.getCareer()
						+ "년 이고, 여러분이 소개받을 수 있는 기업은 ");
				for(Company c : te.getCompany()){
					System.out.print(c.getCompanyName() + " ");
				}
			} else {
				Student stu = (Student) member[i];
				System.out.println(" 학생번호 : " + stu.getStuNo() + " 이름 : " + stu.getName() + " 점수 : "
						+ stu.getScore() + " 등급 " + stu.getGrade());
			}
		}
	}

	public void compareCompany() {
		Teacher teacher = null;
		Company[] com;

		for (int i = 0; i < index; i++)
			if (member[i] instanceof Teacher)
				teacher = (Teacher) member[i];

		if (teacher == null) {
			System.out.println("KostaMember에 Teacher가 등록되지 않았습니다.");
			return;
		}

		com = teacher.getCompany();

		for (int i = 0; i < index; i++) {
			if (member[i] instanceof Student) {
				String stuName = ((Student) member[i]).getName();
				System.out.print(stuName + "님이 지원할 수 있는 회사는 ");

				for (int j = 0; j < com.length; j++) {
					String stuGrade = ((Student) member[i]).getGrade();
					String comGrade = com[j].getGrade();

					if (stuGrade.compareTo(comGrade) <= 0)
						System.out.print(com[j].getCompanyName() + " ");
				}
				System.out.println("입니다.");
			}
		}
	}

	public void register(ClassMember[] kos) { // 학생과 강사를
		// 강의실에 등록하는
		// 기능
		System.out.println("============강의실을 배정합니다===========");
		System.arraycopy(kos, 0, member, index, kos.length);
		index += kos.length;
		for (int i = 0; i < index; i++) {
			if (member[i] instanceof Student) {
				Student s = (Student) member[i];
				s.setStuNo(studentIndex++);
				s.setClassRoom(classRoomIndex);
			} else {
				Teacher t = (Teacher) member[i];
				t.setClassRoom(classRoomIndex);
				System.out.println("배당된 반은 " + classRoomIndex
						+ "강의실 이며, 선생님은 '" + t.getName() + "("
						+ ((t.getGender() == 'M') ? "남자" : "여자") + ")'입니다.");
			}
		}
		System.out.println("==========강의실 배정을 마칩니다==========");
		classRoomIndex++;
	}

	public void complete(int month) { // 수료자 명단을 출력하는 기능
		System.out.println();
		System.out.println(month + "월 수료자 명단");
		for (ClassMember m : member) {
			if (m instanceof Student) {
				Student s = (Student) m;
				int day;

				switch (month) {
				case 2:
					day = 28;
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					day = 31;
				default:
					day = 30;
				}
				if (s.getCheckCount() > (day / 2))
					System.out.print(s.getName() + " ");
			}
		}
		System.out.println("\n");
	}

	public void menu() {
		Scanner s = new Scanner(System.in);
		int selectNum = 0;
		System.out.println("보고 싶은 목록에 맞는 숫자를 입력해주세요");
		while (true) {
			System.out
					.println("1.수료자격 / 2.평균나이 및 성별비율 / 3. 학생정보, 강사 정보");
			System.out.println("4.성적별 내림차순 정렬 / 5.학생 점수에 따른 지원가능 여부 / 0. 종료");
			selectNum = s.nextInt();
			switch (selectNum) {
			case 1:
				complete(12);
				break;
			case 2:
				printStudentInfo();
				break;
			case 3:
				printAllInfo();
				break;
			case 4:
				orderDescScore();
				break;
			case 5:
				compareCompany();
				break;
			case 0:
				System.exit(0);
			default:
				System.out.println("다시 입력해주세요.");
			}
		}
	}

	// 학생을 성적에 따라 내림차순으로 정렬
	public void orderDescScore() {
		Student[] students = new Student[this.index];
		int index = 0;

		for (int i = 0; i < member.length; i++) {
			if (member[i] instanceof Student) {
				students[index++] = (Student) member[i];
			}
		}


		for (int i = students.length-1; i > 0; i--) {
			for (int j = students.length - 1 - i; j > 0; j--) {
				if ((students[j-1] != null) && (students[j].getScore() > students[j - 1].getScore())) {
					Student temp = students[j];
					students[j] = students[j-1];
					students[j-1] = temp;
				}
			}
		}

		for (int i = 0; i < index; i++) {
			System.out.println(i + 1 + ". " + students[i].getScore() + "점 "
					+ students[i].getName());
		}
	}

	public void printAll() {
		for (int i = 0; i < index; i++) {
			if (member[i] instanceof Teacher) {
				Teacher te = (Teacher) member[i];
				System.out.println(te.getName() + "선생님의 경력은 " + te.getCareer()
						+ "년차 이며, " + ((te.getGender() == 'M') ? "남자" : "여자")
						+ "이고 나이는 " + te.getAge() + "살 입니다.");
			} else {
				Student stu = (Student) member[i];
				System.out.println(stu.getName() + " 학생의 학생번호는 "
						+ stu.getStuNo() + "이고 " + stu.getName() + "학생의 시험점수는 "
						+ stu.getScore() + "입니다. 그래서" + stu.getGrade()
						+ "등급 입니다.");
			}
		}
	}

	public void setMember(ClassMember[] m) {
		member = m;
	}

	public ClassMember[] getMember() {
		return member;
	}

	// 평균 연령, 남녀 수
	public void printStudentInfo() {
		System.out.println("=============학생 평균 연령===============");
		printAvgStudentAge();
		System.out.println("===================================");
		System.out.println();
		System.out.println("===========학생 남/녀 비율============");
		printAvgStudentGender();
		System.out.println("===================================");
	}

	private void printAvgStudentAge() {
		int sum = 0;
		int avg = 0;
		int len = 0;

		// 나이 합.
		for (int i = 0; i < index; i++) {
			if (member[i] instanceof Student) {
				Student s = (Student) member[i];
				sum += s.getAge();
				len++;
			}
		}
		// 평균연령
		avg = sum / len;
		System.out.println("학생들의 평균 연령 :" + avg);
	}

	private void printAvgStudentGender() {
		double m = 0;
		double f = 0;
		for (int i = 0; i < index; i++) {
			if (member[i] instanceof Student) {
				Student s = (Student) member[i];

				if (s.getGender() == 'M')
					m++;
				else
					f++;
			}
		}

		System.out.println("남자 :" + (int) m + "명 (" + (m / (m + f) * 100)
				+ "%)");
		System.out.println("여자 :" + (int) f + "명 (" + (f / (m + f) * 100)
				+ "%)");
	}
}