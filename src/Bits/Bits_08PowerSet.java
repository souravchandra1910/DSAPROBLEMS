package Bits;

import java.util.*;

public class Bits_08PowerSet {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String str=sc.next();
       int n=str.length();
       ArrayList<String>a=powerSet(str,n);
       System.out.println(a);

	}
	
public static ArrayList<String>powerSet(String str,int n){
	ArrayList<String>al=new ArrayList<>();
	for(int i=0;i<=((1<<n)-1);i++) {
		String s="";
		for(int j=0;j<n;j++) {
			if((i & (1<<j))!=0) {
				s+=str.charAt(j%2);
			}
		}
			
			al.add(s);
		}
	Collections.sort(al);
	
	return al;
	
	
}
}
//        _ _ _