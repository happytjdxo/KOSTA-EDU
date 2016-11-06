package constructor.cons;
//필드를 초기화시킬 setter() 대신에 생성자(명시적)를 사용해본다,

public class Student{
	String name;	//null
	int stuId;		//0
	String subject;	//null

	// 명시적 생성자 : 필드 초기화
	public Student(String n, int id, String su){
		name = n;
		stuId = id;
		subject = su;
	}

	public String getStudentInfo(){
		return name + " " + stuId + " " + subject;
	}
}

