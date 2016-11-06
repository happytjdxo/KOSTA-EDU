package map.step1.test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


/*
 * Map 방식으로 객체를 저장하는 것은
 * key-value가 쌍으로 엮여서 저장되는 방식이다.
 * 이때 key값은 중복되면 안된다.. 순서는 역시 없다.
 * 자식으로 HashMap, Properties 가 있다.
 * 현재 HashMap을 사용하지 Hashtable을 사용하지 않는다.
 */
public class MapTest1 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("김현기", 98);
		map.put("최민재", 89);
		map.put("최란", 95);
		map.put("구유림", 84);
		map.put("엄지연", 86);
		
		// 1. Map를 생성했다면 Map안에 들어있는 Key값을 얻어낸다.
		System.out.println("========== entrySet() or keySet() ==========");
		Set set = map.entrySet();
		
		// 2. Set 에 들어있는 Key값 들을 얻어낸다.
		Iterator it = set.iterator();
		
		
		// 3. Key값을 통해서 key에 해당하는 점수를 얻어낸다.
		
		int total = 0;
		/*while(it.hasNext()){
			String name = it.next();
			int score = map.get(name);
			total += score;
		}*/
		
		// 3-1. Map.Entry를 이용해서 값이 나오도록..
		while(it.hasNext()){
			Map.Entry e = (Map.Entry)it.next();
			total += (int)e.getValue();	//성적
		}
		
		// 이때 총점, 평균, 최고점수를 각각 출력하는 로직을 작성하세요.
		System.out.println("총점 : " + total + "점");
		System.out.println("총점 : " + total/map.size() + "점");
		System.out.println("총점 : " + Collections.max(map.values()));
		
		
	}
}
