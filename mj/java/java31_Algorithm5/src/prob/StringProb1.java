package prob;

public class StringProb1 {
	public static void main(String[] args) {
		System.out.println(makeInitial("Java Data Base Conectivity"));
		
		System.out.println(makeInitial("Java Server Pages"));
		
		System.out.println(makeInitial("Enterprise Java Beans"));
	}

	private static String makeInitial(String fullName) {
		//구현하세여...
		
			String[] str = fullName.split(" ");
			String data = "";
			/*for(int i =0; i<str.length; i++){
				data += str[i].charAt(0);
			}*/
			for(String s : str){
				data += s.charAt(0);
			}
				return data;
	}
}
