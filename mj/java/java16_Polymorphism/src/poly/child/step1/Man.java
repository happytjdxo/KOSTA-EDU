package poly.child.step1;

import poly.parent.step1.Animal;

public class Man extends Animal {

	public boolean jooryang ;
	
	@Override
	public void eat() {
		System.out.println("수저를 이용해서 먹는다..");
	}
	@Override
	public String sleep(int hour) {
		return "침대 위에서 쿨쿨쿨..";
	}
	
	//Man만 가지고 있는 기능..
	public void drive(){
		System.out.println(jooryang + ":: 승용차를 운전해서 출근한다..");
	}
}
