package org.education.kosta.vo;

public class Student extends ClassMember implements KostaAssociation{
	private int  stuNo;
	private int score;
	private String grade;
	
	public Student(String name, int age, char gender) {
		super(name, age, gender);
	}
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return " StudentVO [stuNo=" + stuNo + ", score=" + score + ", grade=" + grade + "] " + super.toString();
	}
	@Override
	public void salary() {
		System.out.println(this.getName() + "학생의 교육 지원금은 " + (this.getCheckCount() * 20000) + "원 입니다.");
	}
	@Override
	public void attend(boolean check) {
		if(check) {
			int count = this.getCheckCount() + 1;
			this.setCheckCount(count);
		}
	}
	@Override
	public void lesson() {
		System.out.println(this.getName() + "학생 출석!!");
	}
}
