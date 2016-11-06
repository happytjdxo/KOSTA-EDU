package cons.step2;

/*
 * 생성자 오버로딩을 왜 써야 하는지에 대한 이해가 필수적이다.
 * 이것은 결과적으로 디비랑 연결된다.
 * 필수 속성만으로 디비에  데이털ㄹ 추가할 수 있고
 * 이렇게 추가된 하나의 Row는 인스턴스화 될어짐을 알아야 한다,
 */
public class Member {
	private String ssn;
	private String name;
	private int tel;
	private String address;
	private String email;

	// 생성자 4개.. 인자값이 다른 생성자.. Constructor OverLoading(특수정보만으로 객체를 만들어 내고 나머지는
	// 기본값으로 ..)
	public Member(String ssn, String name, int tel, String address, String email) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.tel = tel;
		this.address = address;
		this.email = email;
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

	public String getDetails() {
		return ssn + " " + name + " " + tel + " " + address + " " + email;
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
