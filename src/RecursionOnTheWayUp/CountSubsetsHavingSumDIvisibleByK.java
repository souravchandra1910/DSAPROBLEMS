package RecursionOnTheWayUp;


import java.util.Scanner;

public class CountSubsetsHavingSumDIvisibleByK {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int []arr=new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	int k=sc.nextInt();
	int sum=0;
	int val=subsetDivisbleByK(arr,0,sum,k,arr.length);
	System.out.println(val);
}

	private static int subsetDivisbleByK(int[] arr, int i, int sum,int k,int n) {
		if(i==n) {
			if(sum%k==0 && sum!=0) {
				return 1;
			}
			else return 0;
		}
		sum+=arr[i];
		int l=subsetDivisbleByK(arr,i+1,sum,k,n);
		sum-=arr[i];
		int r=subsetDivisbleByK(arr,i+1,sum,k,n);
		return l+r;
		
	}
}