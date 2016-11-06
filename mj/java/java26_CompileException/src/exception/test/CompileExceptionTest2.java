package exception.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CompileExceptionTest2 {
	public static void main(String[] args) {
		String fileName = "D:\\PerfLogs\\kosta\\test\\nana.txt";
		FileReader fr = null;

		try {
			System.out.println("1. FileReader Creating..");
			fr = new FileReader(fileName);

			fr.read();
			System.out.println("2. read()를 통해서 파일의 내용을 읽어 들입니다..");
		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		} finally {
			// 이 부분은 무조건 수행된다..
			// 1. but 또다른 예외가 발생할때 수행 안된다..
			// 2. 갑자기 전원이 꺼졌을때 수행 안된다..
			try {
				fr.close();
			} catch (IOException e) {

			}
		}
	}
}
