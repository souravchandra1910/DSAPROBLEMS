package competitiveProgramming;

import java.util.Scanner;

public class PalindromicNumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	int sum=0;
	int temp=n;
	while(temp!=0) {
		int val=temp%10;
		sum=sum*10+val;
		temp/=10;
	}
if(n==sum) {
	System.out.println("yes");
}else {
	System.out.println("No");
}

	}

}
