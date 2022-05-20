package Bits;

import java.util.Scanner;

public class XorOfNumberWithInARange {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int L=sc.nextInt();
	int R=sc.nextInt();
	int xor1=xor(R);
	int xor2=xor(L-1);
	int ans=xor1 ^ xor2;
	System.out.println(ans);
	}
	//  say L=2, R=6
	//xor(R)=7
	// xor(L-1)=1;
	// ans=7 ^ 1 = 6
	
	
	private static int xor(int n)   {
		if(n % 4 == 1)return 1;
		if(n % 4 == 2)return (n+1);
		if(n % 4 == 3)return 0;
		if(n % 4 == 0)return n;
		return -1;	
	}
}
