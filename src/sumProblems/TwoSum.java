package sumProblems;

import java.util.*;
import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
	     int []arr=new int[n];
	     for(int i=0;i<arr.length;i++) {
	    	 arr[i]=sc.nextInt();
	     }
	     int target=sc.nextInt();
	     
	     List<List<Integer>>al=twoSum(arr,target);
	     for(List<Integer> val:al) {
	    	 System.out.print(val+" ");
	     }
	     
//1 1 2 3 4 4 5 
	}
public static List<List<Integer>>twoSum(int []arr,int target){
	List<List<Integer>>ans=new ArrayList<>();
	Arrays.sort(arr);
	int left=0;
	int right=arr.length-1;
	while(left<right) {
		int sum=arr[left]+arr[right];
		if(left!=0 && arr[left]==arr[left-1]) {
			left++;
			continue;
		}
		if(sum==target) {
			List<Integer>al=new ArrayList<>();
			al.add(arr[left]);
			al.add(arr[right]);
			ans.add(al);
			left++;
			right--;
			
		}
		else if(sum>target) {
			right--;
		}
		else {
			left++;
		}
	}
	
	
	return ans;
}
}
