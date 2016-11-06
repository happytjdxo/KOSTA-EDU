package array.step2.test;

public class IdolFanAgeTest2 {
	public static void main(String[] args) {
		int[]idol = new int[5];
		idol[0] = 10;
		idol[1] = 20;
		idol[2] = 30;
		idol[3] = 40;
		idol[4] = 50;
		// 1. 세번째 칸의 연령층을 60으로 수정.
		// 2. 해당 배열의 사이즈를 출력.
		// 3. for문을 이용해서 각각의 FanAge를 출력.
		// 4. 30대를 초과하는 연령층을 출력.
		// 5. idol 그룹의 평균 연령대를 출력.    ex) 40대이다~.

		// 1.
		idol[2] = 60;
		// 2.
		System.out.println("size :: " + idol.length + "\n");
		// 3.
		for(int i=0; i<idol.length; i++){
			System.out.print(idol[i] + "대 ");
		}
		// 4. 
		for(int i=0; i<idol.length; i++){
			if(idol[i]>30){
				System.out.print(" 30대보다 큰 연령층 :: " + idol[i] + "대 " + "\n");
			}
		}
		int sum = 0;
		int avg = 0;

		// 5.
		for(int i=0; i<idol.length; i++){
			sum += idol[i];
		}
		System.out.println("idol 그룹의 평균 연령대 ::" + sum/idol.length + "살 " + "\n");

	}
}


/*
//3.
		for(int i=0; i<idol.length; i++){
			System.out.println(i + "대는 : " + idol[i] + "의 팬입니다.");
		}

		for(int i=0; i<idol.length; i++){
			sum += idol[i];
		}
		System.out.println(" sum :: " + sum);

		for
	}*/