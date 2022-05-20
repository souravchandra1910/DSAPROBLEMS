package competitiveProgramming;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;
public class cc01 {
	

	
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
		public static void main (String[] args) throws java.lang.Exception
		{
			try{
			    FastScanner sc=new FastScanner();
			    int t=sc.nextInt();
			    while(t--!=0) {
			    	int a=sc.nextInt();
			    	int b=sc.nextInt();
			    	int c=sc.nextInt();
			    	int d=sc.nextInt();
			    	int e=sc.nextInt();
			    	int f=sc.nextInt();
			    	int c1=0,c2=0;
			    	if(a>d) {
			    		c1++;
			    	}else {
			    		c2++;
			    	}
			    	if(b>e) {
			    		c1++;
			    	}else {
			    		c2++;
			    	}
			    	if(c>f) {
			    		c1++;
			    	}else {
			    		c2++;
			    	}
			    	if(c1>c2) {
			    		System.out.println("A");
			    	}
			    	else {
			    		System.out.println("B");
			    	}
			    }
			}
			catch(Exception e){
			    
			}
		}
}

