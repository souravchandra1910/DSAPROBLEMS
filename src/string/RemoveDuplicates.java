package string;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	String str=sc.nextLine();
	String s=removeDups(str);
	System.out.println(s);
	}
	public static String removeDups(String S) {
		 String str = new String();
	        int len = S.length();
	        for (int i = 0; i < len; i++)
	        {
	            char c = S.charAt(i);
	         
	            if (str.indexOf(c) < 0)
	            {
	                
	                str += c;
	            }
	        }
	         
	        return str;
	    
}}

