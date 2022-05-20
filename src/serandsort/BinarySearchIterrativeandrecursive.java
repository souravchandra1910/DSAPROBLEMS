package serandsort;
import java.util.Scanner;
public class BinarySearchIterrativeandrecursive {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[]arr=new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	int target=sc.nextInt();
	int v1=binarySearch(arr,target);
	int v2=binarySearchr(arr,0,n-1,target);
	System.out.println(v1+" "+v2);
	}
	private static int binarySearchr(int[] arr, int lo, int hi, int target) {
		if(lo > hi)return -1;
		int mid=(lo+hi)/2;
		if(arr[mid]==target)return mid;
		else if(target>arr[mid])return  binarySearchr(arr,mid+1,hi,target);
		else return  binarySearchr(arr,lo,mid-1,target);
	}
	private static int binarySearch(int[] arr, int target) {
	    int lo=0;
	    int hi=arr.length-1;
	    while(lo<=hi) {
	    	int mid=(lo+hi)/2;
	    	if(arr[mid]==target) {
	    		return mid;
	    	}
	    	else if(target>arr[mid]) {
	    		lo=mid+1;
	    	}
	    	else {
	    		hi=mid-1;
	    	}
	    }
		return -1;
	}
}
