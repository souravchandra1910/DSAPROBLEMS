package competitiveProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WayTooLongWords {
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
		String str=sc.nextLine();
		StringBuilder ans=new StringBuilder();
		int len=str.length();
		if(len<=10) {
			System.out.println(str);
		}
		else if(len>10) {
			ans.append(str.charAt(0));
			ans.append(str.length()-2);
			ans.append(str.charAt(str.length()-1));
			System.out.println(ans.toString());
		}
		
		
		
		
		
	}

	}

}
