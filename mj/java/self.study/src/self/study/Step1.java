package self.study;

public class Step1 {

	public static void main(String[] args) {

		//String형 배열인데 배열안에 13579 배열명 str
		
		String[] str = {"1", "2", "3", "4", "5"};
		int[] it = {1, 2, 3, 4, 5};
		
		for(int i=0; i<it.length; i++){
			if(it[i]>=3)
				System.out.println(it[i]>2);
		}
	}
}
