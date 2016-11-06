package array.step2.test;
/*
 * 5명의 학생들의 성적을 배열에 저장
 * 성적의 총점, 평균을 구하는 로직을 작성..
 */
public class ScoreArrayTest1 {
	private static int i;

	public static void main(String[] args) {
		int sum = 0;
		int avg = 0;
		int[] scores = {90, 88, 76, 94, 80};
		// 1. 각각 학생들의 성적을 먼저 출력.
		// 2. for문을 이용해서 학생들의 총점을 출력
		// 3. 총점을 이용해서 학생들의 평균을 출력
		// 4. 평균 이하의 성적을 받은 학생들 성적을 출력하고 / 인원수를 출력.

		// 1.
		for(int i =0; i<scores.length; i++){
			System.out.print(scores[i]+ " ");
		}
		// 2.
		for(int i =0; i<scores.length; i++){
			sum += scores[i];
		}
		System.out.println(" sum :: " + sum);

		// 3.
		avg=sum/scores.length;
		System.out.println("학생들의 평균 ::" +sum/scores.length);

		// 4. 
		int cnt = 0;
		for(int i =0; i<scores.length; i++){		// 조건이 참일때 마다 ++되는걸 잘 알자.
			if(scores[i]<=avg){
				cnt ++; // cnt = cnt+1;
				System.out.println("평균이하 점수 입니다..\n");
				System.out.println("평균 이하 점수 : " + scores[i] + " ");
			}	// if
		}	// for
		System.out.println("평균이하 성적을 받은 학생수 : " + cnt + " 명!! ");
	}
}






/*for(int i =0; i<scores.length; i++){
		System.out.println(i + "번째 학생의 점수 : " + scores[i]);
	}
	for(int i =0; i<scores.length; i++){
	System.out.println( " 학생들의 총 점수 ");
	System.out.println( i/scores[i]);

 */