package condition.step3.test;
/*
 * 컴파일 시점이 아닌 실행시점에 값을 투입
 * 이 투입된 값을 소스 코드에서 다시 변수로 할당할 것이다
 */
public class ScoreIfTest {
	public static void main(String[] args) {
		// int score = 78;
		int score = Integer.parseInt(args[0]);
		String name = args[1];
		
		if (score>=90 && score<=100){
			System.out.println(name + "당신의 학점은 A 입니다.");
		}else if(score>=80 && score<90) {
			System.out.println(name + "당신의 학점은 B 입니다.");
		}else if(score>=70 && score<80) {
			System.out.println(name +"당신의 학점은 C 입니다.");
		}else {
			System.out.println(name + "Try Again!!");
		}
	}

}

/*
 * 문제점 : 
 * 실행 할때 마다 Run<Run Configuration 으로 들어가서 인자값을 일일이 세팅하는 것은
 * 매우 번거로운 일이다.
 * 이런 환경에서 값을 주입시키지 않는다.
 * 
 * 해결책 :
 * 실행시 콘솔창에서 값을 바로 입력하고
 * 입력 된 값이 소스코드의 변수로 할당 되도록 로직을 다시 작성해야 한다.
*/
