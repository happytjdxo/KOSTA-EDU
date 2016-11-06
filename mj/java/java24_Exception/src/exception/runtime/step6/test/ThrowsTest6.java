package exception.runtime.step6.test;
/*
 * 예외 처리 방법 ::
 * 1) Try~catch - 예외를 그 자리에서 즉각적으로 처리.
 * 2) throws - 예외를 즉각적으로 처리하지 않고 던지는 방법.
 */
class Throw{
	/*
	 * 	go()를 수행하던 중 예외가 발생.. 그런데 바로 해결하지 않고 
	 * 	그 폭탄을 던지니.. go()를 원래 호출했던 곳에서 폭탄처리를 해라.
	 */
	public void go() throws ArithmeticException{
		int i =0; int j = 30;
		System.out.println("OK : " + i/j);
		System.out.println("폭탄 터질겁니다.. 삐뽀삐뽀1");
		System.out.println("Exception : " + j/i);
	}
}
public class ThrowsTest6 {
	public static void main(String[] args){
		Throw th = new Throw();
		System.out.println("이곳에서 폭탄처리 준비중입니다.. 삐뽀삐뽀2");
		try{
			th.go();	//이리로 날라온다..
		}catch(ArithmeticException e){
			System.out.println("잡았는가..");
		}
		System.out.println("끝난건가...삐뽀삐뽀3");
	}
}

/*public class ThrowsTest6 {
	public static void main(String[] args)throws ArithmeticException{
		Throw th = new Throw();
		System.out.println("이곳에서 폭탄처리 준비중입니다.. 삐뽀삐뽀2");
			th.go();	//이리로 날라온다..
		System.out.println("끝난건가...삐뽀삐뽀3");
	}
}*/		// 런타임 계열은 메인에서 던지는게 안된다. 나머지는 메인에서도 던져버리면 되긴함.