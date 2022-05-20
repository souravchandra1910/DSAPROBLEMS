package stack;

import java.util.*;

public class SortAStringusingStack {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String ans=func(str);
		System.out.println(ans);

	}

	private static String func(String str) {
		Stack<Character>st=new Stack<>();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			st.push(str.charAt(i));
		}
		while(st.size()>0) {
			sb.append(st.pop());
		}
	
	return sb.toString();
	}
}
