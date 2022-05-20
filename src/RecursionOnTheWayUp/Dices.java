package RecursionOnTheWayUp;
import java.util.*;
public class Dices {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,6};
		ArrayList<Integer>al=new ArrayList<>();
		ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
		dice(al,arr,ans,0,4);
System.out.println(ans);
	
	
		
	}

	private static void  dice(ArrayList<Integer> al, int[] arr, ArrayList<ArrayList<Integer>> ans, int idx, int sum) {
		  if(idx==arr.length) {
			  if(sum==0) {
				  ans.add(new ArrayList<>(al));
			  }
			  return;
		  }
			
			
			if(arr[idx]<=sum) {
				sum-=arr[idx];
				al.add(arr[idx]);
				dice(al,arr,ans,idx,sum);
				sum+=arr[idx];
				al.remove(al.size()-1);
			}
			dice(al,arr,ans,idx+1,sum);
		  }
	}
