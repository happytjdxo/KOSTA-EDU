package org.school.vo;

abstract public class Person {
	// 변수
	private String name;
	private int age;
	private String address;
	private int tel;
	
	// 생성자
	public Person(){
		super();
	}
	
	public Person(String name, int age, String address, int tel){
		this.name = name;
		this.age = age;
		this.address = address;
		this.tel = tel;
	}
	
	//메서드
	public String toString(){
		return "이름 : " + name + ", 나이 : " + age + ", 주소 : " + address + ", 전화번호 : " + tel;
	}
	
	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress(){
		return address;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public int getTel(){
		return tel;
	}
	public void setTel(int tel){
		this.tel = tel;
	}
}
