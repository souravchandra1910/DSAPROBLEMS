package ds;
import java.util.*;
public class RotationOfStringExistOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		if(s1==null || s2==null) {
			System.out.println("No");
		}
		else if(s1.length()!=s2.length()) {
		System.out.println("No");
		
		}
		
		else {
			String s=s1+s1;
			
		    if(s.contains(s2)) {
			System.out.println("Yes");}
			
		    else {
		    	System.out.println("No");
		    }
			
//			s.contains(s1);
//			
//			s.indexOf(s1);
			
			}
		
//	to compare two strings we use s.contains(s1) or s.indexOf(s1);
			
		
		
		
		
}}