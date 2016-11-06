package test;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;

import api2.Message;
import api2.MessageAdvice;
import api2.MessageImpl;
/*
 * target�� �����Ǵ� PointCut�� ProxyFactoryBean���� �����ؼ� ����� �� �ִ�.
 */
public class ApiAopAppTest2 {
	public static void main(String[] args) {
		ProxyFactoryBean pfBean = new ProxyFactoryBean();
		pfBean.setTarget(new MessageImpl());
		
		// 1. ������ Ÿ���� ����Ʈ���� ����.
		NameMatchMethodPointcut pointcut = new NameMatchMethodPointcut();
		
		// target�� sear~�� �����ϴ� �޼ҵ忡 �����ǵ��� �Ѵ�..
		pointcut.setMappedName("search*");
		
		// 2. advisor :: advice + pointcut
		pfBean.addAdvisor(new DefaultPointcutAdvisor(pointcut, new MessageAdvice()));
		
		// 3. pfBean���� target�� ���´�
		Message pfMessage = (Message)pfBean.getObject();
		System.out.println(pfMessage.print());
		System.out.println(pfMessage.message());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		pfMessage.searchAddress("�Ǳ�");
		pfMessage.searchIdMember();
	}
}