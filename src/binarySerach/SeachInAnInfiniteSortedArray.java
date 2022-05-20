package binarySerach;


import java.util.*  ;

public class SeachInAnInfiniteSortedArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		int l=0;
		int h=1;
		while(arr[h]<key) {
			l=h;
			h=h*2;
		}
		
		int val=BinarySearch(arr,l,h,key);
		System.out.println(val);

		

	}
	public static int BinarySearch(int []arr,int l,int h,int key) {
		while(l<=h) {
			int mid=(l+h)/2;
			if(key==arr[mid]) {
				
			return mid ;
			}else if(key<arr[mid]) {
				h=mid-1;
			}else if(key>arr[mid]) {
				l=mid+1;
			}
		}
		
	return -1;
		
		
	}
	
	

}
