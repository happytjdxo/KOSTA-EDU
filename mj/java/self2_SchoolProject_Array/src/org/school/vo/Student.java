package org.school.vo;

public class Student extends Person{
	//변수
	private String stuId;
	
	//생성자
	public Student(String name, int age, String address, int tel, String stuId){
		super(name, age, address, tel);
		this.stuId = stuId;
	}
	
	//메소드
	public String toString(){
		return super.toString() + ", 학생 아이디: " + stuId;
	}
	
	public String getStuId(){
		return stuId;
	}
	
	public void setStuId(String stuId){
		this.stuId = stuId;
	}
}
