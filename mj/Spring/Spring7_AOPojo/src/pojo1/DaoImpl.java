package pojo1;

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
}
