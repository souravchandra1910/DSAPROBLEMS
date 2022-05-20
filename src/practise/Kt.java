package practise;


import java.util.*;

public class Kt {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
int []arr=new int[n];
for(int i=0;i<arr.length;i++) {
	arr[i]=sc.nextInt();
		}
		
int val=maxMin(k,arr);
System.out.println(val);
	}

    public static int maxMin(int k,int[]arr) {

    	Arrays.sort(arr);
    	int val=0;
    	int Min=Integer.MAX_VALUE;
    	for(int i=0;i<=arr.length-k;i++) {
    	 val=arr[i+k-1]-arr[i];
    	 if(val<Min) {
    		 Min=val;
    	 }
    		
    	}
    	
    	
return Min;
    }

}
