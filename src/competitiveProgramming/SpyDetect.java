package competitiveProgramming;

import java.util.*;

public class SpyDetect {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while(t--!=0) {
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		

	HashMap<Integer,Integer>hm=new HashMap<>();
	for(int val:arr) {
		
		hm.put(val,hm.getOrDefault(val, 0)+1);
	}

	int u=0;
	for(int val:arr) {
		if(hm.get(val)==1) {
			u=val;
			break;	
		}
		
	}
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==u) {
			System.out.println(i+1);
			break;
		}
	}
		}
	}

}
