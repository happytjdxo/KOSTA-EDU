package poly.step1.test;

//	super class
class Product {
	int price;
	int bonusPoint;

	// 상품이 만들어질때 가격이 정해진다. 이때 보너스도 함께 정해짐.
	// (상품가격의 10%)
	public Product(int price) {
		this.price = price;
		bonusPoint = (int) price / 10;
	}
}// class
// Sub Class

class TV extends Product {
	TV() {
		super(150);
	}

	public String toString() {
		return "TV";
	}
}

class Computer extends Product {
	Computer() {
		super(100);
	}

	public String toString() {
		return "Computer";
	}
}// class

// Service Class
class ProductBuyer {
	int money = 1000; // 가진돈이 일천만원
	int bonusPoint = 0; // 현재 포인트가 0으로 시작(구입한 물건이 아직 없다.)

	/*
	 * 가진돈 보다 물건의 가격이 작을 경우에만 구입할 수 있다.
	 * 상품의 가격만큼 보유금액은 줄어들고 / 포인트 상품가는 늘어야함(10%증가) 
	 * 최종적으로 구입한 상품을 출력
	 */
	
	public void buyTv(TV tv) {
		if (money < tv.price) {
			System.out.println("잔액이 부족하여 물건을 구입할수 없습니다.");
			return; // buyTv() 하기 전으로 돌려 놓음.
		}
		// 상품 사는 로직 작성.
		money -= tv.price;
		bonusPoint += tv.bonusPoint;
		System.out.println(tv + "를(을) 구입하셨습니다.");
	}

	public void buyCompuer(Computer com) {
		if (money < com.price) {
			System.out.println("잔액이 부족하여 물건을 구입할수 없습니다.");
			return; // buyCom() 하기 전으로 돌려 놓음.
		}
		// 상품 사는 로직 작성.
		money -= com.price;
		bonusPoint += com.bonusPoint;
		System.out.println(com + "를(을) 구입하셨습니다.");
	}
}

public class ProductBuyerTest1 {
	public static void main(String[] args) {
		TV tv= new TV();
		Computer com = new Computer();
		ProductBuyer buyer= new ProductBuyer();
		
		buyer.buyTv(tv);
		buyer.buyCompuer(com);
		
		System.out.println(" 현재 남은 금액은 " + buyer.money + "만원 입니다.");
		System.out.println(" 현재 남은 금액은 " + buyer.bonusPoint + "점 입니다.");
	}
}
