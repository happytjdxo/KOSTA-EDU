package stream.file.test;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * score.dat 파일을 readInt()로 읽어서
 * 각각의 score를 출력했다.
 * 여기서 모든 점수의 총합을 출력..로직을 작성
 * 어떨때 점수의 총합이 나오는지를 생각해서 작성하자.
 */
public class DataInputStreamTest7 {

	public static void main(String[] args) {

		String fileName = "src/score.dat";
		int total = 0;
		try {
			DataInputStream dis = new DataInputStream(new FileInputStream(fileName));
			System.out.println("DataInputStream Creating..");

			int data = 0;
			while ((data = dis.readInt()) != -1) {
				System.out.println(data);
				total += data;
			}
		} catch (EOFException e) {
			System.out.println("점수의 총합 : " + total);
		} catch (IOException e) {

		}
	}
}