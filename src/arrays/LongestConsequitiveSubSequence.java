//2 6 1 9 4 5 3

package arrays;

import java.util.*;

public class LongestConsequitiveSubSequence {
	static int findLongestConseqSubseq(int arr[], int N)
	{
	   HashMap<Integer,Boolean>hm=new HashMap<>();
	  for(int val:arr){
	       hm.put(val,true);
	   }
	   
	   
	   for(int val:arr){
	       if(hm.containsKey(val-1)){
	           hm.put(val,false);
	       }
	   }
	   int ml=0;
	   int msp=0;
	   for(int val:arr){
	       if(hm.get(val)==true){
	           int tl=1;
	           int tsp=val;
	           while(hm.containsKey(tsp+tl)){
	               tl++;
	           }
	           if(tl>ml){
	               ml=tl;
	               msp=tsp;
	           }
	       }
	   }
	   
	
	    return ml;  
	   
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int []arr=new int [n];
		 for(int i=0;i<arr.length;i++){
		     arr[i]=sc.nextInt();
		 }
		 
		 int val=findLongestConseqSubseq(arr,n);
		 System.out.println(val);
	}

}
