package cylicSOrt;

import java.util.Scanner;

public class MissinNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	int val=missingNumber(arr);
System.out.println(val);
	}
	public static int missingNumber(int []arr) {
		int i=0;
		while(i<arr.length) {
			if( arr[i]<arr.length && arr[i]!=i) {
				swap(arr,i,arr[i]);
				
			}
			else
				i++;
			

		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=i) {
				return i;
			}
		}
		return arr.length;
	}
	public static void swap(int []arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}

	

