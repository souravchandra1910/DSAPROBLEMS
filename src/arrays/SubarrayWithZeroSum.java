package arrays;

import java.util.HashMap;
import java.util.Scanner;

public class SubarrayWithZeroSum {
public static boolean exist(int []arr,int n) {
	int sum=0;
	HashMap<Integer,Integer>hm=new HashMap<>();
	for(int i=0;i<arr.length;i++) {
		sum+=arr[i];// calculating the prefix sum
		if(sum==0 ||hm.containsKey(sum)|| arr[i]==0) {
			return true;
		}else {
			hm.put(sum,1);
		}
		
	}
	return false;
	
	
}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int []arr=new int [n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		boolean val=exist(arr,arr.length);
		System.out.println(val);
		
		

	}

}
