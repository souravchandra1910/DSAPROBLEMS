package april;

import java.util.Scanner;

public class Pythagoriantriplets {

	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
		   int a=sc.nextInt();
		   int b=sc.nextInt();
		   int c=sc.nextInt();
		   
		   int max=a>b?a>c?a:c:b>c?b:c;
		 if(a==max) {
			 if(a*a==(b*b+c*c)) {
				 System.out.println(true);
				 return;
			 }
		 }
		 if(b==max) {
			 if(b*b==(a*a+c*c)) {
				 System.out.println(true);
				 return;
			 }}
			 if(c==max) {
				 if(c*c==(b*b+a*a)) {
					 System.out.println(true);
					 return;
				 }}
			 System.out.println(false);

	}

}
