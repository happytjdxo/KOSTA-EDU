package spring.service.dice.test;

import java.util.Calendar;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.service.dice.Dice;
import spring.service.dice.play.MultiPlayer;

/*
 * FileName : DiceMultiPlayerTestApp01.java
 */
public class DiceMultiPlayerTestApp01 {

	///Main Method
	public static void main(String[] args){
	
		//1. ApplicatiContext �̿� Wiring(��ü�� �������� �����ϴ� DI  �� instance ���� �۾�)
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("/config/dicemultiplayerservice01.xml");

		//2. Container �� ���� multiPlayer01  id �� ���� instance Dependency Look Up 
		MultiPlayer multiPlayer01 = (MultiPlayer)factory.getBean("multiPlayer01");
		List<Dice> diceList = multiPlayer01.getDiceList();
		System.out.println("\n===== multiPlayer01 ======");
		System.out.println(":: ����� �ν��Ͻ� ���� : "+diceList.size()+"EA");
		System.out.println(":: "+diceList);

		
		//3. Container �� ���� multiPlayer02  id �� ���� instance Dependency Look Up 
		MultiPlayer multiPlayer02 = (MultiPlayer)factory.getBean("multiPlayer02");
		Dice[] diceArray = multiPlayer02.getDiceArray();
		System.out.println("\n===== multiPlayer02 ======");
		System.out.println("::����� �ν��Ͻ� ���� :  "+diceArray.length+"EA");
		for (Dice dice : diceArray) {
			System.out.println(":: "+dice);
		}
		
		//4. Container �� ���� multiPlayer03   id �� ���� instance Dependency Look Up 
		MultiPlayer multiPlayer03 = (MultiPlayer)factory.getBean("multiPlayer03");
		Calendar currentDate = multiPlayer03.getCurrentDate();
		System.out.println("\n===== multiPlayer03 ======");
		//==> ��� null Ȯ�� :: ����� null injection 
		System.out.println(currentDate);
		System.out.println(multiPlayer03.getDice());
	}
}//end of class