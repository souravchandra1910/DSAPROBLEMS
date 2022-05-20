package competitiveProgramming;

import java.util.Scanner;

public class FLOORNUMBER {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while(t--!=0) {
			int n=sc.nextInt();
			int x=sc.nextInt();
			
			if(n==1 || n==2) {
				System.out.println(1);
				
			}else {
			n=n-2;
			int count=2;
			while(n>x) {
				count++;
				n=n-x;
			}
			System.out.println(count);
		}
		}
	}

}
