package competitiveProgramming;

import java.util.Scanner;

public class Dominopiling {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int val=n*m;
		int ans=val/2;
		System.out.println(ans);

	}

}
