package broker.twotier.exception;

public class RecordNotFoundException extends Exception{
	public RecordNotFoundException(String message) {
		super(message);
	}
	
	public RecordNotFoundException() {
		this("�����Ͱ� �������� �ʽ��ϴ�.");
	}
}
