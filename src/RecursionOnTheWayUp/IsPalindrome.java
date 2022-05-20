package RecursionOnTheWayUp;

import java.util.Scanner;

public class IsPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String str=sc.nextLine();
		boolean val=isPalindrome(0,str);
		System.out.println(val);

	}
	public static boolean isPalindrome(int i,String str) {
		int n=str.length();
	  if(i>=n/2) {
		  return true;
	  }
	  if(str.charAt(i)==str.charAt(n-i-1)) {
		  
		 boolean val=isPalindrome(i+1,str);
		 return val;
	}
	  return false;
	  }
	
	

}
