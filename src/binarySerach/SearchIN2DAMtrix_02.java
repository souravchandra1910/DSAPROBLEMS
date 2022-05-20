package binarySerach;


import java.util.Scanner;

public class SearchIN2DAMtrix_02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
		int [][]arr= {
				{10,20},
				
				{30,40},
				
		};
		System.out.println(search(arr,40));

	}
	public static boolean search(int[][]arr,int target){
	int r=binarySearchRow(arr,target);
	if(r==-1) {
		return false;
	}
	boolean isFound=binarySearch(arr,r,target);
	return isFound;
	
	
	}
	public static boolean binarySearch(int [][]arr,int r,int target) {
		int minc=0;
		int maxc=arr[r].length-1;
		while(minc<=maxc) {
			int mid=minc+(maxc-minc)/2;
			if(arr[r][mid]==target) {
				return true;
			}
			else if(arr[r][mid]<target) {
				minc=mid+1;
			}
			else {
				maxc=mid-1;
			}
		}
		return false;
	}
	

	public static int binarySearchRow(int [][]arr,int target) {
		int minr=0;
		int maxr=arr.length-1;
		int maxc=arr[0].length-1;
		int minc=0;
		while(minr<=maxr) {
			int mid=minr+(maxr-minr)/2;
			if(arr[mid][minc]>=target && arr[mid][maxc]<=target) {	
				return mid;
			}
			else if(target<arr[mid][minc]) {
				maxr=mid-1;
			}else if(target>arr[mid][maxc]) {
				minr=mid+1;
			}
			}
		return-1;
	}
}


	
