package matrics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RotateAMatrix90degrees {
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
		int [][]arr=new int [n][n];
		for(int i=0;i<arr.length;i++) {
			for( int j=0;j<arr[0].length;j++) {
				arr[i][j]=sc.nextInt();
				
			}}
			for(int i=0;i<arr.length;i++) {
				for( int j=i;j<arr[0].length;j++) {
					int temp=arr[i][j];
					arr[i][j]=arr[j][i];
					arr[j][i]=temp;
				}
			
			}
			
			for(int k=0;k<arr.length;k++) {
				int i=0;
				int j=arr[0].length-1;
				while(i<j) {
					int temp=arr[k][i];
					arr[k][i]=arr[k][j];
					arr[k][j]=temp;
					i++;
					j--;
				}
				
		}
		display(arr);	

	}
	public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
