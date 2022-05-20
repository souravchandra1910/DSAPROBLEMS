package serandsort;

import java.util.Scanner;

public class SquareAndcuberootofanumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int target=sc.nextInt();
		int v1=squareRoot(target);
		int v2=cubeRoot(target);
		System.out.println(v1+" "+v2);

	}

	private static int squareRoot(int target) {
	
		  int ans=0;
		  if(target==0)return ans;
		  int lo=1;
		  int hi=target/2;
		  while(lo<=hi) {
			  // find the largest mid * mid <=target
			  int mid=lo+(hi-lo)/22;
		  if(mid * mid <=target) {
			  ans=mid;
			  lo=mid+1;
		  }
		  else {
			  hi=mid-1;
		  }
			  
		  }
		return ans;
	}

	private static int cubeRoot(int target) {

		  int ans=0;
		  if(target==0)return ans;
		  int lo=1;
		  int hi=target/2;
		  while(lo<=hi) {
			  // find the largest mid * mid * mid <=target
			  int mid=lo+(hi-lo)/2;
		  if(mid * mid *mid <=target) {
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
