package step1.test;
/*
 *  static한 변수는 객체 생성 과정 필요없이 바로 메모리에 올라간다.
 *  이유는 객체 생성하기 전에, Class File Loader 과정에서 미리 메모리 올라가기 때문이다.
 *  -->
 *  이런 성질을 잘못 이용하면 객체생성과정을 줄이고자 필드 앞에 다
 *  static으로 지정하는 일이 발생한다.
 */
class Member{
	static String name = "코스타";
	static int age = 11;
	
	public static void memberInfo(){
		System.out.println("우/유/빛/깔 " + name);
	}
}
public class StaticExamTest1 {
	public static void main(String[] args) {
		// 1. 밑에께 왜 되는지....
		/*Member m = new Member();
		m.memberInfo();*/
		
		Member.memberInfo();	// 얜 왜 쓰는지...?
		System.out.println("Age :: " + Member.age);
		
		Member m = new Member();
		for(int i=0; i<5; i++){
			System.out.println(Math.random());
		}
	}
}

/*
 *  위의 코드에서 멤버 앞에 static을 지정한 것은 잘못된 사용법이다.
 *  static으로 지정한 멤버들은 메모리 영역에서 ClassArea영역에 올라간다.
 *  Heap 영역에 올라가지 못함으로 GC가 청소하는 영역이 아니다.
 *  불필요한 멤버에 Static으로 지정하는 것은 메모리 효율성을 현격하게 떨어뜨리는 요인이 된다,
 *  ::
 *  대표적으로 static으로 지정해야 하는것들은?
 *  상수값, 수학적 연산기능 (Math), counting...
 */
