package competitiveProgramming;

import java.util.Scanner;

public class SerejaandDima {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
			int n=sc.nextInt();
			int[]arr=new int[n];
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			int i=0;
			int j=arr.length-1;
			int turn =1;
			int a=0;
			int b=0;
			while(i<=j) {
				if(arr[i]>=arr[j]) {
					if(turn%2==1) {
						a+=arr[i];
					}else {
						b+=arr[i];
					}
					turn++;
					i++;
				}
				else {
					if(turn%2==1) {
						a+=arr[j];
					}else {
						b+=arr[j];
					}
					turn++;
					j--;
				}
			}
			System.out.println(a+" "+b);
		}
	

}
