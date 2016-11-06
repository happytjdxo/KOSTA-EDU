package test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import step3.src.MyService;


public class MyServiceImplTest3 {
	public static void main(String[] args) {
		
		System.out.println("1. 공장을 생성합니다..");
		ApplicationContext factory = 
				new FileSystemXmlApplicationContext("src/step3/src/msg3.xml");
		
		System.out.println("2. getBean() call..");
		MyService service1 = factory.getBean("msg3", MyService.class);
		
		System.out.println("3. Biz Logic call..");
		System.out.println(service1.msg());
	}
}
