package div3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Island {
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
int x=sc.nextInt();
int y=sc.nextInt();
int xr=sc.nextInt();
int yr=sc.nextInt();
int d=sc.nextInt();
int X=xr*d;
int Y=yr*d;
if(x>=X && y>=Y) {
	System.out.println("yes");
}
else {
	System.out.println("NO");
}
}}
	
	

}
