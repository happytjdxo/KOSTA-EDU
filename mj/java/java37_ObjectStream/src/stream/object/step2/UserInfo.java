package stream.object.step2;

import java.io.Serializable;

public class UserInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3206802952962590745L;
	static final String DEFAULT_NAME = "아무개";
	static final int DEFAULT_AGE = 22;

	String name;
	int age;

	transient String password;
	int ssn;

	// 생성자
	public UserInfo(String name, int age, String password) {

		this.name = name;
		this.age = age;
		this.password = password;
	}

	public UserInfo() {
		this(DEFAULT_NAME, DEFAULT_AGE, "1111");
	}
	
	public String toString(){
		return "정보출력 \n 이름 : " + name + "\n 나이 : " + age + "\n 비밀번호 : " + password;
	}
	
	public String getPassword() {
		return password;
	}
}
