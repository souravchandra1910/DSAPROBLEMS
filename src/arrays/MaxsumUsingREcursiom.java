package arrays;

import java.util.Scanner;

public class MaxsumUsingREcursiom {
public static void main (String []args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int val=MaxSum(n);
	System.out.println(val);
}
public static int MaxSum(int n) {
	if(n==0) {
		return 0;
	}
	int sumb2=MaxSum(n/2);
	int sumb3=MaxSum(n/3);
	int sumb4=MaxSum(n/4);
	int sum=sumb2+sumb3+sumb4;
	int max=Math.max(sum, n);
	
	return max;
}

}
