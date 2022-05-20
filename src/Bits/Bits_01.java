package Bits;

import java.util.Scanner;

public class Bits_01 {
// concept
//	xor of a number occuring even number of times is zero
//	eg->4^4=0, 4^4^4^4=0 etc
//	in & operator all 1s gives 1 and any zero gives zero
//	in | operator any 1 gives 1 and all 0s give zero
//    >> right shift of a number n is given by n/pow(2,n)
//	<< left shift of a number n is given by n*pow(2,n)
	
	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
//	int n=sc.nextInt();
//	int []arr=new int[n];
//	for(int i=0;i<arr.length;i++) {
//		arr[i]=sc.nextInt();
//	}
//	int val=f1(arr);
//	System.out.println(val);
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		// a and b are to be swapped using xor operator
//		swap(a,b);
//    xor of all number from (1-n)  In constant time O(1)
	
//	int n =sc.nextInt();
//	int val=xor(n);
	
	
	
	
	// to calculate the xor of numbers in range within 
//	a range(l to r)
	// we calculate the xor(r) ^ xor(l-1)
	//(xor here means xor of all elements upto that limit)
	// eg l=3,r=6 xor(1^2^3^4^5^6) ^ xor(1^2)
	//as we have to remove 1 and 2 we xor 
	//as xor of a number occuring even number of times is zero
//    int l=sc.nextInt();
//    int r=sc.nextInt();
//    int val=xor(r)^xor(l-1);
//    System.out.println(val);
	
	// checking a number is odd and even
	
//	int n=sc.nextInt();
//	
//	boolean val=isEven(n);
//	System.out.println(val);
    
	int a =8; 
	int b=4;
	System.out.println(a &~b);

	}
	public static int f1(int []arr) {
		// given an array in which every number occurs twice and one 
		//num occurs once return that number
		// concept
//		xor of a number occuring even number of times is zero
//		eg->4^4=0, 4^4^4^4=0 etc
		int n=0;
		for(int i=0;i<arr.length;i++) {
			n=n^arr[i];
			
		}
		return n;
		
		
	}
	public static void swap(int a,int b) {
		// a=5,b=7 (say)
		a=a^b;// a=5^7
		b=a^b;// b=5^7^7
		      // b=5 (xor of a number occuring even 
		      //  number of times is zero)
		a=a^b;// a=5^7^5
		      // a=7
		System.out.println(a+" , "+b);
	}
	public static int xor(int n) {
//	    xor of all number from (1 to n)  In constant time O(1)
		
		if(n%4==1) return 1;
		if(n%4==2) return n+1;
		if(n%4==3)return 0;
		if(n%4==0)return n;
		return -1;
	}
	public static boolean isEven(int n) {
		if((n & 1)==0) {
			return true;
		}else {
			return false;
		}
	}

}
