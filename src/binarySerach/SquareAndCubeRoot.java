package binarySerach;

import java.util.Scanner;

public class SquareAndCubeRoot {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	System.out.println(Integer.MAX_VALUE);
   System.out.println(10e9+7);
	int val=squareRoot(n);
	System.out.println(val);
	int v=cubeRoot(n);
	System.out.println(v);
	int r=sc.nextInt();
	int a=nthRoot(n,r);
	
	System.out.println(a);
}

public static int squareRoot(int n) {
	int lo=1,hi=n,ans=1;
	while(lo<=hi) {
		int mid=(lo+hi)/2;
		if(mid*mid<=n) {
		   ans=mid;
		   lo=mid+1;
		}
		else {
			hi=mid-1;
		}
	}
		return ans;
  
}
public static int cubeRoot(int n) {
	int lo=1,hi=n,ans=1;
	while(lo<=hi) {
		int mid=(lo+hi)/2;
		if(mid*mid*mid<=n) {
		   ans=mid;
		   lo=mid+1;
		}
		else {
			hi=mid-1;
		}
	}
		return ans;
  
}
public static int nthRoot(int n,int r) {
	int lo=1,hi=n,ans=1;
	while(lo<=hi) {
		int mid=(lo+hi)/2;
		int a=(int)Math.pow(mid,r);
		if(a<=n) {
		   ans=mid;
		   lo=mid+1;
		}
		else {
			hi=mid-1;
		}
	}
		return ans;
  
}

}
