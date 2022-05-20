package sortingAlgorithms;

import java.util.Scanner;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int []a=new int [n];
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	int m=sc.nextInt();
	int []b=new int [n];
	for(int i=0;i<b.length;i++) {
		b[i]=sc.nextInt();
	}
	int []ans=mergeTwoSortedArrays(a,b);
     for(int i=0;i<ans.length;i++) {
    	 System.out.print(ans[i]+" ");
     }
     System.out.println();
	}

	private static int[] mergeTwoSortedArrays(int[] a, int[] b) {
	   int []ans=new int[a.length+b.length];
	   int i=0,j=0,k=0;
	   while(i<a.length && j<b.length) {
		   if(a[i]<b[j]) {
			   ans[k]=a[i];
			   i++;
			   k++;
		   }
		   else {
			   ans[k]=b[j];
			   j++;
			   k++;
		   }
	   }
	   while(i<a.length) {
		   ans[k]=a[i];
		   i++;
		   k++;
	   }
	   while(j<b.length) {
		   ans[k]=b[j];
		   j++;
		   k++;
	   }
	   
		return ans;
	}

}
