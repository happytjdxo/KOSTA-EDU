package overloading.self2.test;

class Rect{
	static final int BASE_SIZE = 3;
	public void math(int base){
		System.out.println("���簢���� ���� :: "+ base*base);
	}
	public void math(int base, int height){
		System.out.println("���簢���� ���� :: "+ base*height);
	}
	public void math(int base, int height, int weight){
		System.out.println("�簢���� ���� :: "+ base*height*weight);
	}
	
}
public class RectTest2 {
	public static void main(String[] args) {
		System.out.println("***���簢���� ���� ���̴� 3���� �����Ǿ� �ֽ��ϴ�.****");
		
		//�� �κ��� �����ϼ���...
		//����ÿ� int ���� ��� �ִ��Ŀ� ���� Rect Ŭ������ ȣ��Ǵ� �޼ҵ���� �� �޶�����.
		//args ������ �̿��ؼ� ������ �ۼ��ϼ���...
		
		/*
		 * more advanced...
		 * ����� ���� �ϳ��� �ȳ������....? 
		 * ���� ó���ؼ� "���ڰ��� �ϳ��̻� �Է��ϼ���..."�޼��� ��µǵ���
		 */

	}
}













