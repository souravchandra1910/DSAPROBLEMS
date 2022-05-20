package april;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HIRINGTEST {
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
	int n=sc.nextInt();
	int m=sc.nextInt();
	int X=sc.nextInt();
	int Y=sc.nextInt();
for(int i=0;i<n;i++) {
	String str=sc.nextLine();
	int f=0,p=0;
	
	for(int j=0;j<str.length();j++) {
	char ch=str.charAt(j);
	if(ch=='F') {
		f++;
	}else if(ch=='P') {
		p++;
	}
	}
	if(f>=X || (f >=X-1 && p>=Y )) {
		
		System.out.print(1);
	}
	else {
		System.out.print(0);
	}
	
}
	System.out.println();

	}
	}
}
