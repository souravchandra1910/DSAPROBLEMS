package competitiveProgramming;

import java.util.Scanner;

public class Coind {
public static void main (String []args) {
	Scanner sc=new Scanner (System.in);
	int t=sc.nextInt();
	while(t--!=0) {
		int n=sc.nextInt();
int x=n/3;
if((n%2==0 && x%2==1) || (n%2==1 && x%2==0)) {
	x+=1;
}
int y=(n-x)/2;
		
		System.out.println(x+" "+y);
	}
	}

}
