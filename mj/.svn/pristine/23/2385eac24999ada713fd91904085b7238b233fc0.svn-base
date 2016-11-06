package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import collection3.Bus;
import collection3.PrivateSchool;


public class CollectionTest3 {

	public static void main(String[] args) {
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("collection3/collection3.xml");
		
		Bus bus1 = factory.getBean("bus1",Bus.class);
		System.out.println(bus1);
		
		PrivateSchool school = factory.getBean("school",PrivateSchool.class);
		ArrayList<String> stuNames=school.getStuNames();
		
		for(String names : stuNames)
			System.out.println("학생들 이름 :: "+names);
		
		System.out.println("//////////////////////////////////////////");
		
		ArrayList<Bus> busList=school.getBusList();
		for(Bus b : busList)
			System.out.println(b);
		
		System.out.println("/////////////////////////////////////////");
		Map<String, Bus> map=school.getBusMap();
		Iterator<String> it=map.keySet().iterator();
		while(it.hasNext()){
			String key = it.next();
			Bus bus=map.get(key);
			System.out.println("key : "+ key+" :: value :: "+bus);
		}		
	}
}






















