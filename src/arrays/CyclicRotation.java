//9 8 7 6 4 2 1 3
package arrays;

import java.util.Scanner;

public class CyclicRotation {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		long a=sc.nextLong();
		long []arr=new long[(int) a];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextLong();
		}
		 Compute  obj=new  Compute () ;
		obj.rotate(arr, a);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
class Compute {
    
    public void rotate(long arr[], long n)
    {
         swap(arr,0,n-2);
         swap(arr,n-2,n-1);
         swap(arr,0,n-1);
        
        
        
    }
    public static void swap(long[] arr,long i,long j){
        while(i<j){
            long temp=arr[(int) i];
            arr[(int) i]=arr[(int) j];
            arr[(int) j]=temp;
            i++;
            j--;
        }
        
    }
    
    
}
