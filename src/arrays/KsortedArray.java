package arrays;

import java.util.*   ;

public class KsortedArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0){
		int n=sc.nextInt();
		int k=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++){
		    arr[i]=sc.nextInt();
		}
		
		PriorityQueue<Integer>pq=new PriorityQueue<>();
		for(int i=0;i<=k-1;i++){
		    pq.add(arr[i]);
		}
		for(int i=k;i<arr.length;i++){
             System.out.print(pq.remove()+" ");
		            pq.add(arr[i]);
		            
		          
		}
		while(pq.size()>0){
		   System.out.print(pq.remove()+" ");
		}
		}

	}

}
