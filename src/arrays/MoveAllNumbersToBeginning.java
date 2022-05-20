
/////Check If the left and right pointer elements are negative then simply increment the left pointer.
//Otherwise, if the left element is positive and the right element is negative then simply swap 
//the elements, and simultaneously increment and decrement the left and right pointers.
//Else if the left element is positive and the right element is also positive then 
//simply decrement the right pointer.
//Repeat the above 3 steps until the left pointer ≤ right pointer.
//-12 11 -13 -5 6 -7 5 -3 11 
                    

package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;




public class MoveAllNumbersToBeginning {
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
	public static int [] sort(int []arr,int n) {
		int i=0;
		int j=n-1;
		while(i<=j) {
			if(arr[i]<0 && arr[j]<0) {
				i++;
			}
			else if(arr[i]>0 && arr[j]<0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}else if(arr[i]>0 && arr[j]>0) {
				j--;
			}
			else {
				i++;
				j--;
			}
		}
		return arr;
	}	
	public static void main(String[] args) {
		FastScanner sc=new FastScanner ();
		int n=sc.nextInt();
		int []arr=new int[n];
		for( int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		
		}
		
		int []val=sort(arr,arr.length);
		for(int i=0;i<val.length;i++) {
			System.out.println(val[i]);
		}
		
		

	}

}
