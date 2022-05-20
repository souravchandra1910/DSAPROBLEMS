package competitiveProgramming;

import java.util.Scanner;

public class Team {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int co=0;
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			if((a==1&& b==1) || (a==1 && c==1) || (b==1 && c==1) ) {
				co++;
			}
			
		}
		System.out.println(co);
	}
}