package condition.book.test;

public class FlowExamTest2 {

	public static void main(String[] args) {
		int a = 0 ;
		System.out.println(a++);
		System.out.println(++a);
		a= a+1;
		
		System.out.println(a);
		
		
		int visitCount = 5;
		if (visitCount < 1) { 
			System.out.println("처음 오셨군요. 방문해 주셔서 감사 합니다.");
		}else{
			System.out.println("다시 방문해 주셔서 감사합니다.");
		}
		System.out.println("방문횟수는 " + visitCount++ + "번 입니다.");
		System.out.println(visitCount);
	}

}
// java [예제 4-2]
