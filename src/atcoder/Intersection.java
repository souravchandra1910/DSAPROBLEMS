package atcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Intersection {
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
	FastScanner sc=new FastScanner ();
	int n=sc.nextInt();
	
int x[]=new int [n];
int y[]=new int[n];
for(int i=0;i<n;i++) {
	x[i]=sc.nextInt();
	
}
for(int i=0;i<n;i++) {
	y[i]=sc.nextInt();
}
Arrays.sort(x);
Arrays.sort(y);
int ans=y[0]-x[n-1]+1;
ans=Math.max(0, ans);
System.out.println(ans);
}

}
