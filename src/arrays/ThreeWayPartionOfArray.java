package arrays;

import java.util.Scanner;

public class ThreeWayPartionOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		int a=sc.nextInt();
		int b=sc.nextInt();
//		 int i=0;
		int l=0;
		int r=arr.length-1;
	for(int i=0;i<=r;i++) {
			if(arr[i]<a) {
				int temp=arr[l];
				arr[l]=arr[i];
				arr[i]=temp;
				r--;
			}else if(arr[i]>b) {
				int temp=arr[i];
				arr[i]=arr[r];
				arr[r]=temp;
				l++;
			i--;
				
			}
			
		
		}
		for(int val:arr) {
			System.out.println(val);
		}
		

	}

}
