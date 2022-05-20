package Bits;

import java.util.Scanner;



public class Bits_02 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		// checking ith bit is set or not
		// to do this we use and operator
		//   eg n=10 i=1
		  //  1010
		
// we create a mask using 1<<i so that we have a 1 in ith place
	// in & operator all 1s gives 1 and any zero gives zero	
		// 1010
	  // & 0010(mask)
		// 0010(if ith bit is set it will be a non zero value
//		
//		int n=sc.nextInt();
//		int i=sc.nextInt();
//		
//		boolean val=isSet(n,i);
//		System.out.println(val);
//		
		// extract the ith bit of a number
// say for 13 (1101) the ith bit is 0 when i=1, 1 when i=0,2,3
//      int n=sc.nextInt();
//      int i=sc.nextInt();
//      int val=extract(n,i);
//      
//      System.out.println(val);
		
		
//		set the ith bit
		//we will be using or operator
		// 11010
		// i=2
		// result is 
		//11010
	 // | 00100
    //    11110(as in | operator any 1 gives 1 and all 0s
//		give zero
		int n=sc.nextInt();
		int i=sc.nextInt();
		int val=setBit(n,i);
		System.out.println(val);
	}
	public static boolean isSet(int n,int i) {
		if((n & (1<<i))==0) {
			return false;
		}else {
			return true;
		}
	
	}
	public static int extract(int n,int i) {
		if((n & (1 << i ))==0) {
			return 0;
		}
		else {
			return 1;
		}
	}
	public static int setBit(int n,int i) {
	  return ((n  | (1<<i)));
	}

}
