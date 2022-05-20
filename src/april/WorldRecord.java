package april;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WorldRecord {
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
	float nextFloat()
	{
	return Float.parseFloat(next());
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
		try {
			FastScanner sc=new FastScanner ();
		int t=sc.nextInt();
		while(t--!=0) {
	float k1= sc.nextFloat();
	float k2= sc.nextFloat();
	float k3= sc.nextFloat();
	float v= sc.nextFloat();
	
		
	float number =100/(k1*k2*k3*v);

	float a=(float) (Math.round(number*100)/100.0);
		float b=9.58f;
	if(a < b ) {
		System.out.println("yes");
	}
	else {
		System.out.println("no");
	}
	}
		
		}
		catch (Exception e) {
		
		}
	
	}
}
