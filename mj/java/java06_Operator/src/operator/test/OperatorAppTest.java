package operator.test;

class Idol{
	// Field..기본값을 가진다.
	String name;
	int age;
	
	Idol(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String getIdol(){
		return name + " " + age;
	}
}// class

class Operator{
	public boolean test1(){
		System.out.println("test1() calling...");
		return true;
	}
	
	public boolean test2(){
		System.out.println("test2() calling...");
		return false;
	}
}

public class OperatorAppTest {
	public static void main(String[] args) {
		Idol idol1 = new Idol("수지", 24);
		Idol idol2 = new Idol("수지", 24);
		
		// 주소값이 같으면 서로 같은 객체를 의미한다..
		
		if(idol1 == idol2)
			System.out.println("서로 같은 Object..");
		else
			System.out.println("서로 다른 Object..");
		
		idol1 = idol2;	// idol1 주소값이 변경됨 ---> idol2 로..( =같은 주소값)
		
		if(idol1 == idol2)
			System.out.println("서로 같은 Object..");
		else
			System.out.println("서로 다른 Object..");
		
		System.out.println(idol1.getIdol());
		System.out.println(idol2.getIdol());
		
		//////////////////////////////////////////////////////////////////
		
		// Local V, 기본값이 없어서 초기화 무조건 해주자.
		int i = 5;
		int j = 3;
		System.out.println(" 연산자 % :: " + i % j);	// 2
		System.out.println(i == j);	// false
		System.out.println(i != j); // true
		
		/*
		 * 기본형 타입의 변수에는 값이 바로 할당되는 반면,
		 * 클래스 타입의 변수에는 객체를 가리키는 ( 참조하는 ) 주소값이 들어간다.
		 */
		
		
		boolean flag = false;
		System.out.println(flag);	// false
		System.out.println(!flag);	// true
		
		
		int k = 10;
		System.out.println(k++);	// 10하고 나중에 1을 증가한다.
		System.out.println(k);		// 11
		
		
		int m = 10;
		System.out.println(++m);	// 11
		System.out.println(m);		// 11
		
		int p = 100;
		System.out.println(p--);	// 100
		System.out.println(p);		// 99
		
		int q = 100;
		System.out.println(--q);	// 99
		System.out.println(q);		// 99	
		
		////////////////////////////////////////////////////////////////////////////////
		
		/*
		 * Operator 클래스의 test1(),test2() 메소드를 사용하려면?
		 * ::
		 * 객체를 생성 == Operator 클래스의 멤버가 메모리에 올라간다
		 * 		   == 메모리에 올라간 얘들만 접근해서 사용할 수 있다.
		 */
		
		Operator o1 = new Operator();
		System.out.println(o1.test1() || o1.test2());	// true
		System.out.println(o1.test1() && o1.test2());	// false
	}
}
