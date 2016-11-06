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

public class SchoolManager2 {
	private ArrayList<Person> list;
	
	public SchoolManager2(int size) {
		list = new ArrayList<Person>();
	}
	
	//Person들의 모든 정보를 출력
	public void getAllgetPersonInfo(){
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
	}
	//Person 추가
	public void addPerson(Person person) throws DuplicateTelException{
		for(int i =0; i<list.size(); i++){
			if(list.get(i).equals(person)){
				throw new DuplicateTelException();
			}
		}
		list.add(person);
	}
	//Person 삭제
	public void deletePerson(int tel) throws RecordNotFoundException {
		boolean find = false;
		for(int i = 0; i<list.size(); i++){
			if(list.get(i).getTel()==tel){
				list.remove(i);
				find = true;
				break;
			}
		}
		if(!find) {
			throw new RecordNotFoundException();
		}
	}
	public Person findPerson(int tel) {
		Person p = null;
		for(int i = 0; i<list.size(); i++){
			if(list.get(i).getTel() == tel){
				p = list.get(i);
			}
		}
		return p;
	}
	public ArrayList findPerson(String name) {
		ArrayList<Person> temp = new ArrayList<Person>();
		for(int i = 0; i<list.size(); i++){
			if(list.get(i).getName().equals(name)){
				temp.add(list.get(i));
			}
		}
		return temp;
	}
	
	
}