/*package count.self1.test;

import java.util.Scanner;

class Employee{
	//
	static int empzz;
	Employee(){
		//
		empNum++;
		System.out.println("사원 객체 생성 :" + empNum);
		System.out.println("생성된 사원의 객체수 :" + empNum);
	}
	//getEmpNum() 구현
	public static int getEmpNum(){
		return empNum;
	}
}
public class EmployeeCountTest1 {
	public static void main(String[] args) {
		System.out.println("실행시에 콘솔창을 이용해서 배열의 사이즈 값을 직접 입력!!\n");
		Scanner sc = new Scanner(System.in);
		//필요한 로직 구현...
		Employee[] em = new Employee[sc.nextInt()];
		for(int i =0; i<em.length; i++){
			em[i] = new Employee();
		}
	}
}
*/
package count.self1.test;
/*
 * static 한 성질을 알아보는 문제.
 */
import java.util.Scanner;

class Employee {
	//
	static int empCounter;

	Employee() {
		//
		++empCounter; // ++이 앞에 붙는거랑 뒤에 붙는거랑 무슨 차이?
		System.out.println("사원 객체 생성 :" + empCounter);
	}

	// getEmpNum() 구현
	public static int getEmpNum() {
		return empCounter;
	}
}

public class EmployeeCountTest1 {
	public static void main(String[] args) {
		System.out.println("실행시에 콘솔창을 이용해서 배열의 사이즈 값을 직접 입력!!\n");
		Scanner sc = new Scanner(System.in);
		// 필요한 로직 구현...
		int count = sc.nextInt();
		Employee[] ea = new Employee[count];
		for (int i = 0; i < ea.length; i++) {
			ea[i] = new Employee();
			System.out.println("생성된 사원의 객체수" + ea[i].getEmpNum());
		}
	}
}
