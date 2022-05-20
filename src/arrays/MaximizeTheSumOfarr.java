package arrays;

import java.util.*;

public class MaximizeTheSumOfarr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int val=Maximize(arr);
		System.out.println(val);
     
	}
	public static int Maximize(int arr[])
    {
         Arrays.sort(arr);
    long sum = 0;
     long m=(long)Math.pow(10,9)+7;
    for (int i = 0; i < arr.length; i++){
     sum=(sum%m+((arr[i] % m * i % m) % m))%m;
               }
    return (int)sum;
        
     
}

}
