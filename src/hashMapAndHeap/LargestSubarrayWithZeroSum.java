package hashMapAndHeap;
import java.util.*;
public class LargestSubarrayWithZeroSum {
	public static int solution(int[] arr) {
	HashMap<Integer,Integer>hm=new HashMap<>();
	int ml=0;
	int i=-1;
	int sum=0;
	hm.put(sum,i);
	while(i<arr.length-1){
	    i++;
	    sum+=arr[i];
	    if(!hm.containsKey(sum)){
	        hm.put(sum,i);
	    }else{
	        int l=i-hm.get(sum);
	        if(ml<l){
	            ml=l;
	        }
	    }
	}

		return ml;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		int val=solution(arr);
		System.out.println(val);

	}

}
