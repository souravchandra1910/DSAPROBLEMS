package hashMapAndHeap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class LongestcontinueousSubArray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int []arr=new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	ArrayList<ArrayList<Integer>>anss =LongestcontinueousSubArray(arr,new ArrayList<Integer>());
	System.out.println(anss);
	}

	private static ArrayList<ArrayList<Integer>> LongestcontinueousSubArray(int[] arr, ArrayList<Integer>al) {
		ArrayList<ArrayList<Integer>>anss=new ArrayList<>();
		int ans=0;
		for(int i=0;i<arr.length-1;i++) {
			int min=arr[i];
			int max=arr[i];
			HashSet<Integer>set=new HashSet<>();
			for(int j=i+1;j<arr.length;j++) {
				if(set.contains(arr[j])) {
					break;
				}
				set.add(arr[j]);
			    min=Math.min(arr[j],min);
				max=Math.max(arr[j],max);
				if(max-min==j-i) {
					for(int k=i;k<=j;k++){
						al.add(arr[k]);
					}
					}
				anss.add(al);
					
					int len=j-i+1;
					ans=Math.max(len,ans);
					
				}
			}
		
		return anss;
	}

}
