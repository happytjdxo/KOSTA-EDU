package list.step1.test;

import java.util.ArrayList;
import java.util.List;

/*
 * List의 자식인 ArrayList를 사용한 예제
 * ::
 * List는 순서를 가지면서 객체를 저장하는 특징이 있다.
 * 객체들을 내부적으로 index로 관리한다.
 * Vector 보다 ArrayList를 더 많이 쓰는 이유에 대해서 알아야 한다.
 */
public class ListTest1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("박상훈");	//0
		list.add("유다형");
		list.add("오준식");
		list.add("오준식");
		list.add("애니멀");
		
		// 순서가 있는지		/	중복을 허용하는지를 알아본다.
		System.out.println("List에 들어있는 데이타의 갯수 : " + list.size());
		System.out.println("List에 들어있는 데이타 내용 : " + list);
		
		//1. 첫번째 데이타를 삭제.
		list.remove(0);
		System.out.println(list);
		
		//2. 네번째 데이타를 아이유로 수정.
		list.set(3, "아이유");
		System.out.println(list);
		
		//3. List안에 데이타가 비어있는지의 여부를 출력.
		System.out.println("데이타가 비었나요? " +list.isEmpty());
		
		//4. 두번째 데이타를 얻어서 내용을 출력.
		String item = list.get(1);
		System.out.println(item);
		
		//5. List안을 다시 초기화.
		list.clear();
		
		//6. 마지막으로 List 안이 비어있는지의 여부를 출력.
		System.out.println("데이타 비었나요? " + list.isEmpty());
	}
}
