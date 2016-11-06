package test;

import step2.src.MessageBean;
import step2.src.MessageBeanEn;
import step2.src.MessageBeanKr;

public class MessageBeanTest2 {

	public static void main(String[] args) {
		MessageBean bean1 = new MessageBeanEn();
		MessageBean bean2 = new MessageBeanKr();
		
		bean1.sayHello("Spring..");
		bean2.sayHello("스프링");
	}
}
/*
 * step1에 비해서 인터페이스를 이용함으로써
 * 결합도가 많이 loose해 졌다.
 * 결합도가 낮아짐 --> 재사용성이 이전에 비해서 강화됬음을 의미한다.
 * 
 * 하지만 여전히 문제점은 남아있다.
 * new라는 키워드는 여전히 남아있다.
 * 이 말은 구상객체명이 코드상에서 거론된다는 것이고 이는 재사용성을 떨어뜨리는
 * 결정적인 요인이 된다.
 * 
 * --> 어떻게 해결할까?
 * 누군가가 직접 생성하면 된다.
 * 우리는 이전에 FactoryMethod Pattern에서 ControllerFactory를
 * 구현하고 작성한 경험이 있다. 이런 패턴으로 만들어도 된다.
 * 이런 빈(컴포넌트)을 직접 생성하는 컨테이너를 소개하겠다.
 * DI/IOC 컨테이너를 사용해 보도록 하겠다.		(IOC :: 제어의 역전)
 */