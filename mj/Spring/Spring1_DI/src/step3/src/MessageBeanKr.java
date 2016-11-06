package step3.src;

public class MessageBeanKr implements MessageBean{
	
	public MessageBeanKr() {
		System.out.println("MessageBeanKr..»ı¼ºµÊ.");
	}
	@Override
	public void sayHello(String str) {
		System.out.println("¾È³çÇÏ¼¼¿ä.." + str);
	}
}
