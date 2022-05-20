package arrays;

import java.util.Scanner;

public class ProductofArrayExceptSelf {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			}
		int []val= productExceptSelf(arr);
		for(int a:val) {
			System.out.println(a);
		}
		
	}
	public static int[] productExceptSelf(int[] arr) {
		int n=arr.length;
     int []ans=new int [arr.length];
  
     int []right=new int[n];
     int prd=1;
     
  
     for(int i=n-1;i>=0;i--) {
       prd*=arr[i];
       right[i]=prd;
     }
     prd=1;
     for(int i=0;i<arr.length-1;i++) {
    	int lp=prd;
    	int rp=right[i+1]; 
    	ans[i]= lp*rp;
    	prd*=arr[i];
     }
     ans[n-1]=prd;
     
     
     return ans;
		
	}
}

