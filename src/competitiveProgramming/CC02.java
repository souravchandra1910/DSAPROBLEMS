package competitiveProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import competitiveProgramming.cc01.FastScanner;

public class CC02 {
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
	float nextFloat()
	{
	return Float.parseFloat(next());
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

		try{
		    FastScanner sc=new FastScanner();
		    int t=sc.nextInt();
		    while(t--!=0) {
              int x=sc.nextInt();
              int y=sc.nextInt();
              int sum=x+y;
              int diff=6-sum;
              if(diff<=0) {
            	System.out.println(0);
              }else {
            	  float p=(float) (diff/6.0)f;
            	  System.out.println(p);
              }
	}
		}
		catch(Exception e){
		    
		}

}
}