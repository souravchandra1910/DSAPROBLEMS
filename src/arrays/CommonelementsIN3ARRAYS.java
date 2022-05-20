package arrays;

import java.util.*;

public class CommonelementsIN3ARRAYS {
public static ArrayList<Integer> common(int []a,int[] b,int[] t){
	Set<Integer>set =new HashSet<>();
	for(int val:a) {
		set.add(val);
	}
	Set<Integer>set1 =new HashSet<>();
	for(int val:b) {
		set1.add(val);
	}
	Set<Integer>intersection =new HashSet<>();
	for(int val:t) {
		if(set.contains(val) && set1.contains(val)) {
			intersection.add(val);
		}
	}
	ArrayList<Integer>al=new ArrayList<>();
	
	for(int val:intersection) {
		al.add(val);
	}
	Collections.sort(al);
	return al;
}
	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	int []a=new int[n];
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	int m=sc.nextInt();
	int []b=new int[m];
	for(int i=0;i<b.length;i++) {
		b[i]=sc.nextInt();
	}
	
	int k=sc.nextInt();
	int []t=new int[n];
	for(int i=0;i<t.length;i++) {
		t[i]=sc.nextInt();
	}
	 ArrayList<Integer>al=common(a,b,t);
	for(int c:al) {
		System.out.println(c);
	}
	}

}
