package arrays;

import java.util.Scanner;

public class Majorityelements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int []arr=new int [n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
   int c=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;i<arr.length;i++) {
				if(arr[i]==arr[j])
				c++;
			}
		}

	}

}
