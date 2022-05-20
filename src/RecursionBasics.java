
public class RecursionBasics {

	public static void main(String[] args) {
//    fun(5);
//    fun1(5);
//   int val= fact(5);
//   System.out.println(val);
//   int a=sum(10);
//   System.out.println(a);
//   int sd=sumOfDigits(640010100);
//   System.out.println(sd);
//   int pd=productOfDigits(619);
//   System.out.println(pd);
	for(int i=0;i<8;i++) {
  int v=fibonacci(i);
  
  System.out.print(v+"\t");
	}
   
  
	}
	private static int fibonacci(int n) {
		if(n==0 || n==1) {
			return n;
		}
		int fibn1=fibonacci(n-1);
		int fibn2=fibonacci(n-2);
		int fibn=fibn1+fibn2;
		return fibn;
	}
	private static int count(int n,int c) {
		
		if(n==0)return c;
		if(n%10==0)c++;
		return count(n/10,c);
		
	}
	private static int revrse2(int n) {
		int nd=(int)Math.log10(n)+1;
		int val=helper(n,nd);
		return val;	
	}
	
	private static int helper(int n, int nd) {
		if(n%10==n)return n;
		int val=n % 10;
	 return  val* (int)Math.pow(10, nd-1) + helper(n/10,nd-1);
	
	}

	static int sum=0;
	private static void reverse(int n) {
		if(n==0)return ;
		int val=(n % 10);
		sum=sum*10+val;
		reverse(n/10);
	}
	
	

	private static int productOfDigits(int n) {
	   if(n % 10==n)return n;
	   int val= n % 10;
	   return val * productOfDigits(n/10);
	}

	private static int sumOfDigits(int n) {
	 if(n==0)return 0;
	 int val= n % 10;
	 return val+sumOfDigits(n/10);
	}

	private static int sum(int n) {
	   if(n==0)return 0;
		return n+sum(n-1);
	}

	private static int fact(int n) {
		if(n<=1) {
			return 1;
		}
		return n * fact(n-1);
	}

	public static void fun(int n) {
		if(n==0)return ;
		System.out.println(n);
		fun(n-1);
	}
	private static void fun1(int n) {
		if(n==0)return;
		fun1(n-1);
		System.out.println(n);
	}
	
	
	
	

}
