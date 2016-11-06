package org.school.service;

/*
 * vo 객체들(Student, Teacher, Employee)을 핸들링하기 위한 컨테이너로
 * 이전에는 ArrayList 을 사용했다.
 * 이번에는 HashMap에 담아서 핸들링 해보도록 하겠다.
 * ::
 * Test를 수정할게 있으면 수정해서 프로그램을 실행...
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.school.exception.DuplicateTelException;
import org.school.exception.RecordNotFoundException;
import org.school.vo.Person;

public class SchoolManager {
	private Map<Integer, Person> map;
	
	public SchoolManager(int size) {
		map = new HashMap<Integer, Person>();
	}

	// Person들의 모든 정보를 출력하는 기능..
	public void getAllPersonInfo() {
		/*
		 * key 값들을 먼저 set에 할당한다.
		 * key 값들을 먼저 뽑고, Value를 뽑아서 출력
		 */
		Set<Integer> set = map.keySet();
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()){
			int key = it.next();	// key값들이 할당
			System.out.println("tel : " + key + " Person Info : " + map.get(key));
		}
	}// getPersons

	public void addPerson(Integer tel, Person person) throws DuplicateTelException {
		/*
		 *  tel 번호를 가진 회원이 이미 존재하면 예외발생
		 *  그렇지 않으면 추가.. map에 추가
		 */
		if(map.containsKey(tel)){
			System.out.println(tel+" 번호를 가진 회원은 이미 있습니다..");
			throw new DuplicateTelException("이미 회원 있음!!");
		}else{
			map.put(tel, person);
			System.out.println(person.getName() + "님이 회원으로 등록됨..");
		}
	}// addPerson

	public void deletePerson(int tel) throws RecordNotFoundException {
		Person p = map.remove(tel);
		if(p==null){
			System.out.println("Delete Fail :: " + tel + " 번호를 가진 회원이 없습니다.");
			throw new RecordNotFoundException("삭제하려는 회원이 없습니다.");
		}else{
			System.out.println("Delete OK :: " + tel + "번호를 가진 회원 삭제!");
		}
	}// deletePerson

	public Person findPersonByTel(int tel) {

		return map.get(tel);
	}// findPerson

	public ArrayList<Person> findPersonByAddress(String address) {
		ArrayList<Person> temp = new ArrayList<Person>();
		Set set = map.keySet();
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()){
			int tel = it.next();
			Person p = map.get(tel);
			if(p.getAddress().equals(address))
				temp.add(p);
		}	// while
		return temp;
	}// findPerson

	// 수정의 대상은 tel이란 필드를 제외한 나머지이다.
	public void updatePerson(Person p)throws RecordNotFoundException {
		if(map.containsKey(p.getTel())){
			map.put(p.getTel(), p);
			System.out.println("Update OK :: " + p);
		}else{
			System.out.println("수정할 대상이 없음");
			throw new RecordNotFoundException("수정할 사람 찾지 못했음!!");
		}
	}// updatePerson
}
