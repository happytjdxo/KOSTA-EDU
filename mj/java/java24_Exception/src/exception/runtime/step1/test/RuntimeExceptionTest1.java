package exception.runtime.step1.test;

public class RuntimeExceptionTest1 {
	public static void main(String[] args) {
		String[] str ={
			"Hello Java",	
				"No I Mean it",
				"Nice to meet you"
		};
		int i = 0;
		while(i<4){
			try{
			System.out.println(str[i]);	//폭탄이 터짐.. i가 3일때.
			}catch(ArrayIndexOutOfBoundsException e ){
				//System.out.println("Nice Catch~~");
				//e.printStackTrace();
				System.out.println(e.getMessage());
			}
			i++;
		}
	}
}
