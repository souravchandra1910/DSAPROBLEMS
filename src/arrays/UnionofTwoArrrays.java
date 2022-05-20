package arrays;

import java.util.*;

public class UnionofTwoArrrays {
	public static int doUnion(int a[], int n, int b[], int m) 
    {
   Set<Integer>set =new HashSet<>();
   for(int val:a){
       set.add(val);
   }
   
   for(int val:b){
      set.add(val);
   }
   return set.size();
   
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
int []arr=new int [n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			}
		int m=sc.nextInt();
int []b=new int [m];
		for(int i=0;i<b.length;i++) {
			b[i]=sc.nextInt();
			}
int val=doUnion(arr,n,b,m);
System.out.println(val);
		
		
	}
	

}
