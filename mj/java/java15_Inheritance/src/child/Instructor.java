package child;

import parent.Person;

public class Instructor extends Person{
	private String subject;
	private static final String BASIC_SUBJECT = "java";
	
	public Instructor(String name, String address, int age, String subject) {
		super(name, address, age);
		this.subject = subject;
	}	
	public Instructor(String name, String address, int age) {
		this(name,address, age,BASIC_SUBJECT); //9라인의 생성자 호출
	}	
	@Override
	public String toString() {
		return super.toString()+" "+subject;
	}	
	//추가
	public void sumScore(){
		System.out.println("성적의 총합은 100이어야 합니다..");
	}
}