package api2;
// �ֿ���ɻ簡 ����ִ�. ���ü, Target
public class MessageImpl implements Message{
	
	private String message;	//������ ���..�����ڷ� �ϰڴ�.

	public MessageImpl() {
		message = "Nice Day~~";
	}
	
	@Override
	public String print() {
		System.out.println("Test Print.." + message);
		return "Spring Print";
	}

	@Override
	public String message() {
		
		return message;
	}

	@Override
	public void searchMember() {
		System.out.println("serarch Member");
	}

	@Override
	public void searchIdMember() {
		System.out.println("serarch ID Member");
	}

	@Override
	public void searchAddress(String addr) {
		System.out.println("serarch Member Address");
	}
}
