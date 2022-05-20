package Bits;


import java.util.Scanner;

public class Bit_09Rsb {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	      
	       int n=sc.nextInt();
	    int idx=rsmb(n);
	       System.out.println(idx);
	}
public static int rsmb(int n) {
	int mask=1;
	int i=0;
while((n & mask)==0) {	
	mask=mask<<1;
	i++;
}
	return i;
}
}
