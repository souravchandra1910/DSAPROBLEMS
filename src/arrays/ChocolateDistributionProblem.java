package arrays;

import java.util.*;

public class ChocolateDistributionProblem {

	public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
long n=sc.nextLong();
ArrayList<Long>al=new ArrayList<>();
for(int i=0;i<n;i++) {
	long x=sc.nextLong();
	al.add(x);
}
long m=sc.nextLong();
long val= findMinDiff(al,n,m);
System.out.println(val);
	}
	
	
	 public static long findMinDiff (ArrayList<Long> a, long n, long m)
	    {
	        long ans=Long.MAX_VALUE;
	        Object[]arr=a.toArray();
	  Arrays.sort(arr);
	  int i=0;
	  int j=(int) (m-1);
	  while(j<arr.length){
	      int max=(int) arr[j];
	      int min=(int) arr[i];
	      int diff=max-min;
	      if(diff<ans){
	          ans=diff;
	          
	      }
	      i++;
	      j++;
	  }
	  
	    return ans;

}}
