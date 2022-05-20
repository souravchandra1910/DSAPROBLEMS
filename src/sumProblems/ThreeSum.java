package sumProblems;

import java.util.*;
import java.util.Scanner;

public class ThreeSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
	     int []arr=new int[n];
	     for(int i=0;i<arr.length;i++) {
	    	 arr[i]=sc.nextInt();
	     }
	     int target=sc.nextInt();
	     
	     List<List<Integer>>al=threeSum(arr,target);
	     for(List<Integer> val:al) {
	    	 System.out.print(val+" ");
	     }
	     

	}

	private static List<List<Integer>> threeSum(int[] arr, int target) {
		List<List<Integer>>ans=new ArrayList<>();
	     Arrays.sort(arr);
		if(arr.length<3) {
			return ans;
		}
		for(int i=0;i<arr.length-3;i++) {
			if(i!=0 && arr[i]==arr[i-1]){
	              continue;
	          }
			int val=arr[i];
			int targ=target-val;
			List<List<Integer>>al=twoSum(arr,i+1,targ);
			for(List<Integer>a:al) {
				a.add(val);
				ans.add(a);
			}
			
	
		}
		return ans;
		
	}
	public static List<List<Integer>> twoSum(int[] arr, int si,int target) { 
		List<List<Integer>>ans=new ArrayList<>();
      int left=si;
      int right=arr.length-1;
      while(left<right) {
    	  int sum=arr[left]+arr[right];
    	  if(left!=si && arr[left]==arr[left-1]) {
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
    	  else if(sum<target) {
    		  left++;
    	  }
    	  else {
    		  right--;
    	  }
    	  
    	 
      }
	return ans;
	}
}
