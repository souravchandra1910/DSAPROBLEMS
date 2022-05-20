package ds;

import java.util.*;

public class Elclassico {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int t=sc.nextInt();
	while(t--!=0) {
	int n=sc.nextInt();
	int m=sc.nextInt();
	int f[]=new int [n];
	for(int i=0;i<n;i++) {
		f[i]=sc.nextInt();
	}
	int c[]=new int[m];
	for(int i=0;i<m;i++) {
		c[i]=sc.nextInt();
	}
	int i=0;
	int j=0;
	int count=0;
	while(f[i] < f.length && c[j] < c.length) {
	if(f[i] < c[j] && count==0) {	
		i++;
		
	}else if(c[j] < f[i]){
		count++;
		j++;
	}else if(f[i] < c[j]) {
		count++;
		
		i++;
	
	}
		
		
	}
	if(f[i]<f.length) {
		i++;
	}
	else if(c[j]<c.length) {
		j++;
	}
	
	System.out.println(count);
	}

}}
