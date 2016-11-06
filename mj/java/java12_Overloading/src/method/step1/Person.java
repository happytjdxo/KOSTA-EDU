package method.step1;
/*
 * Method Overloading ::
 * printAllEmployeeInfo(){
 * printAllStudentInfo(){
 * printAllSubjectInfo(){
 * 위와 같은 경우를 많이 경험했을 것이다.
 * 위의 메소드의 핵심적인 기능은 "print"
 * 그런데 무엇을 print 하느냐에 따라서 method identifier가 달라지고
 * 이는 결론적으로 서로 다른 메소드가 계속 만들어짐을 의미한다.
 * 
 * 메소드의 기능은 비슷한데 처리하는 데이타를 달리하면 되는 경우가 있다.
 * 이것을 우리는 메소드 오버로딩기법을 이용하자.
 * ::
 * 
 * printAllInfo(StudentVO[] vo){
 * printAllInfo(EmployeeVO[] vo){
 * printAllInfo(SubjectVO[] vo){
 * 
 */
public class Person {
/*	public void drink(){
		System.out.println("마신다..");
	}
	public void beerDrink(){
		System.out.println("맥주를 마신다.");
	}
	public void beerTwoCupDrink(){
		System.out.println("맥주를 2잔 마신다");
	}
	public void beerWhoTwoCupDrink(){
		System.out.println("하바리가 맥주를 2잔 마신다");
	}*/
	
	public void drink(){
		System.out.println("마신다..");
	}
	public String drink(String kind){		// 리턴타입은 다를 수 있다. 리턴타입을 신경 쓰지마라. 위에꺼랑 아래꺼랑은 같은거다.
		return kind + " 를 마신다..";
	}
	public String drink(String kind, int jan){
		return kind + " 를 " + jan + " 잔 마신다..";
	}
	public void drink(String who, String kind, int jan){
		System.out.println(who + " 가 " + kind + " 를 " + jan + " 잔 마신다..");
	}
}

/*
	Method Overloading Rule
	::
	1. 하나의 클래스에서 적용됨
	2. 메소드 이름은 반드시 일치
	3. 메소드 argument List는 반드시 달라야 함.
	   (인자값의 순서, 갯수, 타입 중 하나라도...)
	   ex) void round(int j, int i){			
	   	   int round(int i, int j){
	4. 리턴 타입은 상관 없다.
	
	    하는 일은 같지만 처리하는 데이타 들을 달리할때 쓰는 기법.
	*/

