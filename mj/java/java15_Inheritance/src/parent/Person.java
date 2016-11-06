package parent;
/*
 * parent.Super class
 * child.Sub Class :: Employee(String delt),
 * 			   		  Student(int StudentId),
 * 			   		  Instructor(String subject)
 */
public class Person {
	protected String name;
	protected String address;
	protected int age;
	
	public Person(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}

	public String toString() {
		return name + " " + address + " " + age;
	}
	
	
}
//protected 같은 패키지 내 // if 상속 관계시 public 으로 됨.