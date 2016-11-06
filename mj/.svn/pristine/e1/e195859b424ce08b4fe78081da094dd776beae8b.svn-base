package poly.test;

import poly.service.EmployeeService;
import poly.vo.Employee;
import poly.vo.Engineer;
import poly.vo.Manager;

public class EmployeeServiceTest {
	public static void main(String[] args) {
		Manager m1=  new Manager("m123", "이정재", "방배동", 4000, "기획부");
		Manager m2=  new Manager("m332", "박은정", "서초동", 3000, "운영부");
		Engineer e1 = new Engineer("eg23", "제임스", "방배동", 4500, "C#", 500);
		Engineer e2 = new Engineer("eg56", "고슬링", "장위동", 6300, "jsp", 300);
		
		EmployeeService service = new EmployeeService();
		
		System.out.println("************* 1. printInfo calling ***************");
		service.printInfo(m2);
		service.printInfo(e1);
		
		System.out.println("\n ********* 2. printAllInfo calling **************");
		Employee[ ] arr = {m1,m2,e1,e2};
		service.printAllInfo(arr);
		
		System.out.println("\n ********* 3. findByEmpId calling ***************");
		Employee emp = service.findByEmpId(arr, "m332");
		System.out.println(emp);
		
		System.out.println("\n ********* 4. findByAddress calling ***************");
		Employee[ ] empAll = service.findByAddress(arr, "방배동");
		//for문을 사용해서 결과를 출력해봄...
		for(int i=0; i<empAll.length; i++){
			if(empAll[i] == null)
				continue;	//break는 이때는 안된다.
			System.out.println(empAll[i].getName() + "" + empAll[i].getAddr());
		}
			//  
		
		
		System.out.println("\n ********* 5. getAnnualSalary calling ***************");
		System.out.println("Annual Salary1 :: "+service.getAnnualSalary(e1));
		System.out.println("Annual Salary2 :: "+service.getAnnualSalary(m1));
		
		System.out.println("\n ********* 6. geTotalCost calling ***************");
		System.out.println("[ 모든 고용인들의 총 인건비는 ] :: "+
		                    service.getTotalCost(arr));		
	}
}

