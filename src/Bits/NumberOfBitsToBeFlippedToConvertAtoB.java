package Bits;

import java.util.Scanner;

public class NumberOfBitsToBeFlippedToConvertAtoB {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int val=count(a,b);
		System.out.println(val);

	}

	private static int count(int a, int b) {
		//first check for no of differnt bits in a and b
		int xor= a ^ b;
		// then calculate number of set bits
		int cnt=0;
		while(xor!=0) {
			if((xor & 1)!=0) {
				cnt++;
			}
			xor=xor>>1;
		}
		return cnt;
	}
	

}
