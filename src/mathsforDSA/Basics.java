package mathsforDSA;

import java.util.Scanner;

public class Basics {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		long n=sc.nextLong();
//		
//       boolean v=isEven(n);
//       System.out.println(v);
		int m=sc.nextInt();
       int val= ngt(m);
       System.out.println(val);
	}
	public static boolean isEven(long n) {
		if((n & 1)!=0) {
			return false;
		}
		return true;
	}
	public static boolean isSet(int n,int i) {
		int mask=1<<i;
		 if((n & mask)==0)return false;
		 else return true;
	}
	public static int set(int n ,int i) {
		return (n | (1<<i));
	}
	
	public static int reset(int n ,int i) {
		return (n & ~(1<<i));
	}
	public static int rmsb(int n) {
		int idx=0;
		int i=0;
		while((n & (1<<i))==0) {
			idx++;
			i++;
		}
		return idx;
	}
	public static int ngt(int n) {
	  return ((~n)+1);
	}
	
// 1010--> index is 1
	
}
////1 0 1 0 
 
//  1 1 0 1

//& 1 0 0 0
