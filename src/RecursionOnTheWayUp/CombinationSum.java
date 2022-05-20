package RecursionOnTheWayUp;
import java.util.*;
public class CombinationSum {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int []arr=new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
   int sum=sc.nextInt();
   List<List<Integer>> al=combinationSum(arr,sum);
   System.out.println(al);
	}

  public  static List<List<Integer>> combinationSum(int[]arr, int sum) {
	  List<List<Integer>> ans=new ArrayList<>();
	  List<Integer> al=new ArrayList<>();
	  helper(0,arr,sum,ans,al);
	  return ans;
}

private static void helper(int idx, int[] arr, int sum, List<List<Integer>> ans, List<Integer> al) {
  if(idx==arr.length) {
	  if(sum==0) {
		  ans.add(new ArrayList<>(al));
	  }
	  return;
  }
	
	
	if(arr[idx]<=sum) {
		sum-=arr[idx];
		al.add(arr[idx]);
		helper(idx,arr,sum,ans,al);
		sum+=arr[idx];
		al.remove(al.size()-1);
	}
	helper(idx+1,arr,sum,ans,al);
}
}
