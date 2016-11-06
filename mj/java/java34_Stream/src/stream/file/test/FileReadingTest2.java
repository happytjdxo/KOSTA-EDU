package stream.file.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/*
 * Test2에서는 기본 스트림만 사용해서 파일의 내용을 읽고 /
 * 콘솔로 출력해 보겠다.
 * 이때 Byte 계열 스트림과 Character 꼐열 스트림을 둘다 사용해 보겠다.
 */
public class FileReadingTest2 {

	public static void main(String[] args) throws IOException{
		String fileName = "src/poem.txt";

		//1. 입력스트림 생성.. 기본스트림..바이트계열/문자계열
		FileInputStream fis = new FileInputStream(fileName);
		FileReader fr = new FileReader(fileName);

		// byte계열 스트림은 int로 리턴된 데이타를 char로 캐스팅하면 글자가 깨진다.
		System.out.println(" ===== byte stream =====");
		// 2. 읽어들여서 콘솔로 출력
		int data = 0;
		while((data = fis.read())!= -1){	// -1은 데이타의 끝을 의미한다.
			System.out.println((char)data);	// char로 캐스팅 해보세요.

		}

		/*System.out.println("========== character stream ==========");
		while((data = fr.read())!= -1){	// -1은 데이타의 끝을 의미한다.
			System.out.println((char)data);	// char로 캐스팅 해보세요.
		}	*/
		
		System.out.println(" ========== character + filter stream ==========");
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		while((line = br.readLine())!= null){
			System.out.println(line);

		}
	}
}
