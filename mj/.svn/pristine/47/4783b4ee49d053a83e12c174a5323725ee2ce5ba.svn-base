package exception.test;

import java.io.IOException;

/*
 * 실제로 키보드로 읽어들인 데이타를
 * 콘솔로 출력하는 간단한 로직..
 * 이때 IoException을 핸들링하는 방법을 익혀보겠다.
 */
public class IOExceptionTest4 {
	public static void main(String[] args) {
		System.out.println("========== IOException ==========");
		byte[] data = new byte[100];
		try{
		System.in.read(data);
		}catch(IOException e){
			System.out.println("read()를 사용하는 순간 무조건 IOException이 발생..");
		}//
		System.out.println("입력한 문자열은 :: " + new String(data));
	}
}
