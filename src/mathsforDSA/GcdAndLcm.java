package mathsforDSA;

import java.util.Scanner;

public class GcdAndLcm {

	public static void main(String[] args) {
      Scanner sc=new Scanner (System.in);
      long a=sc.nextLong();
      long b=sc.nextLong();
      long ans=gcd(a,b);
      System.out.println(ans);
     long lcm= (a * b / ans) ;
     System.out.println(lcm);

	}

	private static long gcd(long a, long b) {
	   if(b==0)
		return a;
	   return gcd(b ,a % b);
	}

}
