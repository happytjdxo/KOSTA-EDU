package org.education.kosta.vo;

public class Teacher extends ClassMember implements KostaAssociation{
	private int career;
	private Company[] company = new Company[6];
	
	public Teacher(String name, int age, char gender, int career, Company[] com) {
		super(name, age, gender);
		this.career = career;
		this.company = com;
	}

	public int getCareer() {
		return career;
	}
	public void setCareer(int career) {
		this.career = career;
	}
	public void setCompany(Company[] com){
		this.company = com;
	}
	public Company[] getCompany(){
		return company;
	}
	@Override
	public String toString() {
		return "TeacherVO [career=" + career + "] " + super.toString();
	}
	@Override
	public void salary() {
		System.out.println(this.getName() + "강사님의 월급은 " + (this.getCheckCount() * 300000) + "원 입니다.");
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
		System.out.println(this.getName() + "강사님이 출근 하셨습니다!!");
	}
}
