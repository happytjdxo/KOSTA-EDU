package datatype3;

class dataType3{
	public static void main(String[] args) {
		System.out.println("실수형 데이타 타입..\n");
		// long, float, double 과 같은 데이타 타입은 실제값 뒤에 L, F, D
		// 와 같이 타입을 명시 할 수 있고,
		// 특히 실수형에 해당하는 값은 자동적으로 뒤에 D가 붙는다. (대소문자는 상관 없음)

		//float salary = (float) 1200.0d;		// d가 생략되어 있음
		float salary = 1200.0f;
		float yearSalary = salary * 12;
		System.out.println("yearSalary: " + yearSalary);

	}
}
