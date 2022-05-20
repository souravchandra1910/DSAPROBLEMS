package RecursionOnTheWayUp;

import java.util.Scanner;

public class PerfectSumProblem {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
	    int val=perfectSum(arr,n,k);
	    System.out.println(val);
	}

	public static int perfectSum(int arr[],int n, int sum) 
	{ 
	  	int mod=(int)1e9+7;
	    int k=0;
      int val= helper(0,arr.length,arr,sum,k,mod);
      return val;
	}
	public static int helper(int i,int n,int arr[],int k,int sum,int mod){
	    if((sum % mod)>(k % mod))return 0;
	    if(i==n){
	        if((sum % mod) ==  (k % mod)){
	            return 1;
	        }
	       return 0;
	    }
	    
	    sum=((sum%mod)+(arr[i]%mod))%mod;
	    int l=helper(i+1,n,arr,k,sum,mod);
	    sum=((sum%mod)-(arr[i]%mod))%mod;
	    int r= helper(i+1,n,arr,k,sum,mod);
	    return l+r;
	    
	}
}


