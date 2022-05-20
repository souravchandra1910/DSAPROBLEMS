package arrays;

import java.util.Scanner;

public class MatDiagonalSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int [][]arr=new int [n][n];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i][i]+arr[i][n-i-1];
			
		}
		if(n%2==1)sum-=arr[n/2][n/2];
		System.out.println(sum);

	}

}
