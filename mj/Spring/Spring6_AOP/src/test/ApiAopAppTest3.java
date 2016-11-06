package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import api3.MessageBean;

//84page ����
public class ApiAopAppTest3 {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/api3.xml"));
		/*
		 * proxy��� �̸����� ȹ��� ���� �츮�� �˰� �ִ� target�� �ƴ�
		 * �̹� ProxyFactoryBean���� ȹ���� pfTarget�̶�� ����� ������ �ȵȴ�.
		 * �����̽��� ��� �ۼ��߰� ���� aop �����ӿ�ũ�� ������ ProxyFactory���� ���ư���.
		 */
		MessageBean bean = (MessageBean)factory.getBean("proxy");
		
		bean.sayHello();
	}
}
