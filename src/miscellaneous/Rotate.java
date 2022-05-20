package miscellaneous;

import java.util.Scanner;

public class Rotate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int [n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int d=sc.nextInt();
		rotate(arr,n,d);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	 public static void rotate(int arr[], int n,int d)
	    {
	         swap(arr,0,d-1);
	         swap(arr,d,n-1);
	         swap(arr,0,n-1);
	    }
	    public static void swap(int [] arr,int i,int j){
	        while(i<j){
	            int temp=arr[i];
	            arr[i]=arr[j];
	            arr[ j]=temp;
	            i++;
	            j--;
	        }
	      }
}
