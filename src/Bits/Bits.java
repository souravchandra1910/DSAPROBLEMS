package Bits;

import java.util.Scanner;

public class Bits {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
//	boolean val=evenorodd(n);
//	System.out.println(val);
	int i=sc.nextInt();
//    boolean val=isSet(n,i);
//    System.out.println(val);
//    int val=setTheBit(n,i);
//    System.out.println(val);
//	int val=removeLastBit(n,i);
//	System.out.println(val);
//	boolean val=isPowerOf2(n);
//    
//    System.out.println(val);
    int val=clear(n,i);
    System.out.println(val);
	}
	private static int clear(int n, int i) {
		return ( n & ~(1 << i));
	}
	
	private static boolean isPowerOf2(int n) {
		
		return ((n & n-1)==0);
	}
	
	private static int removeLastBit(int n, int i) {
	
		return( n & n-1);
	}
	
	private static int setTheBit(int n, int i) {
		return (n | (1 << i));
	}
	
	private static boolean isSet(int n,int i) {
		return((n & 1<<i)!=0);
		
	}

	private static boolean evenorodd(int n) {
		return ((n & 1)==0);
	}

}
