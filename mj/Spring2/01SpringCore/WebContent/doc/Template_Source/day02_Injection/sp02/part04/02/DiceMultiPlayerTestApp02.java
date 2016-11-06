package spring.service.dice.test;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.service.dice.Dice;
import spring.service.dice.play.MultiPlayer;

/*
 * FileName : DiceMultiPlayerTestApp02.java
 */
public class DiceMultiPlayerTestApp02 {
	
	///Main Method
	public static void main(String[] args){
		
		//1. ApplicatiContext �̿� Wiring(��ü�� �������� �����ϴ� DI  �� instance ���� �۾�) 
		ApplicationContext factory =
								new ClassPathXmlApplicationContext(
								//��Ÿ����Ÿ�� ���ȭ....																					}			
																);

		//2. Container �� ���� multiPlayer04  id �� ���� instance Dependency Look Up
		MultiPlayer multiPlayer04 = (MultiPlayer)factory.getBean("multiPlayer04");
		Set<Dice> diceSet = multiPlayer04.getDiceSet();
		System.out.println("\n===== multiPlayer04 ======");
		System.out.println(":: ����� �ν��Ͻ� ���� : "+diceSet.size()+"EA");
		System.out.println(":: "+diceSet);
		
		//3. Container �� ���� multiPlayer05  id �� ���� instance Dependency Look Up
		MultiPlayer multiPlayer05 = (MultiPlayer)factory.getBean("multiPlayer05");
		Map<String, Dice> diceMap = multiPlayer05.getDiceMap();
		System.out.println("\n===== multiPlayer05 ======");
		System.out.println("����� �ν��Ͻ� ���� : "+diceMap.size()+"EA");
		System.out.println(":: "+diceMap);
		
		//4. Container �� ���� multiPlayer06  id �� ���� instance Dependency Look Up
		MultiPlayer multiPlayer06 = (MultiPlayer)factory.getBean("multiPlayer06");
		Properties properties = multiPlayer06.getDiceProperties();
		System.out.println("\n===== multiPlayer06 ======");
		System.out.println("����� key=value ���� : "+properties.size()+"EA");
		System.out.println(":: "+properties);

	}
}//end of class