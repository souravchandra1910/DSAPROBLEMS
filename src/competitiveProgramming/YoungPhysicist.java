package competitiveProgramming;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class YoungPhysicist {
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
		int n=sc.nextInt();
		int sumx=0;
		int sumy=0;
		int sumz=0;
		while(n-->=1) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			int z=sc.nextInt();
			
			sumx +=x;
			sumy +=y;
			sumz +=z;
		}
	
		if(sumx==0 && sumy==0 && sumx==0) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
	}
}