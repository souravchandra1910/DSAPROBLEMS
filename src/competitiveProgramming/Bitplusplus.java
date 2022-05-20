package competitiveProgramming;

import java.util.Scanner;

public class Bitplusplus {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		int sum=0;
		while(n!=0) {
			String str=sc.nextLine();
			if(str.charAt(1)=='+') {
				sum++;
			}else{
				sum--;
			}
			n--;
		}
		System.out.println(sum);

	}

}
