package stream.object.step1;
/*
 * Code Pattern ::
 * --- 직렬화 ---
 * 
 * 1) stream 생성
 * 2) 날린다
 * 
 * ---------------------------
 * 
 * --- 역직렬화 ---
 * 
 * 3) stream 생성
 * 4) 읽어들인다. Object로 리턴 --> Casting..Person 타입으로.
 * 5) Person을 출력.. getter() / toString()
 */
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class PersonObjectOutputTest1 {

	public static void main(String[] args) throws Exception{
		// 1.스트림 생성
		String fileName = "d:\\objFile\\person.obj";
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		// 2.Person 객체를 생성
		Person p = new Person("김연아", 27, "방배동", "kim77");
		
		// 3. Sink(file)쪽으로 날린다
		oos.writeObject(p);
		
		// 4. 스트림 닫아준다.
		oos.close();
		System.out.println("person.obj파일에 연아에 대한 정보를 저장.");
		System.out.println("연아에 대한 정보를 확인하실려면 역직렬화해서 추후에..");
	}// 여기까지는 생성된 파일을 열수 없다. 역직렬화를 해야 열수 있다.
	
}
