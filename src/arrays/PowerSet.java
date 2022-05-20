package arrays;

import java.util.Scanner;

public class PowerSet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
		  arr[i]=sc.nextInt();
		}
		int limit=(1<<arr.length);
		
		
		for(int i=0;i<limit;i++) {// 2^n subset
			int temp=i;
			String set="";
			for(int j=arr.length-1;j>=0;j--) {
				int rem=temp%2;
				temp=temp/2;
				if(rem==0) {
					set="-\t"+set;
				}
				else {
					set=arr[j]+"\t"+set;
				}
			}
			System.out.println(set);
		}

	}

}
