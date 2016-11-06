package prob;

import java.util.StringTokenizer;

public class StringProb22 {
	public static void main(String[] args) {
		System.out.println(spaceTrim("Java  Program        Language"));
		System.out.println(spaceTrim("Structured Query     Language"));
		System.out.println(spaceTrim("Servlet & JSP"));
	}

	private static char[] spaceTrim(String string) {
		
		// 구현하세여..
		StringTokenizer stk = new StringTokenizer(string);
		StringBuffer sb = new StringBuffer();
		while(stk.hasMoreTokens()){
			sb.append(stk.nextToken() + " ");
			
		}
		String stt = sb.substring(0, sb.length()-1);
		return stt.toCharArray();
	}
}
