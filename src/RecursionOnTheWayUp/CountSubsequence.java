package RecursionOnTheWayUp;

import java.util.ArrayList;
import java.util.Scanner;

public class CountSubsequence {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		ArrayList<Integer>al=new ArrayList<>();
		int k=sc.nextInt();
		int sum=0;
		int count =	f1(0,arr,al,arr.length,k,sum);
		System.out.println(count);

	}
	public static int f1(int i,int []arr,ArrayList<Integer>al,int n,int k,int sum){
		if(i==arr.length) {
//			if(al.size()!=0){
			if(sum%k==0 && al.size()!=0) { 
			return 1;
			}
			else {
			return 0;
//			}
		}
	}
		al.add(arr[i]);
		sum+=arr[i];
		int l=f1(i+1,arr,al,n,k,sum);
		al.remove(al.size()-1);
		sum-=arr[i];
		int r=f1(i+1,arr,al,n,k,sum);
		
		return l+r;
	}

}


