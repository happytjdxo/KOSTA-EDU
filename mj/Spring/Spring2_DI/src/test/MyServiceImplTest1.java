package test;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import step1.src.MyService;

/*
 * 1. 설정문서를 읽어서 Resource를 반환받는다.
 * 2. Resource를 인자값으로 BeanFactory를 생성
 * 3. 빈을 하나 얻어옴.
 * 4. 빈의 비지니스 로직을 호출함..
 * 	  Hello MyserviceImpl!!를 출력
 *	-----------------------------------------------
 *	빈을 생성하는 컨테이너로 BeanFactory :
 *	"Lazy Loading"
 *	빈 설정문서를 읽어들인 컨테이너가 즉각적으로 빈을 생성하지 않고
 *	요청이 들어왔을때 그때 빈을 생성하는 과정을 거친다.
 * 
 *	BeanFactory의 자식 컨테이너인 ApplicationContext :
 *	"Pre Loading"
 *	빈 설정문서를 읽어 들임과 동시에 빈을 생성한다.
 *	즉 생성하고나서 요청이 들어올 때까지 빈을 보관하는 역할까지 한다는 뜻이다.
 *	서블릿에서 Ready On 과정의 기능이 먼저 작동되기 위해서
 *	load-startup 태그를 기술했던 것과 거의 동일한 원리이다.
 * 
 *	두 컨테이너의 공통점은 빈을 싱글톤으로 만들고 관리한다는 점이다.
 */
public class MyServiceImplTest1 {
	public static void main(String[] args) {
		//Pre Loading이 되도록 로직을 다시 작성
		
//		Resource r = new FileSystemResource("src/step1/src/msg1.xml");
//		BeanFactory factory = new XmlBeanFactory(r);
//		
//		MyService bean1 = factory.getBean("msg1", MyService.class);
//		
//		System.out.println(bean1.printMsg());
		
		System.out.println("1. 공장을 생성합니다..");
		ApplicationContext factory = 
				new FileSystemXmlApplicationContext("src/step1/src/msg1.xml");
		
		System.out.println("2. getBean() call..");
		MyService service1 = factory.getBean("msg1", MyService.class);
		MyService service2 = factory.getBean("msg1", MyService.class);
		
		System.out.println(service1 == service2);	// true
		
		System.out.println("3. Biz Logic call..");
		System.out.println(service1.printMsg());
	}
}
