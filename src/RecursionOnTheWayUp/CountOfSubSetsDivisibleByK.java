package RecursionOnTheWayUp;


import java.util.Scanner;

public class CountOfSubSetsDivisibleByK {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int sum=0;
		int val=f1(0,arr,arr.length,k,sum);
		 System.out.println(val);
		}
public static int f1(int i,int []arr,int n,int k,int sum){
        if(i==n) {
        	if(sum !=0 && sum % k==0) {
        		return 1;
        	}
        	return 0;
        }
        sum+=arr[i];
        int l=f1(i+1,arr,n,k,sum);
        sum-=arr[i];
        int r=f1(i+1,arr,n,k,sum);
        return l+r;
	}

}
