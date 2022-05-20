package sumProblems;

import java.util.*;

public class FourSum {

	public static void main(String[] args) {
	     Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
	     int []arr=new int[n];
	     for(int i=0;i<arr.length;i++) {
	    	 arr[i]=sc.nextInt();
	     }
	     int target=sc.nextInt();
	     
	     List<List<Integer>>al=fourSum(arr,target);
	     for(List<Integer> val:al) {
	    	 System.out.print(val+" ");
	     }

	}
	public static  List<List<Integer>> fourSum(int[] arr, int target) {
		List<List<Integer>>res=new ArrayList<>();
	      if(arr.length<4)return res;
	      Arrays.sort(arr);
	      for(int i=0;i<=arr.length-4;i++){
	          if(i!=0 && arr[i]==arr[i-1]){  
	              continue;
	          }
	          int val1=arr[i];
	          int targ=target-val1;
	          List<List<Integer>>al=threeSum(arr,i+1,targ);
	          for(List<Integer>lt:al){
	              lt.add(val1);
	              res.add(lt);
	          }
	      }
	      return res;
	  }
	  public static List<List<Integer>> threeSum(int[]arr,int si, int targ) {
	      List<List<Integer>>res=new ArrayList<>();
	     

	      for(int i=si;i<=arr.length-3;i++){
	          if(i!=si && arr[i]==arr[i-1]){
	              continue;
	          }
	          int val1=arr[i];
	          int target=targ-val1;
	          List<List<Integer>>al=TwoSum(arr,i+1,arr.length-1,target);
	          for(List<Integer>lt:al){
	              lt.add(val1);
	              res.add(lt);
	          }
	      }
	      return res;
	      }
	    public static List<List<Integer>> TwoSum(int[] arr,int left,int right, int target) {
	   List<List<Integer>>ans=new ArrayList<>();
	   int a=left;
	   while(left<right){
	       int sum=arr[left]+arr[right];
	       if(left!=a&& arr[left]==arr[left-1]){
	           left++;
	           continue;
	       }
	       if(sum==target){
	           List<Integer>al=new ArrayList<>();
	           al.add(arr[left]);
	           al.add(arr[right]);
	           ans.add(al);
	           left++;
	           right--;
	       }
	       else if(sum>target){
	           right--;
	       }
	       else {
	           left++;
	       }
	   }
	   return ans;
	  }
}