package RecursionOnTheWayUp;

import java.util.ArrayList;
import java.util.Scanner;

public class SumDivisibleByk {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int []arr=new int[n];
       for(int i=0;i<arr.length;i++) {
    	   arr[i]=sc.nextInt();
       }
       int k=sc.nextInt();
       int sum=0;
       sumdbyk(arr,new ArrayList<Integer>(),k,0,sum,arr.length);
	}

	private static void sumdbyk(int[] arr, ArrayList<Integer>al, int k, int i, int sum, int n) {
		if(i==arr.length) {
			if(sum%k==0) {
			for(int val:al) {
				System.out.print(val+" ");
			}	
			System.out.println();
			}
			return;
	
	}
//there are two possibilities either either sum will be added or not
		al.add(arr[i]);// arr[i] is the part of subset
		sum+=arr[i];// sum is added
		sumdbyk(arr,al,k,i+1,sum,n);
		al.remove(al.size()-1);// arr[i] is not the part of subset
		sum-=arr[i];// sum not added
		sumdbyk(arr,al,k,i+1,sum,n);
			
		
	}

}
