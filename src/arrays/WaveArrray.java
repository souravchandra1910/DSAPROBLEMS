package arrays;

import java.util.Scanner;

public class WaveArrray {


		public static void swap(int []arr,int i,int j) {

			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner (System.in);
			int n=sc.nextInt();
			int []arr=new int[n];
			for( int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			
			}
			convertToWave(arr,n);
			for(int val:arr) {  
				System.out.println(val);
			}

	}
		 public static void convertToWave(int arr[], int n){
		        
		     int i=0;
		     int j=1;
		     while(j<arr.length){
		         swap(arr,i,j);
		         i=i+2;
		         j=j+2;
		     }
		        
		    }

}
