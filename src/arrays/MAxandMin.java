package arrays;

import java.util.Scanner;

public class MAxandMin {

	public static void main (String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int []arr=new int[n];
for( int i=0;i<arr.length;i++){
    
    arr[i]=sc.nextInt();
    
}

int min=arr[0];
for(int i=1;i<arr.length;i++){
if(arr[i]<min){
    min=arr[i];
}



}
int max=arr[0];
for(int i=1;i<arr.length;i++){
if(arr[i]>max){
    max=arr[i];

}}
System.out.println(min);
System.out.println(max);
	}
}

