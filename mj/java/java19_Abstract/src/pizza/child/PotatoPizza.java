package pizza.child;

import pizza.parent.Pizza;

public class PotatoPizza extends Pizza {
	
	public PotatoPizza(int price, String storeMaker){
		this.price = price;
		this.storeMaker = storeMaker;
	}
	
	@Override
	public void topping() {
		System.out.println("Potato topping.");
	}
}
