package broker.three.exception;

public class InvalidTransactionException extends Exception{
	public InvalidTransactionException(String message){
		super(message);
	}
	
	public InvalidTransactionException(){
		this("���� �ֽ��� ������ �ȷ��� �ֽ��� ���� �����ϴ�");
	}
}
