package pojo3;

import org.aspectj.lang.ProceedingJoinPoint;

/*
 * 1) pojo
 * 2) xml ���..aop ��Ű�� ����
 * 3) around ���
 */

public class TimeAdvice {
	public Object time(ProceedingJoinPoint pjp) throws Throwable{
		//target �޼ҵ� ȣ�� ��.. ����
		long start = System.currentTimeMillis();
		String methodName = pjp.getSignature().getName();
		System.out.println(methodName + "method start �ð� :: " + start);
		
		Object retobj = pjp.proceed();
		
		//target �޼ҵ� ȣ�� ��.. ����
		long end = System.currentTimeMillis();
		System.out.println(methodName + "method start �ð� :: " + end);
		
		// �ҿ�ð�
		System.out.println(methodName + " �޼ҵ尡 �� �ҿ�� �ð� :: " + (end-start)/1000 + "��");
		
		return retobj;
	}
}
