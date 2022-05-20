package string;

import java.util.Scanner;

public class Symbol {

	public static void main(String[] args) {
	
		String str="L#ive L@augh L%ove";
		String ans=func(str);
		System.out.println(ans);
	}

	private static String func(String str) {
		StringBuilder sb=new StringBuilder();
		String []arr=str.split(" ");
		for(int i=0;i<arr.length;i++) {
			String s=arr[i];
			for(int j=0;j<s.length();j++) {
				if(s.charAt(j)>='a' && s.charAt(j)<='z' || s.charAt(j)>='A' && s.charAt(j)<='Z' || s.charAt(j)>='0' && s.charAt(j)<='9') {
					sb.append(s.charAt(j));
				}
			}
			sb.append(" ");
		}
		sb.deleteCharAt(sb.length()-1);
		return sb.toString();
	}

}
