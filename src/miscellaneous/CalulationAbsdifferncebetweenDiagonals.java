package miscellaneous;

import java.util.Scanner;

public class CalulationAbsdifferncebetweenDiagonals {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	int [][]arr=new int [n][n];
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++) {
			arr[i][j]=sc.nextInt();
		}
	
	}
	int s1=0;
	int s2=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++) {
if(i==j) {
	s1+=arr[i][j];
}
else if(i+j==n-1){
	s2+=arr[i][j];
}
					}
			}
int diff=Math.abs(s1+s2);
System.out.println(diff);
	
	}
	}