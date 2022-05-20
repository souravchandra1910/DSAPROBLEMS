package Bits;

import java.util.Scanner;

public class Bit_03 {

	public static void main(String[] args) {
			
		Scanner sc=new Scanner(System.in);
		// clear the ith bit
//		int n=sc.nextInt();
//		int i=sc.nextInt();
//		int val=clearBit(n,i);
//		System.out.println(val);
		
		// removing the right most set bit
//		int n=sc.nextInt();
//	
//		int val=removeLast(n);
//		System.out.println(val);
//		
		int n=sc.nextInt();
//		
		
//		SOURAV ?
		// SOURAV
		
		boolean val= powOf2(n);
//		System.out.println(val);
		
//		int n=sc.nextInt();
		int c=a(n);
		System.out.println(val   );
      }

	public static int clearBit(int n,int i) {
		// we shift the 1 by i time then we compliment it then
		// we do mask & i
		int mask=~(1 << i);
		return (n & mask);
	}
	public static int removeLast(int n) {
		// 14=1110(8+4+2)
		// 13=1101(8+4+1)
	    //    1100
		return (n & n-1);
		
	}
	public static boolean powOf2(int n) {
		if(n!=0 &&((n) & (n-1))==0) {
			return true;
		}else {
			return false;
		}
	}
	public static int a(int n) {
		int c=0;
		while(n!=0) {
			n= n & n-1;
			c++;
		}
		return c;
	}
}
///  SOURAV _1910