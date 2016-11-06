
import java.io.*;
/*
 * BufferedReader의 자식 클래스를 이용하세요.
 */
public class IOProb2 {
	public static void main(String[] args) throws Exception {
		String fileName = "./src/data/data.txt";		// .은 src부터 가르키는 거임.
		System.out.println("<< world 가 들어있는 라인 >>");
		searchWord(fileName, "world");
		System.out.println("<< you 가 들어있는 라인 >>");
		searchWord(fileName, "you");
	}

	private static void searchWord(String fileName, String searchKeyword) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		int lineCount = 1;
		
		String line = null;
		while((line = br.readLine()) != null){
			int index = line.indexOf(searchKeyword);
			
			if(index != -1)
				System.out.println(lineCount + "-Line");
			lineCount++;
		}
	}
}