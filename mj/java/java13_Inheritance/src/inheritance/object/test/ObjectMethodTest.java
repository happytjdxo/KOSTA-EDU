package inheritance.object.test;
class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}
public class ObjectMethodTest {
	public static void main(String[] args) {
		// 1. boolean equals(obj) :: Object :: 다른객체인지 같은객체인지 비교.
		Person p1 = new Person("배용준", 45);
		Person p2 = new Person("배용준", 45);
		
		// 2. String toString() :: object :: 객체 저장된 위치값을 문자열로 리턴
		System.out.println("p1의 주소값 :: " + p1.toString());
		System.out.println("p2의 주소값 :: " + p2.toString());
		System.out.println(p1.equals(p2));	// false.. 주소값이 다름.
	
		System.out.println("p1 = p2");
		p1 = p2;	// 이 부분 때문에 서로 같은 주소값을 가지며 같은 객체를 가리킨다.
		System.out.println("p1의 주소값 :: " + p1.toString());
		System.out.println("p2의 주소값 :: " + p2.toString());
		System.out.println(p1.equals(p2));	// true.. 주소값이 같음.
	}
}
