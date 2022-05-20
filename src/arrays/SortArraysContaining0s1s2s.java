//Dutch national flag algorithm


package arrays;

import java.util.Scanner;

public class SortArraysContaining0s1s2s {

public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
			
		}
		int l=0;
		int m=0;
		int h=arr.length-1;
		while(m<=h) {
			if(arr[m]==0) {
			int temp=arr[l];
			arr[l]=arr[m];
			arr[m]=temp;
			l++;
			m++;
			}
			else if(arr[m]==1) {
				m++;
			}
			else if(arr[m]==2) {
				int temp=arr[m];
				arr[m]=arr[h];
				arr[h]=temp;
				h--;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
