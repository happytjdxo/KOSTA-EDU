package pizza.service;

import java.util.Vector;

import pizza.parent.Pizza;

/*
 * 다양한 종류의 피자를 만드는 기능을 제공하는 서비스 클래스.
 */
public class PizzaService {

	public void allMakePizza(Vector<Pizza> v){
		for(int i=0; i<v.size(); i++){
			// 각각 피자의 메이크피자를 호출.
			// 1) Vector 안에 들어있는 객체를 받아온다.
			// 2) 그 객체에 makePizza()를 calling.
			Pizza pizza = v.get(i); // vector(i)의 값(주소값)의 할당 과정
			pizza.makePizza();
			System.out.println("=============================");
		}
	}
}
