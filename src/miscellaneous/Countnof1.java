package miscellaneous;

import java.util.Scanner;

public class Countnof1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
	Boolean [][]arr=new Boolean [n][n];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=sc.nextBoolean();
			}
		
		}
		int mc=0;
		int idx=0;
		for(int i=0;i<arr.length;i++) {
			int c=0;
			for(int j=0;j<arr[0].length;j++) {
			
				if(arr[i][j]==true) {
	            c++;
	            
				}}
				if(mc<c) {
					mc=c;
					idx=i;
				}
			
		
		}
		System.out.println(idx);
	

	}

}
