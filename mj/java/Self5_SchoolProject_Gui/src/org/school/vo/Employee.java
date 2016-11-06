package org.school.vo;

public class Employee extends Person{
	// 필드
	private String dept;
	
	//생성자
	public Employee(String name, int age, String address, int tel, String dept){
		super(name, age, address, tel);
		this.dept = dept;
	}
	
	//메서드
	public String toString(){
		return super.toString() + ", 부서 : " + dept;
	}
	
	public String getDept(){
		return dept;
	}
	
	public void setDept(String dept){
		this.dept = dept;
	}
	public Employee(){
		
	}
}
