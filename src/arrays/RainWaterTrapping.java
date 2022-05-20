package arrays;

import java.util.Scanner;

public class RainWaterTrapping {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int []arr=new int [n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int []l=new int [n];
		int []r=new int [n];
		// dono array mein 1st and last elements dal denge
//		and max height find karenge
	l[0]=arr[0];
	r[n-1]=arr[n-1];
	for(int i=1;i<n;i++) {
		l[i]=Math.max(arr[i],l[i-1]);
	
	}
	for(int i=n-2;i>=0;i--) {
		r[i]=Math.max(arr[i],r[i+1]);
	}
int sum=0;
for(int i=0;i<arr.length;i++) {
	sum+=Math.min(l[i],r[i])-arr[i];
}
System.out.println(sum);
	}
//4,2,0,3,2,5
}
