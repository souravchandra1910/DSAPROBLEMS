package miscellaneous;

import java.util.Scanner;

public class Amn {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int j=1;j<=n;j++) {
		if(j==1 || j==n) {
		for(int i=1;i<=n;i++) {
			System.out.print('$'+" ");
		}
		System.out.println();
		}else {
			int st=1;
			int sp=n-2;
			for(int i=1;i<=st;i++) {
				System.out.print('$'+" ");
			}
			for(int i=1;i<=sp;i++) {
				System.out.print("  ");
			}
			for(int i=1;i<=st;i++) {
				System.out.print('$');
			}
			System.out.println();
		}

		
		
		
	}

}}
