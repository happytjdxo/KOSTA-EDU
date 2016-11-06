package chapter03;
/*
class의 구성요소 :
Filed / Method 로만 구성
*/
class  Person{
	String name;
	int age;
	
	public String getDetails(){
		return name+"\t"+age; // 원래 이 메소드를 호출한 곳으로..

	}
	// 필드에 값을 할당받는 기능을 추가.
	public void setPersonInfo(String n, int a){
		name = n;
		age = a;
	}
}