package competitiveProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exponentaition {
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
	public static void main(String[] args) {

		FastScanner sc=new FastScanner(); 
		int t=sc.nextInt();
		while(t--!=0) {
		long a=sc.nextLong();
		long n=sc.nextLong();
		long M=sc.nextLong();
		long val=MOD(a,n,M);
		System.out.println(val);
		}
}
	
	
	public static Long MOD(long a,long n,long M) {
		if(n==0) {
			return (long) 1;
		}
		else if(n%2==0) {
		return (long)((MOD(a,n/2,M)%M*MOD(a,n/2,M)%M)%M);}
		
		else if(n%2==1) {
			return(long)((MOD(a,n/2,M)%M*MOD(a,n/2,M)%M *a)%M);
		}
		
		return (long)0;
		
		
	}

	}
