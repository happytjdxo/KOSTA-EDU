package poly.inter.step3.test;

class Provider {
	public void product() {
		System.out.println("User가 사용할 상품 입니다..");
	}
}

//service
class User {
	public void use(Provider p) { // Provider를 사용하는 관계(Hasing)
		p.product();

	}
}

public class InterfaceTest1 {
	public static void main(String[] args) {
		User user = new User();
		user.use(new Provider());
	}
}