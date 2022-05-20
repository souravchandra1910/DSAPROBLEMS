package Bits;

import java.util.Scanner;

public class CountNumberOfSetBits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=count(n);
		System.out.println(ans);
	}

	private static int count(int n) {
		int cnt=0;
		while(n!=0) {
			if((n & 1)!=0) {
				cnt++;
			}
			n=n>>1;
		}
		return cnt;
	}

}
