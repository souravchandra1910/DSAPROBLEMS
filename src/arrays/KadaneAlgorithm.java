package arrays;

import java.util.Scanner;

public class KadaneAlgorithm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		int val=sum(arr);
		System.out.println(val);
	}
	
	
	public static int sum(int []arr) {
		int csum=arr[0];
		int osum=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(csum>=0) {
				csum+=arr[i];
				
			}else {
				csum=arr[i];
				
			}
			if(csum>osum) {
				osum=csum;
			}
		}
		
		return osum;
	}
	

}
