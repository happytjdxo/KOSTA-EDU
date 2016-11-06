package datatype4;
/*
	class의 멤버를 사용하면
	파워풀한 기능의 효과를 얻어낼 수 있다.
*/

class datatype4{
	public static void main(String[] args)	{
		System.out.println("----- Storage of the DataType's Value-----\n");
		System.out.println("----- byte -----");
		//	객체를 생성하지 않고 바로 접근할 수 있다... Class 명.member;
		System.out.println(" 최대값: " +Byte.MAX_VALUE);
		System.out.println(" 최소값: " +Byte.MIN_VALUE);

		System.out.println("----- short -----");
		System.out.println(" 최대값: " +Short.MAX_VALUE);
		System.out.println(" 최소값: " +Short.MIN_VALUE);
		
		System.out.println("----- int -----");
		System.out.println(" 최대값: " +Integer.MAX_VALUE);
		System.out.println(" 최소값: " +Integer.MIN_VALUE);

		System.out.println("----- long -----");
		System.out.println(" 최대값: " +Long.MAX_VALUE);
		System.out.println(" 최소값: " +Long.MIN_VALUE);



	}
}
