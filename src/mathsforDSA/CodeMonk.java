package mathsforDSA;
//g(x) - GCD (a[ 0 ], a[ 1 ], a[ 2 ]... a[n-1] )
//f(x) - (a[ 0 ] * a[ 1 ] * a[ 2 ]... * a[n-1] )
//The value of the MonkQuotient is: 109 + 7.
//
//The equation to be solved is: ( f(x)g(x) ) % MonkQuotient
import java.util.*;
public class CodeMonk {
 public static void main (String []args) {
	  Scanner sc=new Scanner (System.in);
      long n=sc.nextLong();
      long[] arr=new long[(int) n];
      for(int i1=0;i1<arr.length;i1++){
          arr[i1]=sc.nextLong();
      }
      long gx=arr[0];
      for(int i=1;i<arr.length;i++){
          gx=gcd(gx,arr[i]);
      }
      int mod=(int)1e9+7;
      long fx=1;
      for(int i=0;i<n;i++){
          fx= (fx % mod * arr[i] % mod) % mod;
      }
      int ans=pow(fx,gx,mod);
      System.out.println(ans);
  }
  	public static int pow(long x, long n, long p) {
		long ans=1;
		while(n > 0){
		    if( (n & 1) != 0){
		        ans=(ans*x)%p;
		    }
		    x=(x * x) % p;
		    n= n >> 1;
		}
	return (int)ans;
      }
  	static long gcd(long a, long b)  {
  		if (b == 0)
  		return a; 
  		return gcd(b, a % b);
  		}
}
