package miscellaneous;

import java.util.Scanner;

public class Ababs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int []arr=new int[m];
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=sc.nextInt();
//		}
		int val=c(n,arr);
		System.out.println(val);

	}
	public static int c(int n,int []c) {
		int a=c.length;
		int val= n%a;
		if(val==1) {
			val=0;
		}
		
			return val;
		
	}

}
