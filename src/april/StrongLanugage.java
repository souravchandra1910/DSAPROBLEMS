package april;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class StrongLanugage {
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
		try{
			FastScanner sc=new FastScanner();
int t=sc.nextInt();
while(t--!=0) {
	int n=sc.nextInt();
	int k=sc.nextInt();
	String str=sc.nextLine();
	int count=0;
for(int i=0;i<n;i++) {
	char c=str.charAt(i);
	if(c=='*') {
		count++;
	}else if(c!='*') {
		count=0;
	}
	 if(count>=k) {
		System.out.println("yes");
		return;
	}
	 
	} 

System.out.println("no");
}}
		catch (Exception e) {
			
		}


	}

}
