package sample2;

import org.springframework.beans.factory.annotation.Autowired;

public class MessageBeanImpl implements MessageBean{

	private String name;	// ������ ����
	private String greeting;	// setter() ����
	
	//�߰�..
	private Outputter outputter;

	@Autowired
	public MessageBeanImpl(String name) {
		this.name = name;
	}
	
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public void setOutputter(Outputter outputter) {
		this.outputter = outputter;
	}

	@Override
	public void sayMessage() {
		String message = greeting + " " + name + "~~~~";
		System.out.println("MESSAGE :: " + message);
	}
}
