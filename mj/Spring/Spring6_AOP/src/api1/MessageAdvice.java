package api1;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/*
 * Advice ���� ::
 * 1) api ���..MethodInterceptor�� ���
 * 2) xml�� ������� �ʰڴ�.
 * ::
 * MethodInterceptor�� ��ӹ����� invoke()�� �������̵� �ؾ� �Ѵ�.
 * <<invoke() �� �۵�����>>
 * 1. invoke()�� ���ڰ����� MethodInvocation�� �� �ִ�.
 * 	  MethodInvocation�� �θ� Invocation > JoinPoint
 * 	  JoinPoint�� proceed()�� �ִ�.
 * 	  proceed()�� ���� ������ ���� �߿��� ������ �ȴ�.
 * 2. proceed()�� ȣ�� ����
 * 	  :
 * 	  target�� B.L()�� ȣ��ɶ� �̸� ���ͼ����� �����̽��� ����ä�
 * 	  proceed()�� ȣ���Ѵ�	-->	target�� B.L()�� ���۵�	--> ������� proceed()��
 * 	   ���ϰ����� �ٽ� ��ȯ�ȴ�.
 * 	  --> �� ��� ������ ProxyFactoryBean���� �̷�����.
 */
public class MessageAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("1. �����Ͻ� ���� ȣ�� �� �����..");
		
		Object obj = invocation.proceed();	// target�� �޼ҵ尡 �̺κп��� �۵���..
		if(obj != null){
			System.out.println("���ϵ� obj�� ::" + obj);
		}
		
		System.out.println("2. �����Ͻ� ���� ���� ��..");
		
		return obj;
	}
}