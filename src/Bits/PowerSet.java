package Bits;

import java.util.*;

public class PowerSet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++)arr[i]=sc.nextInt();
		List<List<Integer>>ans=powerSet(arr,n);
		System.out.println(ans);

	}

	private static List<List<Integer>> powerSet(int []arr,int n) {
		List<List<Integer>>al=new ArrayList<>();
		for(int i=0;i<(1<<n);i++) {
			List<Integer>ans=new ArrayList<>();
			for(int j=0;j<n;j++) {
				if((i & (1<<j))!=0) {
					ans.add(arr[j]);
				}
			}
			al.add(ans);
		}
		
		return al;
	}

}
