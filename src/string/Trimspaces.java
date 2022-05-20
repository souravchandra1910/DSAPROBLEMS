package string;

import java.util.Scanner;

public class Trimspaces {

	public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
String str=sc.nextLine();
char []a=str.toCharArray();
int i=0;

int j=a.length-1;
while(a[j]==' ') {
	j--;
	
}
while(a[i]==' ') {
	i++;
}


for(int k=i;k<=j;k++) {
	System.out.print(a[k]);
}

	}

}
