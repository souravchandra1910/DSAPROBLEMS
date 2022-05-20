package arrays;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubarrayWithZeroSum {
public static int solution(int[]arr) {
	HashMap<Integer,Integer>hm=new HashMap<>();
	int mlen=0;
	int sum=0;
	int i=-1;
	hm.put(sum,-1);
	while(i<arr.length-1) {
		i++;
		sum=sum+arr[i];
		if(hm.containsKey(sum)==false) {
			hm.put(sum,i);
			
		}else {
			int len=i-hm.get(sum);
			if(len>mlen) {
				mlen=len;
				
			}
		}
	}
	return mlen;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int []arr=new int [n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			}
		int val=solution(arr);
		System.out.println(val);

	}

}
