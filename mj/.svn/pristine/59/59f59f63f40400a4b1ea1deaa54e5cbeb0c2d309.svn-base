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
	/*Person[ ] p;
	int index;//0
*/	
	private ArrayList<Person> list; //필드를 ArrayList로 수정
	
	public SchoolManager(int size){
		list = new ArrayList<Person>(size);
	}
	
	//Person들의 모든 정보를 출력하는 기능..
		public void getPersons(){
			for(int i=0; i<list.size(); i++){
				System.out.println("Person Information : "+list.get(i));
			}
		}//getPersons
	
	public void addPerson(Person person)throws DuplicateTelException{
		for(int i=0; i<list.size(); i++){
			if(list.get(i).getTel()==person.getTel())
				throw new DuplicateTelException("그런 사람 이미 있어여...1.addPerson()...");
		}//for		
			list.add(person);	
	}//addPerson
	
	public void deletePerson(int tel)throws RecordNotFoundException{
		boolean found = false;
		for(int i=0; i<list.size(); i++){
			if(list.get(i).getTel()==tel){		
				System.out.println(list.get(i).getName()+" 님이 회원 탈퇴하셨습니다...");
				list.remove(i);
				found = true; //삭제할 대상을 찾았다.
				break;
			}//if
		}//for

		//for문을 다 돌았는데도 동일한 tel을 가진 사람이 없었따...삭제할 대상이 없는 경우
		if(found==false) throw 
		new RecordNotFoundException("삭제할 데상 없음...2. deletePerson()");
		
	}//deletePerson
	
	public Person findPerson(int tel){
		Person person = null;//이거 반드시 해주는 습관 들이자
		for(int i=0; i<list.size(); i++){
			if(list.get(i).getTel()==tel){
				person =list.get(i);
			}
		}
		return person;
	}//findPerson

	public ArrayList findPerson(String name){
		ArrayList<Person> temp = new ArrayList<Person>();
		for(int i=0; i<list.size(); i++){
			if(list.get(i).getName().equals(name)){
				temp.add(list.get(i));
			}
		}
		return temp;
	}//findPerson
	
	//수정의 대상은 tel이란 필드를 제외한 나머지이다.
	public void updatePerson(String name, int age, String addr, int k, String str){
		list.get(k).setName(name);
		list.get(k).setAddress(addr);
		list.get(k).setAge(age);
		if(list.get(k) instanceof Student){
			Student s = (Student)list.get(k);
			s.setStuId(str);
		}
		if(list.get(k) instanceof Teacher){
			Teacher t = (Teacher)list.get(k);
			t.setSubject(str);
		}
		if(list.get(k) instanceof Employee){
			Employee e = (Employee)list.get(k);
			e.setDept(str);
		}		
	}//updatePerson	
}


