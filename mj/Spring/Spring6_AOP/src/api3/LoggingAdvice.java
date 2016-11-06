package api3;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.StopWatch;

/*
 * 1. api ���.. arround ����� �����̽�
 * 2. xml ���.. aop ��Ű���� ��� ����.. ���� ���� �����ϰڴ�.
 * 3. pointcut�� ǥ�������� JDK ���Խ��� �����.
 * 	  pointcut�� ǥ���� :: 
 * 		1) JDK ���Խ�
 * 		2) Aspect-J ǥ����
 */
public class LoggingAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		//
		String methodName = invocation.getMethod().getName();
		StopWatch sw = new StopWatch();
		sw.start(methodName);
		
		System.out.println("[LOG]Method : " + methodName + "is Calling");
		Object rtnObj = invocation.proceed();
		
		//
		sw.stop();
		System.out.println("[LOG]Method : " + methodName + "was Called");
		System.out.println("[LOG ó���ð�] : " + sw.getTotalTimeMillis()/1000 + "��");
		return rtnObj;
	}
}
