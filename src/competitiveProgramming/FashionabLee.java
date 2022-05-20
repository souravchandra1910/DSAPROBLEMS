package competitiveProgramming;

import java.util.Scanner;

public class FashionabLee {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t--!=0) {
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

	}

}
