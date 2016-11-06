package inheritance.access.parent;
/*
 * Access Modifier의 성격을 알아보는 로직
 * 부모 클래스 각각의 필드에 접근지정자를 선언
 * 자식 클래스에서 부모의 필드에 접근가능 여부를 알아보ㅔㅆ다.
 */
public class Parent {
	public String publicTest = "publicTest";
	protected String protectedTest = " protextedTest";
	String defaultTest ="protextedTest";
	private String privateTest = "protextedTest";

	public Parent() {	
		super(); //object();
	}
	public void access(){
	System.out.println("Access Modifier Test..");

	}
}
