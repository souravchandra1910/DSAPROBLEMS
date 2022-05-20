package competitiveProgramming;

import java.util.Scanner;

public class Watermelon {
 public static void main (String []args) {
	 Scanner sc=new Scanner (System.in);
	 int w=sc.nextInt();
	 
	 if( w%2==0) {
		if(w<=2) {
			 System.out.println("NO");
	 }
		else {
		 System.out.println("YES");
	 }
 }
	 else {
		 System.out.println("NO");
	 }
}
}
