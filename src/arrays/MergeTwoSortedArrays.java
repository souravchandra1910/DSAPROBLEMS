package arrays;

import java.util.Scanner;

public class MergeTwoSortedArrays {
	public static int[] mergeTwoSortedArrays(int[] a, int[] b){
		   int i=0;
		   int j=0;
		   int k=0;
		   int []res=new int[a.length+b.length];
		   while(i<a.length && j<b.length){
		      if(a[i]<b[j]){
		          res[k]=a[i];
		          i++;
		          k++;
		          
		      }else{
		          res[k]=b[j];
		          j++;
		          k++;
		      } 
		       }
		     while(i<a.length ){
		         res[k]=a[i];
		          i++;
		          k++;
		     } 
		     while(j<b.length){
		         res[k]=b[j];
		          j++;
		          k++;
		     }
		    
		    return res;
		  }

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	int []a=new int[n];
	int []b=new int[m];
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
for(int i=0;i<b.length;i++) {
	b[i]=sc.nextInt();
}

int []res=mergeTwoSortedArrays(a,b);
for(int i=0;i<res.length;i++) {
	System.out.print(res[i]+" ");
}
	}

}
