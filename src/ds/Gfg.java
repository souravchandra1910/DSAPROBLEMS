package ds;

import java.util.Scanner;

public class Gfg {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		boolean val=areRotations(s1,s2);
		System.out.println(val );
	}
	  /* Function checks if passed strings (str1 and str2)
	       are rotations of each other */
	   public static boolean areRotations(String str1, String str2)
	    {
	        // There lengths must be same and str2 must be 
	        // a substring of str1 concatenated with str1.  
	        return (str1.length() == str2.length()) &&
	               ((str1 + str1).indexOf(str2) != -1);
	    }
}
