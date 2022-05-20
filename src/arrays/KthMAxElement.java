package arrays;

import java.util.*;

public class KthMAxElement {
public static int max(int []arr,int l,int r,int k) {
PriorityQueue<Integer>pq=new PriorityQueue<>();
for(int i=l;i<k;i++) {
	pq.add(arr[i]);
}

for(int i=k;i<=r;i++) {
	if(pq.peek()<arr[i]) {
		pq.remove();
		pq.add(arr[i]);
		
	}}
return pq.remove();
}
	
	
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=sc.nextInt();
int []arr=new int[n];

for(int i=0;i<arr.length;i++) {
	arr[i]=sc.nextInt();
	
}

int max=max(arr,0,arr.length-1,k);
System.out.println(max);
	}

}
