package step2.test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTest2 {
	public static void main(String[] args) {
	/*	Set set = new HashSet();
		set.add("김준호");
		set.add("차태현");
		set.add("데프콘");
		set.add("정준영");
		set.add("데프콘");
		set.add("차태현");
		
		System.out.println(set);*/
		
		//TreeSet :: Unique + sorting ( 한글, 숫자, 알파벳 모두 정렬됨)
		Set set = new TreeSet();
		set.add(new Integer(23));
		set.add(24);
		set.add(20);
		set.add(40);
		set.add(30);
		set.add(60);
		set.add(60);
		set.add(new Integer(100));
	
		System.out.println(set);
		//set의 또다른 기능을 알아보자...
		TreeSet ts = (TreeSet)set;
		//System.out.println(set.higher); //부모에는 없다.
		
		//Set에는 없고 TreeSet에만 있는 기능
		System.out.println(ts.higher(20));	//20 바로다음으로 큰 수 
		System.out.println(ts.headSet(30));  //30 보다 작은 수들
		System.out.println(ts.tailSet(30));	 //30부터 큰 수들

	}
}













