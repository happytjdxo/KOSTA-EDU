package test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import step2.src.MyService;


public class MyServiceImplTest2 {
	public static void main(String[] args) {
		
		System.out.println("1. 공장을 생성합니다..");
		ApplicationContext factory = 
				new FileSystemXmlApplicationContext("src/step2/src/msg2.xml");
		
		System.out.println("2. getBean() call..");
		MyService service1 = factory.getBean("msg2", MyService.class);
		
		System.out.println("3. Biz Logic call..");
		System.out.println(service1.printMsg());
	}
}
