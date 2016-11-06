package prob;
/*
 * MemberService�� ���������� ProductService��
 * �����Ͻ� ����(Core Concern)�� �� �ִ� Target ��ü�̴�.
 * ������ �ٽ����� ���� ���̿� �μ����� ���ɰ�(Cross Cutting Concern)��
 * ��������� ����ִ�..�׷��⿡ Oop�� ������ �帮�� �ִ�.
 */
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ProductService {
	private Log log = LogFactory.getLog(getClass());
	//�����Ͻ� ����
	public void deleteProduct(){
		System.out.println("��ǰ�� �����Ǿ����ϴ�.");
		
		log.info("delete Product..");
	}
	
	public void updateProduct(String id){
		//�����Ͻ� ���� �մ� ġ��
		System.out.println("��ǰ ������ �����߽��ϴ�..");
		
		log.info("update Product..");
	}
	
	public void searchProduct(String id){
		System.out.println(id + " �� ��ǰ�� �˻��߽��ϴ�.");
		log.info("search Product..");
	}

}
