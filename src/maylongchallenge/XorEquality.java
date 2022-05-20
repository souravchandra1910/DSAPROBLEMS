package maylongchallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class XorEquality {
	static class FastScanner
	{
	BufferedReader br;
	StringTokenizer st;
	public FastScanner()
	{
	br = new BufferedReader(new InputStreamReader(System.in));
	}
	String next()
	{
	while (st == null || !st.hasMoreElements())
	{
	try
	{
	st = new StringTokenizer(br.readLine());
	}
	catch (IOException e)
	{
	e.printStackTrace();
	}
	}
	return st.nextToken();
	}
	int nextInt()
	{
	return Integer.parseInt(next());
	}
	long nextLong()
	{
	return Long.parseLong(next());
	}
	double nextDouble()
	{
	return Double.parseDouble(next());
	}
	String nextLine()
	{
	String str = "";
	try
	{
	str = br.readLine();
	}
	catch (IOException e)
	{
	e.printStackTrace();
	}
	return str;
	}
	}
	static long power(long x, int y, int p)
	  {
	    long res = 1; // Initialize result
	 
	    x = x % p; // Update x if it is more than or
	    // equal to p
	 
	    if (x == 0)
	      return 0; // In case x is divisible by p;
	 
	    while (y > 0)
	    {
	 
	      // If y is odd, multiply x with result
	      if ((y & 1) != 0)
	        res = (res * x) % p;
	 
	      // y must be even now
	      y = y >> 1; // y = y/2
	      x = (x * x) % p;
	    }
	    return res;
	  }
	 
	
	public static void main(String[] args) {
		FastScanner sc=new FastScanner ();
	
		int t=sc.nextInt();
		while(t--!=0) {
			int N=sc.nextInt();
			int val=1000000007;
			long ans=power(2,N-1,val);
			
			System.out.println(ans);
			
			
			

	}

}}
