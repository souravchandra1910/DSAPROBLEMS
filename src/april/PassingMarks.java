package april;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PassingMarks {
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
try {	FastScanner sc=new FastScanner();
	int testCase=sc.nextInt();
	while(testCase--!=0) {
	int am=sc.nextInt();
	int bm=sc.nextInt();
	int cm=sc.nextInt();
	int t=sc.nextInt();
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();

	int total=(a+b+c);
	
	
	if(a>=am && b>=bm && c>=cm && total>=t) {
		System.out.println("yes");
	}
	else {
		System.out.println("no");
	}
	}}
catch (Exception e) {
	
}
	}

}
