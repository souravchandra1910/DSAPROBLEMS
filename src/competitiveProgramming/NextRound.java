package competitiveProgramming;

import java.util.Scanner;

public class NextRound {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	int k=sc.nextInt();
	int []arr=new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
		}
     int c=0;
	 for(int i=0;i<arr.length;i++) {
		 if(arr[i]>=arr[k-1] && arr[i]>0) {
			 c++;
		 }
	 }
	 System.out.println(c);
	
	
	
	}

}
