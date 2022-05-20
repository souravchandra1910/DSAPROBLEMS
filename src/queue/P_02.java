package queue;

import java.util.*;

public class P_02 {

	public static void main(String[] args) {
		PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
Scanner sc=new Scanner (System.in);
int n=sc.nextInt();
int []arr=new int[n];
for(int i=0;i<n;i++){
	arr[i]=sc.nextInt();
}
for(int val:arr) {
	pq.add(val);
}
while(pq.size()>0) {
	System.out.println(pq.peek());
	pq.remove();
}
	}

}
