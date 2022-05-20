package string;

import java.util.Scanner;

public class ValidPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		 Boolean val=isValid(str);
		 System.out.println(val);

	}
	public static boolean isValid(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)==str.charAt(j)) {
				i++;
				j--;
			}
			else {
		return isPalindrome(str,i+1, j)|| isPalindrome(str,i,j-1);
			}
		}
		return true;
	}
	public static boolean isPalindrome(String str,int i,int j) {
	while(i<j) {
		if(str.charAt(i)==str.charAt(j)) {
			i++;
			j--;
		}
		else {
			return false;
		}
		
	}
	return true;

}
}
