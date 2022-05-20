package ds;

import java.util.Scanner;

public class bodyMass {

	public static void main(String []args) {
		
		try{Scanner sc= new Scanner (System.in);
		
		
		int t =sc.nextInt();
		while(t--!=0) {
			int m=sc.nextInt();
			int h=sc.nextInt();
			
			int val=m/(h*h);
			if(val<=18) {
				System.out.println("1");
			}
			else if(val>=19 && val<=24) {
				System.out.println("2");
			}
			else if(val>=25 && val<=29) {
				System.out.println("3");
			
			}
			
			else if(val>=30) {
				System.out.println("4");
			
		}
	}}
		catch(Exception e) {
			
		}
}}