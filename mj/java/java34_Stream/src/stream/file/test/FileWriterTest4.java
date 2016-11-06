package stream.file.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


/*
 * poem.txt 파일의 내용을 읽어서/
 * result.txt 파일로 출력..
 * 이때 result.txt는 미리 만들어 놓지 않을 것이다.
 * ::
 * 입력 : BufferedReader / FileReader
 * 출력 : PrintWriter를 사용.. 이때 생성자를 잘 보시고 로직을 작성..
 * PrintWriter를 보조스트림으로 사용한 코드이다.
 * 이때 true 키워드의 사용법에 주의하자.
 */
public class FileWriterTest4 {

	public static void main(String[] args) throws IOException {
		String inputFile = "src/poem.txt";
		String outputFile = "src/output/result.txt";
		
		BufferedReader br = new BufferedReader(new FileReader(inputFile));
		PrintWriter pw = new PrintWriter(new FileWriter(outputFile,true),true);		// 앞에 true 는 새로고침할때 마다 계속 이어 붙이기가 되고, 뒤에 true는 autoflushing이다.
		
		System.out.println("Stream Creating..");
		String line = null;
		/*
		 * flush()나 close()를 사용하지 않고 autoFlushing 기능이 일어나도록 생성자 안을 수정.
		 */
		while((line = br.readLine())!=null){
			pw.println(line);
		}
	}
}
