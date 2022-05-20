package cylicSOrt;

import java.util.Scanner;

public class FirstMissingNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	    	int val=cs(arr);
	    	System.out.println(val);
	 
		}
		
		public static int cs(int []arr) {
			int i=0;
			while(i<arr.length) {
				int correct=arr[i]-1;
				if(arr[i]!=arr[correct]) {
					swap(arr,i,correct);
					
				}
				else {
					i++;
				}
			}
			for(int j=0;j<arr.length;j++) {
				if(arr[j]!=j+1)return j+1;
				
			}
			return arr.length;
		}
		public static void swap(int []arr,int i,int j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}

	}
