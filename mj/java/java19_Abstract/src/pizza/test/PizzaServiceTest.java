package pizza.test;

import java.util.Vector;

import pizza.child.CheesePizza;
import pizza.child.PineApplePizza;
import pizza.child.PotatoPizza;
import pizza.parent.Pizza;
import pizza.service.PizzaService;

public class PizzaServiceTest {
	public static void main(String[] args) {

		PizzaService service = new PizzaService();
		Vector<Pizza> v = new Vector<Pizza>(1,1);
		v.add(new PotatoPizza(17000, "PizzaHut"));
		v.add(new PineApplePizza(15000, "Domino Pizza"));
		v.add(new CheesePizza(20000, "Mister Pizza"));
		
		// Vector안에 들어있는 2번째 객체를 받아오고 싶다.
		v.get(1).makePizza();
		
		System.out.println(v.capacity());
		service.allMakePizza(v);
		
		System.out.println(v);
	}
}
