package stream.object.step3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
 * Car 객체를 직렬화 / 역직렬화 시키는 두가지 측면의 기능을 가지고 있는 서비스..
 * 여기서 Car 객체를 3개 생성..
 * 생성된 Car 객체들을 Collection에 담아서 한번에 던질것이다.writeObject(list)/
 * 덩어리로 읽어들인다..readObject()
 * 던진것을 제대로 받았는지를 콘솔창으로 확인.. 정보출력
 */
public class CarService {
	//직렬화
	public void outputCar(String path, ArrayList<Car> list ) throws Exception{
		// 1. path를 이용해서 File 객체를 생성,
		File f = new File(path);
		
		// 2. 디렉토리가 생성되어 지도록 한다..
		f.getParentFile().mkdirs();
		
		// 3. oos를 생성 ... 이때 파일이 생성된다.	--> f에서 파일이 생성
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
		
		// 4. 던진다
		oos.writeObject(list);
		
		// 5. close()
		oos.close();
	}
	
	//역직렬화 기능
	public ArrayList<Car> inputCar(String path) throws Exception {
		// 1. ArrayList<Car>를 선언
		ArrayList<Car> list = null;
		
		// 2. ois를 생성
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
		
		// 3. 읽어들여서 리턴.
		list = (ArrayList<Car>)ois.readObject();
		return list;
	}
}
