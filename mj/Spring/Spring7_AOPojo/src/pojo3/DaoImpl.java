package pojo3;

import org.springframework.beans.factory.annotation.Autowired;

public class DaoImpl implements Dao{
	
	@Override
	public void register() {
		// �ð��� 5�� ���� ������Ű��..
		for(int i =1; i<5; i++) {
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}//for
		//�����Ͻ� ����..
		System.out.println("Connection���� �� ȸ������ ok.");
	}

	@Override
	public String re() {
		System.out.println("re() call..");
		return "re Value Returning";
	}

	@Override
	public String findId() {
		System.out.println("findId() call..");
		return "member id return";
	}

	@Override
	public void findMember() {
		System.out.println("findMember() call..");
	}

	@Override
	public void updateMember() {
		System.out.println("updateMember() call..");
	}
}
