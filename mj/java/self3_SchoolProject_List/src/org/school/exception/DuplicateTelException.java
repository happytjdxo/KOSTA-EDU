package org.school.exception;

public class DuplicateTelException extends Exception{

	public DuplicateTelException() {
		this("이미 있는 사람 입니다.");
	}

	public DuplicateTelException(String message) {
		super(message);
	}
}
