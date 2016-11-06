package pojo4_anno;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/*
 * Advice ���� ::
 * 1) POJO
 * 2) AfterReturning ���
 * 3) ���ڰ����� JoinPoint..��� aspectJ ���� �����Ѵ�.
 * ::
 * MethodInvocation > Invocation > JoinPoint..proceed()�� �־���..aopalliance
 */
@Aspect
public class AfterRetuningAdvice {
	//ret: target�� BL()�� ����� �� ���ϵ� �����.
	@AfterReturning(pointcut = "execution(* pojo4_anno.Dao*.fi*())", returning = "ret")
	public void afterMethod(JoinPoint jp, Object ret) throws Throwable{
		String tcname = jp.getSignature().getName();
		System.out.println("target�� �޼ҵ�� :: " + tcname + ", ret :: " + ret);
	}
}

/*
 * String methodName = invocation.getMethod().getName();
 * String methodName = pjp.getSignature().getName()
 */