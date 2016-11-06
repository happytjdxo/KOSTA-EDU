package set.step1.test;

import java.util.HashSet;
import java.util.Set;

/*
 * Collection의 자식 인터페이스로서의 Set ::
 * "Unique" 한 데이타만 저장하는 특징을 가진다.
 * 중복안됨 / 순서도 없다.. 원시적인 저장 방법.
 * :
 * 정말 순서가 없는지.. 저장한 순서대로 출력되지 않는다.
 * 정말 중복이 안되는지.. 같은 데이타를 저장해도 중복된 데이타가 튕겨져 나가는지..
 */
public class SetTest1 {
	public static void main(String[] args) {
		Set set = new HashSet();
		//add
		set.add("임현주");
		set.add("오우진");
		set.add("유진호");
		set.add("애니멀");
		set.add("애니멀");
		
		// toString()이 Collection에서는 오버라이딩 되어져 있다.
		System.out.println(set);	
		System.out.println("set에 저장된 데이타의 갯수 : " + set.size());	//4
		
		//	오우진이 들어있는지의 여부
		boolean b = set.contains("오우진");
		System.out.println("우진씨가 정말 저장되어 있나요? " + b);
		
		//	임혀주를 삭제...순서가 없다...index가 없다.(순서가 없는건 index가 없다는거임.)
		// 순서가 있다는 것은 내부적으로 데이타를 index로 관리함을 의미한다.
		set.remove("임현주");
		System.out.println(set);
		
		//set안에 들어있는 모든 데이타를 삭제 ..clear(), removeAll()
		set.clear();	//removeAll()
		set.removeAll(set);
		System.out.println(set);
		
		
	}
}
