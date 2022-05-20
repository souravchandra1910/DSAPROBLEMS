package miscellaneous;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
int n=sc.nextInt();
int []a=new int [n];
for(int i=0;i<a.length;i++) {
	a[i]=sc.nextInt();
}
for(int i=0;i<a.length;i++) {
	System.out.print(a[i]+" ");
}
System.out.println();
int []b=new int [n];
int i=0;
int j=a.length-1;
while(j>=0) {
	b[i]=a[j];
	i++;
	j--;
}
for(int val:b) {
	System.out.print(val+" ");
}
	}

}
