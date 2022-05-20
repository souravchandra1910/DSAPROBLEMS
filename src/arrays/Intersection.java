package arrays;

import java.util.*;

public class Intersection {
public static int []a(int []arr,int n,int[]b,int m){
	Set<Integer>set =new HashSet<>();
	for(int val:arr) {
		set.add(val);
	}
	Set<Integer>intersection=new HashSet<>();
for(int val:b) {
if(set.contains(val)) {
	intersection.add(val);
}
}
int []a=new int[intersection.size()];
int i=0;
for(int val:intersection) {
	a[i]=val;
	i++;
	
}
return a;

}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
int []arr=new int [n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			}
		int m=sc.nextInt();
int []b=new int [m];
		for(int i=0;i<b.length;i++) {
			b[i]=sc.nextInt();
			}
		int []val=a(arr,n,b,m);
		for(int e:val)
System.out.println(e);
	}

}
