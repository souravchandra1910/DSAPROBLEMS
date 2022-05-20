package miscellaneous;

import java.util.*;

public class APS {
public static int count(int[]arr,int n,int target) {
	HashMap<Integer,Integer>hm=new HashMap<>();
	int c=0;
	for(int i=0;i<arr.length;i++) {
		int diff=target-arr[i];
		if(hm.containsKey(diff)==true) {
			c+=hm.get(diff);
			hm.put(arr[i],hm.get(diff)+1);
			}else {
			hm.put(diff,1);
		}
	}
	
	return c;
	
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int target=sc.nextInt();
		int []arr=new int [n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}

		int val=count(arr,n,target);
		System.out.println(val);
			}
}
