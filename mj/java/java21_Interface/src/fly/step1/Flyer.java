package fly.step1;
/*
 * 	1. 추상 메서드들의 집합.. 완벽한 Template
 * 	일종의 Super class이다.(상속관계)
 */
public interface Flyer {
	int speed = 150;
	void fly();	//무조건 앞에 public abstract가 생략
	public abstract void take_off();
	void land();
}
