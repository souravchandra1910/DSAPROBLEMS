package priorityQueue;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class FrequencySort {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)) {
			int n=sc.nextInt();
			int []arr=new int[n];
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			int []ans=frequencySort(arr);
			for(int val:ans) {
				System.out.println(val);
			}
		}
	}
	 public static int[] frequencySort(int[] nums) {
       int []ans=new int[nums.length];
       int idx=0;
       HashMap<Integer,Integer>hm=new HashMap<>();
       for(int val:nums) {
    	   hm.put(val,hm.getOrDefault(val,0)+1);
       }
       PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
           int freq1 = hm.get(a);
           int freq2 = hm.get(b);
           return freq1 == freq2 ? b - a : freq1 - freq2;
       });
       for(int key:hm.keySet()) {
    	   pq.add(key);
       }
      while(pq.size()>0) {
    	  int num=pq.remove();
    	  int freq=hm.get(num);
    	  while(freq-->0) {
    		  ans[idx++]=num;
    	  }
      }
       
       
       return ans;
	 }
}
