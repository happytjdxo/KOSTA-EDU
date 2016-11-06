package poly.service;

import poly.vo.Employee;
import poly.vo.Engineer;

/*
 *  1. Manager, Engineer 객체들을 다루는 기능을 가지고 있는 클래스
 *  
 *  	--> Service 클래스가 Employee[] 클래스에 Dependency 해야 한다
 *  		Has a Relation 관계
 *  	--> Employee[] 안에서는 Manager, Engineer 객체들이 할당(참조)되어질 것이다.
 *  	--> Manager, Engineer 객체들을 관리하는 Type이 바로 그들의 부모인 것이다.
 * 
 *  2. 결과적으로 부모타입인 Employee[]를 핸들링하는 기능을 Service가 가지게 된다.
 *  
 *  	--> 어떻게 Hasing 할 것인가?
 *  	--> 기능, 메소드의 인자값으로 Employee[]객체가 Parsing될 것이다.
 *  		Test 클래스에서 이부분은 호출될 것이다.
 *  		::
 *  		Polymorphic Argument
 */
public class EmployeeService {

	// 1. 특정한 객체의 정보를 출력하는 기능.

	public void printInfo(Employee e) {
		System.out.println(e);
	}

	// 2. 모든 객체들의 정보를 출력하는 기능.

	public void printAllInfo(Employee[] ea) {
		for (Employee e : ea) {
			System.out.println(e);
		}
		/*
		 * for(int i=0; i<ea.length; i++){ System.out.println(ea[i]); }
		 */
	}

	// 3. Test 클래스에서 넘겨받은 empId의 값과 일치하는 객체를 리턴하는 기능.

	public Employee findByEmpId(Employee[] ea, String empId) { // 리턴타입이 있을땐 무조건
																// 선언 먼저한다
		// Employee emp = null; // 이부분을 반드시 선언하고 다음 코드로 넘어간다.
		Employee e = new Employee();
		for (int i = 0; i < ea.length; i++) {
			if (ea[i].getEmpId().equals(empId))
				e = ea[i];
			/*
			 * for(Employee emp : ea){ 
			 * if(emp.getEmpId().equals(empId)) 
			 * e = emp;
			 */
		}
		return e;
	}

	// 4. Test 클래스에서 넘겨받은 addr의 값과 일치하는 객체를 리턴하는 기능.

	/*public Employee[] findByAddress(Employee[] ea, String addr) {
		Employee[] emp = new Employee[ea.length];
		int count = 0;
		for (int i = 0; i < emp.length; i++) {
			if (ea[i].getAddr().equals(addr)) { // 똑같은 아이가 2번째 3번째
				emp[count] = ea[i];
				count++;
			}
		}
		return emp;
	}*/

	/*
	 * Employee e1 = new Employee(); for(int i = 0; i<ea.length; i++){
	 * if(ea[i].getAddr().equals(addr)) e1 = ea[i]; } return e1; }
	 */
    
	// count를 사용하지 말고 코드를 작성..
	
	public Employee[] findByAddress(Employee[] ea, String addr) {
		Employee[] emp = new Employee[ea.length];
		//int count = 0;
		for (int i = 0; i < emp.length; i++) {
			if (ea[i].getAddr().equals(addr)) { // 똑같은 아이가 2번째 3번째
				emp[i] = ea[i];
			}
		}
		return emp;
	}
	
	// 5. 특정한 Employee의 연봉을 리턴하는 기능..

	public int getAnnualSalary(Employee e) {
		int annualSalary = 0;
		annualSalary = e.getSalary()*12;
		if(e instanceof Engineer){
			Engineer eg = (Engineer)e;
			annualSalary = eg.getSalary()*12 + eg.getBonus();
		}
		return annualSalary;
	}

	// 6. 연간 총 인건비의 총액을 리턴하는 기능.
	public int getTotalCost(Employee[] ea) {
		int totalCost = 0;
		//for(int i =0; i<ea.length; i++){
		for(Employee emp : ea){
		//	totalCost += getAnnualSalary(ea[i]);
		totalCost += getAnnualSalary(emp);
		}
		return totalCost;
	}
}

/*
 * //1. 특정한 객체의 정보를 출력하는 기능. public void printEmpInfo(Employee emp){ // 2. 모든
 * 객체들의 정보를 출력하는 기능. System.out.println(Employee[]. // 3. Test 클래스에서 넘겨받은 empId의
 * 값과 일치하는 객체를 리턴하는 기능.
 * 
 * // 4. Test 클래스에서 넘겨받은 addr의 값과 일치하는 객체를 리턴하는 기능.
 * 
 * // 5. 특정한 Employee의 연봉을 리턴하는 기능..
 * 
 * // 6. 연간 총 인건비의 총액을 리턴하는 기능.
 */
