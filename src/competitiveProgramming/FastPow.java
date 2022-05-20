package competitiveProgramming;

import java.util.Scanner;

public class FastPow {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		long n=sc.nextInt();
		long m=sc.nextInt();
		long val=pow(n,m);
		System.out.println(val);

	}
	public static long pow(long a,long b) {
		if(b==0) {
			return 1;
			
		}
		long pbb2=pow(a,b/2);
		long pb=pbb2*pbb2;
		if(b%2==1) {
			pb*=a;
			
		}
		return pb;
	}

}
