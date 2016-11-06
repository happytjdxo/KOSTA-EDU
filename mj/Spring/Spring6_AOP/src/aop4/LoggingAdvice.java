package aop4;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

/*
 * 1. pojo.. arround ����� �����̽�.timeLog()
 * 2. xml ���.. aop ��Ű�� ���
 * 3. pointcut�� ǥ�������� JDK ���Խ��� �����.
 * 	  pointcut�� ǥ���� :: within ���
 */
public class LoggingAdvice{
	public void timeLog(ProceedingJoinPoint pjp) throws Throwable{
		String methodName = pjp.getSignature().getName();
		StopWatch sw = new StopWatch();
		sw.start(methodName);
		
		System.out.println("[LOG]Method : " + methodName + " is Calling");
		pjp.proceed();
		//
		sw.stop();
		System.out.println("[LOG]Method : " + methodName + " was Called");
		System.out.println("[LOG ó���ð�] : " + sw.getTotalTimeMillis()/1000 + "��");
	}
}
