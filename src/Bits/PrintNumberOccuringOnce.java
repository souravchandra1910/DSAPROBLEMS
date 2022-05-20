package Bits;

import java.util.*;

public class PrintNumberOccuringOnce {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		List<Integer>al=Number(arr,n);
		System.out.println(al);

	}
//  Given a array of two numbers where each number occurs twice 
//  and two numbers occur once
	
	private static List<Integer> Number(int[] arr, int n) {
		List<Integer>al=new ArrayList<>();
		int xor=0;
		for(int i=0;i<arr.length;i++) {
			xor=xor^arr[i];
		}
		int cnt=0;
		while(xor!=0) {
			if((xor & 1)!=0) {
				break;
			}else {
				cnt++;
				xor=xor>>1;
			}
		}
		int xor1=0,xor2=0;
		for(int i=0;i<arr.length;i++) {
			if((arr[i] & (1<<cnt))!=0){
				xor1=xor1^arr[i];
			}else if((arr[i] & (1<<cnt))==0) {
				xor2=xor2^arr[i];
			}
		}
		al.add(xor1);
		al.add(xor2);
		return al;
	}
}
