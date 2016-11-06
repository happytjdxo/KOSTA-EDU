package poly.step3.test;

import java.util.Vector;

//super class
class Product{
	int price;
	int bonusPoint;
	int pNumber; //상품을 구별하는 유니크한 값
	
	public Product(int price) {
		this.price = price;
		bonusPoint=(int)price/10;
	}
	public int getpNumber() {
		return pNumber;
	}
	public void setpNumber(int pNumber) {
		this.pNumber = pNumber;
	}		
}//
//Sub Class
class TV extends Product{
	TV(){
		super(150);
	}
	public String toString(){
		return "TV";
	}
}
class Computer extends Product{
	Computer(){
		super(100);
	}
	public String toString(){
		return "Computer";
	}
}//
class Audio extends Product{
	Audio(){
		super(35);
	}
	public String toString(){
		return "Audio";
	}
}

//Service Class
class ProductBuyer{
	int money = 1000; 
	int bonusPoint = 0; 
	//Product[ ] items = new Product[10];
	Vector v = new Vector(); //기본적으로 10칸 짜리 반찬통이 만들어진다...
	int index=  0; //배열의 항목을 추가할떄 중가되는 카운터로 사용
	
	public void buyProduct(Product p){
		//물건을 살때마다 배열에 p를 할당...이 부분이 추가됨..
		if(money<p.price){
			System.out.println("잔액이 부족하여 물건을 구입할수 없어여...");
			return;
		}		
		v.add(p);
		money -=p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p +" 를(을) 구입하셨습니다...");
	}
	public void refund(Product p){
		if(v.remove(p)){
			money +=p.price;
			bonusPoint -=p.bonusPoint;
			System.out.println(p+" 를(을) 환불처리 했습니다..");
		}else{
			System.out.println(p+" 에 해당하는 물건이 없어서 지금은 환불처리 힘듭니다..");
		}
		
	}
	public void summary(){
		/*
		 * for문을 이용해서 구입한 물건의 총합관 구입한 물건들의 총 목록을 출력
		 * 이때 필요한 변수가 있다면 해당 메소드 안에서 선언해서 사용
		 * 
		 */
		int sum = 0;
		String itemList = "";
		if(v.isEmpty()){
			System.out.println("구입하신 물건이 없습니다...");
			return;
		}
		for(int i=0; i<v.size(); i++){
			Product p = (Product)v.get(i);//Casing
			sum += p.price;
			itemList += p+" ,";
		}
		System.out.println("구입한 상품의 총 금액 : "+sum+" 만원입니다");
		System.out.println("구입한 상품의 총 목록 : "+itemList+" 입니다");
	}
}
public class ProductBuyerTest3 {
	public static void main(String[] args) {
		TV tv = new TV();
		Computer com = new Computer();
		Audio audio1 = new Audio();
		Audio audio2 = new Audio();
		
		tv.setpNumber(111);
		com.setpNumber(222);
		audio1.setpNumber(333);
		audio2.setpNumber(444);
		
		ProductBuyer buyer = new ProductBuyer();
		
		buyer.buyProduct(tv);
		buyer.buyProduct(com);
		buyer.buyProduct(audio1);
		buyer.buyProduct(audio2);
		
		buyer.summary();
		
		System.out.println("현재 남은 금액은 "+buyer.money+" 만원 입니다.");
		System.out.println("현재 남은 Bonus Point는 "+buyer.bonusPoint+" 점 입니다.");
		
		buyer.refund(audio2);
		
		buyer.summary();
		System.out.println("현재 남은 금액은 "+buyer.money+" 만원 입니다.");
		System.out.println("현재 남은 Bonus Point는 "+buyer.bonusPoint+" 점 입니다.");
		
	}
}

