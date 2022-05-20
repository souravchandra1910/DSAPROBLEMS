package Bits;

import java.util.*;

public class Bits_05 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int []arr=new int[n];
  for(int i=0;i<arr.length;i++) {
	  arr[i]=sc.nextInt();
}
//  // calculating the xor all subset in an array
//// concept
//  // the xor all subset of a set is always zero
//  // as each number occurs even  number of times
//  // {1,2,3} subsets
//  //{},{1},{2},{3},{1,2},{2,3},{1,3},{1,2,3}
//  // here 1,2,3 are occuring 4 times 
//  
//  
//  // printing all the subset
  for(int num=0;num<=((1<<n)-1);num++) {
	  ArrayList<Integer>al=new ArrayList<>();
	  for(int i=0;i<n;i++) {
		  if((num & (1<<i))!=0) {
			  al.add(arr[i]);
			
		  }
		
	  }
	  for(int val:al) {
		   System.out.println(al);
			  }
		  
		 
	  String a=sc.nextLine();

	 
  }
     
//  
//	System.out.println(20+3.14f);

}
}
