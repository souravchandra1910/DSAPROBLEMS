package ds;
import java.util.*;
public class TwoSum {

	public static void main(String[] args) {
		int []arr= {1,2,2,6};
		int target=4;
		int []a=twoSum(arr,target);
		for(int val:a) {
			System.out.println(val);
		}
		

	}
	
	public static int []twoSum(int []arr,int target){
		HashMap<Integer,Integer>hm=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			hm.put(arr[i],i);
			
		}
		for(int i=0;i<arr.length;i++) {
		int diff=target-arr[i];
		if(hm.containsKey(diff) && hm.get(diff)!=i) {
			return new int[] {hm.get(diff),i};
		}
		
		}
		return arr;
	

}
}