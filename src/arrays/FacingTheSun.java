package arrays;

import java.util.Scanner;

public class FacingTheSun {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	int []arr=new int [n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	int val=fs(arr);
	System.out.println(val);
	
	}
	public static int fs(int []arr) {
		int maxh=arr[0];
		int count =1;
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]>maxh) {
				count++;
				maxh=arr[i];;
			}
		}
		
		return count ;
	}

}
