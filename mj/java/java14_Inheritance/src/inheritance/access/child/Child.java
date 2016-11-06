package inheritance.access.child;

import inheritance.access.parent.Parent;

public class Child extends Parent{
	public void test(){
		System.out.println(publicTest);	// public
		System.out.println(protectedTest);	// protexted
		// System.out.println(defaultTest);
		// System.out.println(privateTest);
	} // test

	public Child() {	//자식 생성자 구현부 .. 첫 라인에서 부모 생성이 일어난다.
		super(); //parent();
	}
	@Override
	public void access() {
		super.access();	// 1step
		//	2step
		System.out.println("상속받은 필드 :: " + publicTest);
		System.out.println("상속받은 필드 :: " + protectedTest);
	}
	
	
}
/*
 * Overriding Rule
 * ::
 * 	1. 상속관계의 두 클래스에서 작용됨.
 *  2. 메소드의 선언부는 일치(return type, name, 인자값)
 *  3. 메소드의 구현부는 반드시 달라야함,
 *  4. More Modifier
 *  5. Less Exception (부모가 던지지 않은 예외는 자식이 던질 수 없다.)
 * ::
 * 	부모가 물려준 기능을 자식이 받아서
 * 그 기능을 자식에 맞게 고쳐쓰는 것을 말한다.
 * 결과적으로 메소드의 이름은 같을지라도 하는 일(기능,구현부)이 바뀌게 된다.
 * 
 * Overriding의 대표적인 예
 * 				Object				|				String
 * equals()				주소값 비교								문자열비교
 * toString()			주소값 출력								문자열 출력
 * */
