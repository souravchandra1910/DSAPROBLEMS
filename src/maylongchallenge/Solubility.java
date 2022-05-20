package maylongchallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solubility {
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
	try{FastScanner sc=new FastScanner();
	int t=sc.nextInt();
	while(t--!=0) {
		int x=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int val=(a+(100-x)*b)*10;
		System.out.println(val);
	}

	}
catch(Exception e) {
	
	
	
}
}}