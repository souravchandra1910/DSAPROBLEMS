package arrays;

import java.util.Scanner;

public class MAxProductOfThreeNumbers {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int []arr=new int [n];
	for( int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	
	int max1=Integer.MIN_VALUE;
	int max2=max1;
	int max3=max2;
	
	
	int min1=Integer.MAX_VALUE;
	int min2=min1;
	
	
	for(int i=0;i<arr.length;i++) {
		int val=arr[i];
		if(val>=max1) {
			max2=max1;
			max3=max2;
			max1=val;
		}else if(val>=max2) {
			max3=max2;
			max2=val;
		}else if(val>=max3) {
			max3=val;
		}
		
		
		if(val<=min1) {
			min2=min1;
			min1=val;
		}else if(val<=min2) {
			min2=val;
		}
		
	}
	int maxPrd=Math.max(min1*min2*max1,max1*max2*max3);
	System.out.println(maxPrd);

	}

}
