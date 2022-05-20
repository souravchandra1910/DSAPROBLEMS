package string;

import java.util.Scanner;

public class THESPYLIFE {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String ans=func(str);
		System.out.println(ans);
	}

	private static String func(String str) {
        StringBuilder sb=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--) {
        	char ch=str.charAt(i);
        	if(ch>='a' && ch<='z'  || ch<='A' && ch>='Z') {
        		sb.append(ch);
        	}
        	if(ch==' ') {
        		sb.append(" ");
        	}
        }
        return sb.toString();
	}

}
