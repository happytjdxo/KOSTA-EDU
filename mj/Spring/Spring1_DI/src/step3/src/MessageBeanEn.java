package step3.src;

public class MessageBeanEn implements MessageBean{

	public MessageBeanEn() {
		System.out.println("MessageBeanEn..������.");
	}
	@Override
	public void sayHello(String str) {
		System.out.println("Hello.." + str);
	}
}
