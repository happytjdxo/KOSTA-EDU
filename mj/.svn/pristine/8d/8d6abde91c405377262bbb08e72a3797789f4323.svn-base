package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import step3.src.MessageBean;


/*
 * bean.xml 빈설정문서를 읽어서
 * 컨테이너가 직접 빈 객체를 생성하도록 할 것이다.
 * 
 * 우리는 컨테이너가 빈을 생성하면 
 * 빈의 타입인 인터페이스를 통해서 메소드를 호출할 것이다.
 * 
 * 결과적으로 인터페이스 기반의 구상객체가 실행되는 것을 볼 수 있을 것이다.
 * 
 */
public class MessageBeanTest3 {

	public static void main(String[] args) {

		System.out.println("1. 빈 설정문서를 읽어들입니다..");
		Resource r = new FileSystemResource("src/step3/src/bean.xml");
		
		System.out.println("2. 설정문서에 등록된 빈을 생성할 공장을 먼저 생성합니다..");
		BeanFactory factory = new XmlBeanFactory(r);
		
		System.out.println("3. 공장에서 생성한 빈을 가져옵니다..");
		
		MessageBean bean1 = factory.getBean("message1", MessageBean.class);
		MessageBean bean11 = factory.getBean("message1", MessageBean.class);
		System.out.println(bean1);
		System.out.println(bean11);
		System.out.println("0605 0605 0605 0605 0605 0605 0605");
		MessageBean bean2 = (MessageBean)factory.getBean("message2");
		
		System.out.println("4. 빈의 비지니스 로직을 호출..구상객체가 실행됨..");
		bean1.sayHello("Spring!");
		bean2.sayHello("스프링!");
	}
}


/*
 * BeanFactory ::
 * BeanFactory, IOC Container, DI Container
 * BeanFactory를 이용하면 Bean의 생성 시점이 Factory가 생성될때 만들어 지는 것이 아니라
 * 클라이언트가 빈을 요청하면 (getBean() 사용) 그때 부랴부랴 빈을 생성한다.
 * 
 * Lazy Loading이라고 한다.
 * 
 * Pre Loading을 하는 것이 좋다.
 * BeanFactory
 * 		|
 * ApplicationContaxt :: 얘는 나중에 바로 사용할 것이다.. 알아두자!
 * 교재 29페이지의 윗 그림을 기억하세요!
 */