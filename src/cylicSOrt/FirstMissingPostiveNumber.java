package cylicSOrt;

import java.util.Scanner;

public class FirstMissingPostiveNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	int val=missingNumber1(arr);
System.out.println(val);
	}
	public static int missingNumber1(int []arr) {
		int i=0;
		while(i<arr.length) {
			if( arr[i]>0 && arr[i]<=arr.length && arr[i]!=i) {
				swap(arr,i,arr[i]);
				
			}
			else
				i++;
			

		}
		for(int i1=0;i1<arr.length;i1++) {
			if(arr[i1]!=i1+1) {
				return i1+1;
			}
		}
		return arr.length+1;
	}
	public static void swap(int []arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}

	

