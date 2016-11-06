package exception.test;

import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 * Compile 계열의 Exception을 살펴보겠다.
 * 컴파일러가 인식하는 예외 이기 때문에 에러가 발생하면
 * 컴파일시 에러가 발생한다.
 * IOExeption이 주를 이룬다..
 * 파일에 내용을 읽거나 쓸때 무조건 발생한다.
 */
class FileReading{
	// 파일에 있는 내용을 읽어오는 기능을 하나 작성.
	public void readFile(String fileName)throws FileNotFoundException{
		System.out.println("FileReader Creating..");
		FileReader file = new FileReader(fileName);
	}
}
public class CompileExceptionTest1 {
	public static void main(String[] args) throws FileNotFoundException{
		String fileName = "D:\\PerfLogs\\kosta\\test\\nana.txt";
		FileReading fr = new FileReading();
		
		System.out.println("readFile을 호출 했습니다.");

			fr.readFile(fileName);
			
	}
}
