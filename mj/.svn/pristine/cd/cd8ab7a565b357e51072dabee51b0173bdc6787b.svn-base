package cons.step4;
/*
 * this 사용법 ::
 * " 해당 클래스 자기 자신을 의미하는 키워드 "
 * 1) 로컬변수와 필드와 이름이 같을 때 이를 구분하기 위해서 필드 앞에 붙인다.
 * 2) 생성자 앞에 붙인다.
 * 		같은 클래스 내에서 또 다른 생성자를 호출할때 this가 쓰인다.
 * 		생성자 오버로딩에서 반드시 사용될 수 밖에 없다.
 */

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
		this(ssn, name, tel, null, null, null);		// 21라인으로 이동한다.
	}

	public Member(String ssn) {
		this(ssn,null,0,null,null,null);
	}

	public Member(String ssn, int tel) {
		this(ssn,null,0,null,null,null);
	}

	/*public String getDetails() {
		return ssn + " " + name + " " + tel + " " + address + " " + email + " " + date;	//추가                                                                                                                                   ;	// 추가
	}*/

	@Override
	public String toString() {
		return ssn + name + tel	+ address + email + date;
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
