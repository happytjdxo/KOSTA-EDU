package set.step3;

import java.util.Random;
import java.util.TreeSet;
/*
 * 1~45의 숫자중에서 랜덤하게 6개의 수를 골라서 Set에 담을 것이다.
 * 물론 Set에 저장되기 때문에 동일한 숫자는 결코 함께 저장되지 않는다.
 * 이때 저장되는 숫자가 정렬의 기능까지 담을 수 있도록 하자.
 */
public class LottoMachineService {
	public TreeSet createLottoNumber(){
		// 1. set이라는 이름으로 TreeSet을 생성
		// 2. r이라는 이름으로 Random 객체를 생성
		// 3. while문 안에서 1~45 까지의 임의의 수를 받아온다... nextInt(45) +1 ...1~45
		// 4. 반환받은 값을 set에 추가
		// 5. set에 6개의 숫자가 들어가도록 한다.
		// 6. 최종적으로 set을 리턴
		
		/*		TreeSet set = new TreeSet();
		Random r = new Random();
		while(set.size()<6) {
			int num = r.nextInt(45) + 1;
			set.add(num);
		}
		 */		

		// random() 를 이용해서 다시 작성..
		
		TreeSet set = new TreeSet();
		for(int i = 0; set.size()<6; i++){
			int num = (int)(Math.random()*45) +1;
			set.add(num);
		}
		
		return set;
	}
}