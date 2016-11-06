package step2.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import map.step2.CustomerVO;

// map에 대한 기능을 완벽히 숙지!@!
/*
 * Map에서 제공되는 중요한 기능을 알 수 있는 로직
 * 여기서 나오는 기능은 자유자재로 원활하게 사용할 수 있어야 한다.
 * ::
 * put()
 */
public class CustomerVOMapTest2 {
	public static void main(String[] args) {
		HashMap<String, CustomerVO> map = new HashMap<String, CustomerVO>();
		
		map.put("111", new CustomerVO("lee", "이경규", 56));
		map.put("222", new CustomerVO("soung", "성유리", 28));
		map.put("333", new CustomerVO("kim", "김제동", 34));
		
		//1. Map에 들어잇는 성유리의 정보를 출력..
		CustomerVO vo = map.get("222");
		System.out.println(vo);
		
		//2. id가 kim인 객체를 찾아서 그 사람의 이름을 출력
		//   (set의 iterator()를 사용)
		Set<String> set = map.keySet();
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			String key = itr.next();
			CustomerVO cust = (CustomerVO)map.get(key);
			if(cust.getId().equals("kim"))
				System.out.println(cust.getName());
		}
		
		//3. map에 들어잇는 키값만 찾아서 키값들만 출력
		//   (keySet()을 사용)
		System.out.println(set);
		
		//4. map에 들어있는 사람들의 나이의 총합을 구하고 그 평균연령을 출력
		//   (set의 iterator()를 사용)
		itr = set.iterator();
		
		int total = 0;
		while(itr.hasNext()){
			String key = itr.next();
			CustomerVO cust = (CustomerVO)map.get(key);
			total += cust.getAge();
		}
		System.out.println("나이의 총합 :: " + total + " 세");
		System.out.println("평균연령 :: " + total/map.size() + " 세");
		
	}
}
