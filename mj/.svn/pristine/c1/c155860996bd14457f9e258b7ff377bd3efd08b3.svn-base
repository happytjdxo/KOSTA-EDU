package poly.inter.step4.test;

interface Interface {
	void makeProduct(); // public abstract

	void remake();
}

class Provider implements Interface {

	@Override
	public void makeProduct() {
		System.out.println("User가 사용할 상품 생산..");
	}

	@Override
	public void remake() {
		System.out.println("User가 사용할 상품을 다시 수정함..");
	}

}

class Provider2 implements Interface {

	@Override
	public void makeProduct() {
		System.out.println("User가 사용할 상품 생산2..");
	}

	@Override
	public void remake() {
		System.out.println("User가 사용할 상품을 다시 수정함2..");
	}

}

//service
class User {
	public void use(Interface i) { // 이 부분이 달라진다.. 다형성
		i.makeProduct();
	}
}
public class InterfaceTest1 {
	public static void main(String[] args) {
		User user = new User();
		user.use(new Provider2());
		user.use(new Provider());
	}
}