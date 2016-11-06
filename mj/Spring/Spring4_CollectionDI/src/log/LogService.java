package log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
/*
 * �츮�� �������� �ۼ��� ���ø����̼��� ������ �� ����Ǵ����� Ȯ���ϱ� ���ؼ�
 * �ַܼ� ������ ����ϴ� �ڵ带 �������� �ۼ��ؼ� �־���.
 * ������ �׽�Ʈ�� ��� �ڵ忴�� �̰��� �Ź� �޼ҵ帶�� ������ �ʰ� ����.
 * 
 * ���������� System.out.println()�̶� �ڵ� ��ſ� Log ���Ϸ� ����Ѵ�.
 * ::
 * Log ���Ϸ� ����� �ҷ���
 * 1. LogFactory�� �ϳ� �����ؾ� �Ѵ�.
 *   --> Library �� �ϳ� �� �߰��Ǿ����� �Ѵ�.
 * 2. Log ������ ����ϴ� ������� ���������� �ִ�.
 *   --> �� �߿��� �������� ���� ���� ����ϴ� log4j ������ �̿��� ���ڵ�.
 * 3. log4j ������ ����ϸ� Log �� ���� ������ �������� �����ؼ� ���� �ִ�.
 *    trace>debug>info>warn>error>fatal
 * 4. log4j ������ ���� ��ġ 
 *   --> server �� : WEB-INF>classes �ٷ� �Ʒ�.
 *   --> eclipse �� : src �ٷ� ��.
 *  
 */
public class LogService {
	private Log log = LogFactory.getLog(getClass());
	
	public void testLogging(){
		//�������� �޼����� ���...
		log.trace("trace ...message..."); //�� ������ ���� ������..
		log.debug("debug ...message...");
		log.info("info ...message...");
		log.warn("warn ...message...");
		log.error("error ...message");
		log.fatal("fatal ... message");
	}
}























