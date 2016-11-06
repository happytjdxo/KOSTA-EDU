package inheritance.access.test;

import inheritance.access.child.Child;

public class AccessTest {
	public static void main(String[] args) {
		//	이렇게 자식을 생성하면 무조건 부모가 먼저 생성된다.
		//	new Parent() 하지 않아도...
		Child child = new Child();
		child.test();	//	자식만의 멤버..
		System.out.println("============================================");
		child.access();	//	오버라이딩..
	}

}
