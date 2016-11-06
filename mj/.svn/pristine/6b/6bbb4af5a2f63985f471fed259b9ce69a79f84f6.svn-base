package condition.step4.test;

import java.util.Scanner;

/*
 * 콘솔창으로 입려값을 할당 받을려면
 * 1. Scanner 클래스를 생성하고
 * 2. Scanner 클래스의 기능을 이용해야 한다,
 */
public class ScoreIfTest {
	public static void main(String[] args) {
		// int score = 78;
		/*int score = Integer.parseInt(args[0]);
		String name = args[1];*/
		
		// 키보드로 입력한 값을 읽어들이는 Scanner..Constructor Summary를 잘 봐야 한다.
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("score, name을 각각 입력하세요.\n");
		
		
		int score = sc.nextInt();
		String name = sc.nextLine();
		
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
