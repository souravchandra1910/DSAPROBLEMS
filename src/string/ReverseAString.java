package string;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		String str=sc.nextLine();
//				StringBuilder sb=new StringBuilder(str);
//				sb.reverse();
//				
//				
//				
//			System.out.println(sb);	
//			
			char []ch=str.toCharArray();
			int i=0;
			int j=ch.length-1;
			while(i<=j) {
				char temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
				i++;
				j--;
			}
			for(Character c : ch) {
			System.out.print(c);
			}

	}

}
