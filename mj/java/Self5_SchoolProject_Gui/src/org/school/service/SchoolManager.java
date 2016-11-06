package org.school.service;

/*
 * vo 객체들(Student, Teacher, Employee)을 핸들링하기 위한 컨테이너로
 * 이전에는 Person[ ] 을 사용했다.
 * 이번에는 ArrayList에 담아서 핸들링 해보도록 하겠다.
 * ::
 * Test를 수정할게 있으면 수정해서 프로그램을 실행...
 */
import java.util.ArrayList;

import org.school.exception.DuplicateTelException;
import org.school.exception.RecordNotFoundException;
import org.school.vo.Employee;
import org.school.vo.Person;
import org.school.vo.Student;
import org.school.vo.Teacher;

public class SchoolManager {
	
	 // Person[ ] p; int index;//0
	 
	private ArrayList<Person> list; // 필드를 ArrayList로 수정

	public SchoolManager(int size) {
		list = new ArrayList<Person>();
	}

	// Person들의 모든 정보를 출력하는 기능..
	public void getPersons() {
		
	}// getPersons

	public void addPerson(Person person) throws DuplicateTelException {
		for(int i = 0 ; i<list.size(); i++){
			if(list.get(i).equals(person)){
				throw new DuplicateTelException();
			}
		}
		list.add(person);
	}// addPerson

	public void deletePerson(int tel) throws RecordNotFoundException {
		boolean find = false;
		for(int i =0; i<list.size(); i++){
			if(list.get(i).getTel() == tel){
				list.remove(i);
				find = true;
				break;
			}
		}
		if(find == false){
			throw new RecordNotFoundException();
		}
	}// deletePerson

	public Person findPerson(int tel) {
		Person p = null;
		for(int i = 0; i<list.size(); i++){
			if(list.get(i).getTel() == tel){
				p = list.get(i);
			}
		}
		return p;
	}// findPerson

	public ArrayList findPerson(String name) {
		ArrayList<Person> temp = new ArrayList<Person>();
		for(int i = 0; i<list.size(); i++){
			if(list.get(i).getName().equals(name)){
				temp.add(list.get(i));
			}
		}
		return temp;
	}// findPerson

	// 수정의 대상은 tel이란 필드를 제외한 나머지이다.
	public void updatePerson(String name, int age, String addr, int k, String str) {
	}// updatePerson
}



/*
 * vo 객체들(Student, Teacher, Employee)을 핸들링하기 위한 컨테이너로
 * 이전에는 Person[ ] 을 사용했다.
 * 이번에는 ArrayList에 담아서 핸들링 해보도록 하겠다.
 * ::
 * Test를 수정할게 있으면 수정해서 프로그램을 실행...
 */