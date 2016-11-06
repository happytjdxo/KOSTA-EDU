package org.school.exception;

public class RecordNotFoundException extends Exception{

	public RecordNotFoundException() {
		this("그런 사람은 없습니다.");
	}

	public RecordNotFoundException(String message) {
		super(message);
	}
	
}
