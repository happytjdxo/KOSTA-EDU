package jdbc.mvc.exception;

public class DuplicateIDException extends Exception{
	public DuplicateIDException(String message) {
		super(message);
	}
	public DuplicateIDException(){
		this("�̹� �����ϴ� �������Դϴ�.");
	}
}
