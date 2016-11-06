package condition.book.test;

import java.util.Scanner;

public class FlowExamTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("score, grade를 각각 입력하세요.\n");

		int score = sc.nextInt();
		String name = sc.next();
		String grade = "";

		/*String grade ="";
		System.out.println( " 당신의 점수는 " + score + " 입니다. ");*/

			if (score >= 90 ){
				grade = "A";
				if( score >= 98) { 
					grade += " + " ; 
				}else if( score>90 && score <= 94){
					grade += " - ";
				}
			}else if(score >= 80) { 
				grade = "B";
				if( score >= 88) {
					grade +=  " + ";
				}else if( score < 84) {
					grade += "-" ;
				}
			}else{
				grade = "C";
			}
			System . out . println(name+"의 학접은 " + grade + "입니다. " ) ;
		}
	}
	//java [예제 4-5]를 scanner를 이용해서 해보세요.