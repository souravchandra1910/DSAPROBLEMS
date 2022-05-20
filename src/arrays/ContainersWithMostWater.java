package arrays;

import java.util.Scanner;

public class ContainersWithMostWater {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	int []arr=new int [n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	
	// brute force approach
//	int maxArea=0;
//     int i=0;
//	for(;i<arr.length-1;i++) {
//		for(int j=i+1;j<arr.length;j++) {
//			int height=Math.min(arr[i],arr[j]);
//			int width=j-i;
//			int area=height*width;
//			if(area>maxArea) {
//				maxArea=area;
//			}
//		}
//		} 
//		System.out.println(maxArea);
//	
	int maxArea=0;
int i=0;
int j=arr.length-1;
while(i<j) {
	int  area=(j-i)*Math.min(arr[i],arr[j]);
	if(area>maxArea) {
		maxArea=area;
	}
	if(arr[i]<arr[j]) {
		i++;
	}
	else if(arr[j]<=arr[i]) {
		j--;
		}
}
	System.out.println(maxArea);	
	
	
	}

}
