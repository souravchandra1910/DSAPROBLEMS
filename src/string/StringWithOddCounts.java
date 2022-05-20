package string;

import java.util.Scanner;

public class StringWithOddCounts {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in );
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z') {
	
		char curr=str.charAt(i);
		char =str.charAt(i-1);
		
		if(curr==prev){
			count++;
		}
	}
	if(count%2==1) {
		System.out.println("Valid");
	}
	else {
		System.out.println("Not Valid");
	}
	}

}
