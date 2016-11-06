package org.school.service;
/*
 * Person의 구분할수 있는 필드는 tel
 * tel이 존재한다는 것은 사람이 있다는것
 * tel이 존재하지 않는다는 것은 사람이 없다는 것.
 * ::
 * 추가 class
 * org.school.exception.DuplicateTelException
 * org.school.exception.RecordNotFoundException
 * 수정 class
 * SchoolManager	/	SchoolmanagerTest
 * ::
 * 기존에 제어문을 사용자 정의 Exception으로 수정해서 완성하세요.
 * 
 */
import org.school.exception.DuplicateTelException;
import org.school.exception.RecordNotFoundException;
import org.school.vo.Employee;
import org.school.vo.Person;
import org.school.vo.Student;
import org.school.vo.Teacher;

public class SchoolManager {
	//필드
	private Person[] p ;
	private int index;
	
	public SchoolManager(int size){
		p = new Person[size];
	}
	
	//메소드
	public void addPerson(Person per) throws DuplicateTelException {
		for(int i=0; i<index; i++){
			if(p[i].getTel()==per.getTel()){
				System.out.println(" 그런 사람 이미 존재 합니다..");
				return;
			}
		}
		p[index++] = per;
	}
	
	public void deletePerson(int tel) throws RecordNotFoundException {
		
		boolean found = false;
		for(int i =0; i<index; i++){
			if(p[i].getTel()==tel){	//삭제할 사람이 존재
				for(int j=i; j<index-1; j++){
					p[j] =p[j+1];
				}//for
				index--;
				found = true;	// 삭제할 대상을 찾았고 삭제했다.
			}//if
		}//for
		
		//for 문을 다 돌았는데도.. found 값이 false 라면 일치하는 사람이 없어서
		//삭제를 못했다.
		if(found==false){
			System.out.println("삭제할 대상을 찾지 못했습니다.");
		}//deleteperson
	}
	
	public Person[] findPerson(String name){
		Person[] persons = new Person[index];
		for(int i=0; i<index; i++){
			if(p[i].getName().equals(name)){
				persons[i] = p[i];
			}
		}
		return persons;
	}//find Person
	
	public Person findPerson(int tel){
		Person person = null;	//리턴 타입이 있을때. <-이걸 반드시 해주는 습관을 들이자
		for(int i=0; i<index; i++){
			if(p[i].getTel()==tel)
				person = p[i];
		}
		return person;
	}
	
	// 수정의 대상은 tel이란 필드를 제외한 나머지이다.
	public void updatePerson(String name, int age, String addr, String str, int k){
		p[k].setName(name);
		p[k].setAddress(addr);
		p[k].setAge(age);
		if(p[k] instanceof Student){
			Student s = (Student)p[k];
			s.setStuId(str);
		}
		if(p[k] instanceof Teacher){
			Teacher t = (Teacher)p[k];
			t.setSubject(str);
		}
		if(p[k] instanceof Employee){
			Employee e = (Employee)p[k];
			e.setDept(str);
		}
	}//updatePerson
	
	//Person들의 모든 정보를 출력하는 기능..
	public void getPersons(){
		for(int i=0; i<index; i++){
			System.out.println("Person Infomatioin : " + p[i]);
		}
	}//getPersons
}
