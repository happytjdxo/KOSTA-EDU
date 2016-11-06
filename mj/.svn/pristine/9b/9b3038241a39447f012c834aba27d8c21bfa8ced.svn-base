package cons.step3;


public class Member {
	private String ssn;
	private String name;
	private int tel;
	private String address;
	private String email;
	private RegisterDate date;	// 추가
	
	// 생성자 4개.. 인자값이 다른 생성자.. Constructor OverLoading(특수정보만으로 객체를 만들어 내고 나머지는
	// 기본값으로 ..)
	public Member(String ssn, String name, int tel, String address, String email, RegisterDate date) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.tel = tel;
		this.address = address;
		this.email = email;
		this. date = date;
	}

	public Member(String ssn, String name, int tel) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.tel = tel;
	}

	public Member(String ssn) {
		super();
		this.ssn = ssn;
	}

	public Member(String ssn, int tel) {
		super();
		this.ssn = ssn;
		this.tel = tel;
	}

	/*public String getDetails() {
		return ssn + " " + name + " " + tel + " " + address + " " + email + " " + date;	//추가                                                                                                                                   ;	// 추가
	}*/

	@Override
	public String toString() {
		return ssn + name + tel + address + email + date;
	}
	

	// Method OverLoading
	public void register(String course) {
		if (!course.equals("암벽등반")) {
			System.out.println(course + " 는 무조건 1Level만 있습니다.");
		}
	}


	public void register(String course, int level) {
		if (course.equals("암벽등반")) {
			System.out.println(level + "level!!");
		}
	}

}
