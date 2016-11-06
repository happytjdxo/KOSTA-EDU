package stream.file.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 * poem.test 파일의 내용을 읽어서
 * 콘솔창으로 출력하는 로직의 패턴을 작성.
 * ::
 * 1. FileReader/BufferedReader 입력스틤 생성
 * 2. 읽어들인다. readLine()
 * 3. 콘솔로 출력.
 */
public class FileReadingTest1 {
	public static void main(String[] args) throws IOException{
		
		//1.
		// BufferedReader br = new BufferedReader(new FileReader("src/poem.txt"));
		//BufferedReader br = new BufferedReader(new FileReader("src/poem.txt"));

		File file = new File("src/poem.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		System.out.println("1. FileReader Creating..");
		String line = null;
		System.out.println("2. File Reading..");
		while((line = br.readLine())!= null){
			System.out.println(line);
		}
	}
}
