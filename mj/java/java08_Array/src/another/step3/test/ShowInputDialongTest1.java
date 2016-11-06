package another.step3.test;

import javax.swing.JOptionPane;

public class ShowInputDialongTest1 {
	public static void main(String[] args) {
		// 임의의 수 1~100까지의 정수가 할당 되도록
		int answer = (int)(Math.random()*100 +1);
		int input = 0;	// 사용자가 입력한 값을 여기에 저장.
		String temp = "";	// 사용자가 입력한 값을 임시로 저장하는 변수
		int count = 0;	// 시도 횟수.
		
		do{
			count++;
			temp = JOptionPane.showInputDialog("1~100까지의 숫자를 입력하세요. 끝내시려면 -1을 입력하세요.");
			if(temp.equals("-1")||temp.equals("")) break;
			System.out.println("입력된 값 :: " + temp);
			
			input = Integer.parseInt(temp);
			/*
			 * 제어문을 이용해서 내가 입력한 값과 answer이 똑같아 질때 까지
			 * 맞춰나가는 로직을 작성
			 * 이때 두개의 값이 동해질때까지의 count도 마지막에 출력될 수 있도록.
			 *      
			 */
			if(answer>input){
				System.out.println("더 큰 값을 입력하세요,");				
			}else if(answer<input){
				System.out.println("더 작은 값을 입력하세요.");
			}else{
				System.out.println("오우~ 정답!");
				System.out.println("시도하신 횟수는" + count + "회 입니다.");
			}
				
		}while(true);
	
	}
}
