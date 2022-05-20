package arrays;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class kthsmallestelement {
public static int min(int []arr,int l,int r,int k) {
	PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
	for(int i=l;i<r;i++) {
		if(i<k) {
			pq.add(arr[i]);
			
		}
		else {
			if(pq.peek()>arr[i]) {
				pq.remove();
				pq.add(arr[i]);
			}
		}
		
	}
	
	
	return pq.remove();
	
	
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
	
//		int l=sc.nextInt();
//		int r=sc.nextInt();
		int []arr=new int[n];		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
int min=min(arr,0,arr.length,4);
System.out.println(min);
	}

}

