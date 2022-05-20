package mathsforDSA;

import java.util.Scanner;

public class powerLog {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    long x=sc.nextInt();
	    long n=sc.nextInt();
	
		long ans=pow(x,n);
		System.out.println(ans);

	}

	private static long pow(long x, long n) {
		 long ans=1;
		 while(n > 0) {
		 if((n & 1)!=0) {
			 ans=ans*x;
			 n--;
		 }
		 x=x * x;
		 n = n >> 1;
		 }
		 return ans;
	}

}
