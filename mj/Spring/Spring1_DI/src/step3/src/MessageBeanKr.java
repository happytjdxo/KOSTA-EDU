package step3.src;

public class MessageBeanKr implements MessageBean{
	
	public MessageBeanKr() {
		System.out.println("MessageBeanKr..������.");
	}
	@Override
	public void sayHello(String str) {
		System.out.println("�ȳ��ϼ���.." + str);
	}
}
