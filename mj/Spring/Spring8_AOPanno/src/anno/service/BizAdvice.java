package anno.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/*
 * Advice ���� :
 * POJO
 * xml���.. (aop��Ű��..<aop:config>)
 * Annotation..
 * Aspect-J	/ execution()
 * Aspect-J :: pointCut�� ����
 * anno ��Ű�� ������ ��� ��Ű���� �ִ� ..
 * BizService�� �����ϴ� Ŭ����..�� �ִ� �޼ҵ�..
 * �޼ҵ��� ���ڰ��� 0�� �̻�.
 * anno1.xml
 */
@Aspect
public class BizAdvice {
	@Before("execution(void anno..BizService.*(..))")
	public void beforeMethod(JoinPoint jp) {
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Target Method Name :: [" + jp.getSignature().getName() + "]");
		System.out.println("Target Class Name :: [" + jp.getTarget().getClass() + "]");
		System.out.println("Today is : " + f.format(new Date()));
		
	}
}
