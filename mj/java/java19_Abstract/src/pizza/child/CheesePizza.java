package pizza.child;

import pizza.parent.Pizza;

public class CheesePizza extends Pizza {
	
	public CheesePizza(int price, String storeMaker){
		this.price = price;
		this.storeMaker = storeMaker;
	}
	
	@Override
	public void topping() {
		System.out.println("Cheese topping.");
	}
}
