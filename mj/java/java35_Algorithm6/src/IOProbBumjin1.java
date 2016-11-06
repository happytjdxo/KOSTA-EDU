import java.io.*;
import java.util.*;
/*
 * score.txt 파일을 읽어서
 * score.txt 파일로 출력하는 이때
 * 총점과 평균이 맨 아래에 이어붙혀서 출력이 되도록 로직을 작성.. 발표
 */
public class IOProbBumjin1 {
		public static void main(String[] args)throws Exception{
			//구현하세요...
			String fileName = "src/data/score.txt";
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			PrintWriter pw = new PrintWriter(new FileWriter(fileName,true));
			
			System.out.println("Stream..생성....");
			int sum=0;
			double avg=0;
			String line=br.readLine();		
			while(line !=null){
				String[] temp =line.split(":");			
				sum += Integer.parseInt(temp[1]);
				line=br.readLine();
			}		
			
			avg=(double)sum/(double)5;
			pw.println(" ");
			pw.println("합계:"+sum);
			pw.printf("평균: %.2f", avg);
						
			br.close();
			pw.close();

	}
}
/* 
		BufferedReader br = new BufferedReader(new FileReader("src/data/score.txt"));
		

		String[] splitLine = null;
		String line = null;
		int total = 0;
		int data = 0;

		while((line = br.readLine())!= null) {
			splitLine = line.split(":");
			total += Integer.parseInt(splitLine[1]);
			System.out.println(line);
			total += data;
		}
		System.out.println("총점 : " +total);
		System.out.println("평균 : " +(double)total/5);
*/