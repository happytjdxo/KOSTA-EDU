package array.step1.test;
/*
 *  array의 특징 ::
 *  1. 클래스 타입이 제공되지 않는다.
 *  2. 배열의 사이즈를 int로 리턴해주는 멤버가 있다....->length
 *  3. 한번 잡힌 배열의 크기는 변경될 수 없다.
 */
public class BasicIntArrayTest3 {
	public static void main(String[] args) {
		int[ ] arr = new int[3];
		arr[0] = 100; arr[1] = 90; arr[2] = 80;
		
		for(int i=0; i<arr.length; i++){
			System.out.println("배열 안의 각각의 값 :: " +arr[i]);
		}
		System.out.println("arr 객체가 저장된 주소값 :: " + arr);
		///////////////////////////////////////////////////////////////////
		
		System.out.println("array의 사이즈를 늘림..");
		
		arr = new int[5];
		arr[3] = 55;
		arr[4] = 66;
		
		for(int i=0; i<arr.length; i++){
			System.out.println("배열 안의 각각의 값 :: " +arr[i]);
		}
		System.out.println("arr 객체가 저장된 주소값 :: " + arr);
	}

}



// 내일은 이거 조금 더 하고,, 고객이 계좌 갖는 프로그램 할껏 같음.