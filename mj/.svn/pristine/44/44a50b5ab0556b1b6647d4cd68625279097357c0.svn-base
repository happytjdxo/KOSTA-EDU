package array.step2.test;
/*
 * 어제한 예제에서 배열의 특징으로 한번 잡힌 사이즈는 변경 불가능 하다는
 * 것을 확인했다.
 * 다른 배열에 저장된 값을 copy해 올수있는 기능이 있다.
 * System.arraycopy()을 이용하면 가능하다.
 */
public class ArrayCopyTest3 {
	public static void main(String[] args) {
		int[]target = {1,2,3,4,5,6,7,8,9,10};	//10
		int[]source = {99,88,77,66,55,44,33,22};	//8

		/*
		 * arraycopy()를 이용해서
		 * 출력결과가 1,2,3,4,5,66,55,44,33,22이 되도록.. target 이
		 */
		System.arraycopy(source, 3, target, 5, 5);
		for(int i =0; i<target.length; i++){
			System.out.print(target[i]+", ");
		}		
	}
}



































/*
for(int t=0; t<target.length; t++){
	System.out.println(t+"번째" +target[t]);
}
for(int s=99; s<source.length; s--){
	System.out.println(s +"dd"+source[s]);    --> 얜 왜 출력이 안되??
}*/