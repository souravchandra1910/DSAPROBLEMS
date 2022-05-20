package arrays;

import java.util.Scanner;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int []a1=new int[n];
		for(int i=0;i<a1.length;i++) {
			a1[i]=sc.nextInt();
		}
		
		int m=sc.nextInt();
		int []a2=new int[m];
		for(int i=0;i<a2.length;i++){
			a2[i]=sc.nextInt();
		}
		

	}
	public static void merge(int []a1,int a2,int n,int m) {
		
	}
	
	public static int gap(int n) {
		if(n<=1) {
			return n;
		}
		
	}

}
