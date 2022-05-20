package arrays;

import java.util.*;

public class BoyerMooveVotemajorityAlgoritmMAJORITYELEMENTS {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int [] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		 majorityelement(a);
	}
	public static void majorityelement(int[] arr) {
		int val=value(arr);
		int freq=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==val) {
				freq++;
				
			}
		}
		if(freq>arr.length/2) {
		System.out.println(val);}
		else {
			System.out.println("Invalid");
		}
	}
public static int value(int []arr) {
	int val=arr[0];
	
	int count=1;
	// creating pairs of equal and unequal elements 
	
	for(int i=1;i<arr.length;i++) {
		// equal hai to count++
		if(val==arr[i]) {
			count++;
			// unequal hai to mapping
		}else {
			count--;
		}
	
	if(count==0) {
		val=arr[i];
		count =1;
	}
	}

	return val;
}
	
	
}
