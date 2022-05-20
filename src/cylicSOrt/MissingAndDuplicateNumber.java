package cylicSOrt;

import java.util.Scanner;

public class MissingAndDuplicateNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int []val=a(arr);
		for(int i=0;i<val.length;i++) {
			System.out.println(val[i]);
		}
	}
	public static int[]	a(int []arr) {
		int []ans=new int[2];
		int n=arr.length;
		int sum=0,ssum=0;
		for(int i=1;i<=n;i++) {
		  sum+=i;
		  ssum=ssum+i*i;
		}
		int sum1=0,ssum1=0;
		for(int i=0;i<arr.length;i++) {
			sum1+=arr[i];
			ssum1=ssum1+arr[i]*arr[i];
		}
		int val=sum-sum1;
		
		int sval=ssum-ssum1;
		
		int d=sval/val;
		
		int y=(val+d)/2;
		
		int x=d-y;

		ans[0]=x;
		ans[1]=y;
		
		
		
		
		
		return ans;
	}

}
