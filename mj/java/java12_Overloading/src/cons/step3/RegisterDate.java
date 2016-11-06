package cons.step3;

public class RegisterDate {
	private int year;
	private int month;
	private int day;
	
	public RegisterDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	@Override
	public String toString() {
		//return super.toString();	// 객체가 저장된 위치를 리턴.
		return year + "-" + month + "-" + day ;
	}
/*	public String getString() {
		//return super.toString();	// 객체가 저장된 위치를 리턴.
		return year + "-" + month + "-" + day ;
	}*/
	
}
