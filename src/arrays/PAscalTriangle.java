package arrays;

import java.util.*;

public class PAscalTriangle {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	
	int n=sc.nextInt();
	
	
	ArrayList<Long>al=pascal(n);
	for(long val:al) {
		System.out.print(val+" ");
	}
	System.out.println();
	
	
	}
public static ArrayList<Long> pascal(int n){
	
	ArrayList<Long>al=new ArrayList<>();
long val=1;
for(int r=0;r<=n;r++) {
	al.add(val);
	val=val*(n-r)/(r+1);
	
}
	
	
	return al;
	
}
}
