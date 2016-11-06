package cons.review;

	// 운동선수에 대한 정보를 담고 있는 클래스
public class Player {
	String name;
	double salary;
	String agent;
	boolean isManager;
	double bonus;
	
	/*
	 * 선수에 대한 정보를 주입하는 루트로 생성자를 사용했다.
	 * 그렇기 때문에 setter()를 통해서 값의 주입은 필요없다.
	 * 대신에 getter()는 만들어서 주입된 값을 리턴받도록 하자.
	 */
	
	public Player(String name, double salary, String agent, boolean isManager) {
		super();
		// this는 "해당 클래스 자기자신을 가리키는 키워드 : 해당 클래스 멤버인 name"
		this.name = name;
		this.salary = salary;
		this.agent = agent;
		this.isManager = isManager;
	}
	
	public String getPlayerDetails(){
		return name + " 선수의 소속사는 : " + agent ;
	}
	
	//선수의 연봉을 리턴하는 기능을 정의하세요.
	
	public double getYearsalary(){		// 리턴 타입이라고 꼭 String 을 안해도 되는구나..
		return (salary * 12) + bonus;
	}
	
	// 해당 선수가 담당 매니저가 있는지의 여부를 리턴해주는 기능을 정의
	// ctrl + space : 자동완성 기능.
	
	public String getIsManager(){
		return name + "선수의 매니저 여부 : " + isManager;
	}
	
	
}

//avg , avira, avast ->백신










