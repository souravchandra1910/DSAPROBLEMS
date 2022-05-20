package competitiveProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chefandstreetfood {
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
String name=sc.nextLine();
String typed=sc.nextLine();
boolean val=is(name,typed);
System.out.println(val);

	}


public static boolean is(String name ,String typed) {
if(name .length()>typed.length()) {	
	return false;
}
int i=0;
int j=0;
while(i<name.length() && j<typed.length()) {
	if(name.charAt(i)==typed.charAt(j)) {
		i++;
		j++;
		
	}
	else if(i>0 && name.charAt(i-1)==typed.charAt(j)) {
		j++;
	}
	else {
		return false;
	}}
	while(j<typed.length()) {
		if(name.charAt(i-1)!=typed.charAt(j)) {
			return false;
		}j++;
	}
	return i<name.length()?false:true;
}
}