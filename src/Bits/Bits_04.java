package Bits;

import java.util.*;

public class Bits_04 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int []arr=new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
//	HashMap<Integer,Integer>hm=new HashMap<>();
//for(int i=0;i<arr.length;i++) {
//	hm.put(arr[i],hm.getOrDefault(arr[i], 0)+1);
//	
//}
////for(int val:hm.keySet()) {
////	if(hm.get(val)==1) {
////		System.out.println(val);
//	}
//}
	int xor=0;
	for(int i=0;i<arr.length;i++) {
		xor=xor^arr[i];
	}
	
	int count =0;
	while(xor!=0) {
		if((xor & 1) ==1) {
			break;
		}
		else {
		count++;
		xor=xor>>1;
		}
		
	}
	
	  
	int xor1=0;
	int xor2=0;
	for(int i=0;i<arr.length;i++) {
		if(((arr[i]) & (1<<count))==0) {
			xor1=xor1^arr[i];
		}else {
			xor2=xor2^arr[i];
		}
	}
	System.out.println(xor1);
	System.out.println(xor2);
	
	}

}
