package test;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import step1.src.MyService;

/*
 * 1. ���������� �о Resource�� ��ȯ�޴´�.
 * 2. Resource�� ���ڰ����� BeanFactory�� ����
 * 3. ���� �ϳ� ����.
 * 4. ���� �����Ͻ� ������ ȣ����..
 * 	  Hello MyserviceImpl!!�� ���
 *	-----------------------------------------------
 *	���� �����ϴ� �����̳ʷ� BeanFactory :
 *	"Lazy Loading"
 *	�� ���������� �о���� �����̳ʰ� �ﰢ������ ���� �������� �ʰ�
 *	��û�� �������� �׶� ���� �����ϴ� ������ ��ģ��.
 * 
 *	BeanFactory�� �ڽ� �����̳��� ApplicationContext :
 *	"Pre Loading"
 *	�� ���������� �о� ���Ӱ� ���ÿ� ���� �����Ѵ�.
 *	�� �����ϰ��� ��û�� ���� ������ ���� �����ϴ� ���ұ��� �Ѵٴ� ���̴�.
 *	�������� Ready On ������ ����� ���� �۵��Ǳ� ���ؼ�
 *	load-startup �±׸� ����ߴ� �Ͱ� ���� ������ �����̴�.
 * 
 *	�� �����̳��� �������� ���� �̱������� ����� �����Ѵٴ� ���̴�.
 */
public class MyServiceImplTest1 {
	public static void main(String[] args) {
		//Pre Loading�� �ǵ��� ������ �ٽ� �ۼ�
		
//		Resource r = new FileSystemResource("src/step1/src/msg1.xml");
//		BeanFactory factory = new XmlBeanFactory(r);
//		
//		MyService bean1 = factory.getBean("msg1", MyService.class);
//		
//		System.out.println(bean1.printMsg());
		
		System.out.println("1. ������ �����մϴ�..");
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
