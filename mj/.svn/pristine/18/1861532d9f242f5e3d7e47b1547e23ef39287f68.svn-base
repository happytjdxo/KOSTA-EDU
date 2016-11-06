package overloading.self2.test;
/*
 * Method Overloading 에 대한 문제
 */
class Rect{
	static final int BASE_SIZE = 3;
	public void math(int base){
		System.out.println("정사각형의 넓이 :: "+ base*base);
	}
	public void math(int base, int height){
		System.out.println("직사각형의 넓이 :: "+ base*height);
	}
	public void math(int base, int height, int weight){
		System.out.println("사각형의 부피 :: "+ base*height*weight);
	}
	
}
public class RectTest2 {
	public static void main(String[] args) {
		System.out.println("***정사각형의 가로 길이는 3으로 지정되어 있습니다.****");
		Rect r = new Rect();
		if(args.length==0){
			System.out.println("매개 변수가 없어서 사각형의 넓이를 구할 수 없습니다.");
			// return;
		}else if(args.length==1){
			r.math(Rect.BASE_SIZE);
		}else if(args.length==2){
			int base = Integer.parseInt(args[0]);
			int height = Integer.parseInt(args[1]);
			int weight = Integer.parseInt(args[2]);
			r.math(base,height,weight);
			
		}
		//이 부분을 구현하세여...
		//실행시에 int 값을 몇개를 넣느냐에 따라서 Rect 클래스의 호출되는 메소드들이 다 달라진다.
		//args 변수를 이용해서 로직을 작성하세여...
		
	}
}













