package priorityQueue;
import java.util.*;
public class KthSmallestElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
	}
		int k=sc.nextInt();
		int val=kthSmallest(arr,0,n-1,k);
		System.out.println(val);
	}
	    public static int kthSmallest(int[] arr, int l, int r, int k) 
	    { 
	      PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
	      for(int i=l;i<=r;i++){
	          if(i<k){
	              pq.add(arr[i]);
	          }
	          else{
	              if(pq.peek()>arr[i]){
	                  pq.remove();
	                  pq.add(arr[i]);
	              }
	          }
	      }
	      return pq.remove();
	    } 
}
