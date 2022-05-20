package cylicSOrt;

import java.util.Scanner;

public class CYclicsort_01 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int []arr=new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	cs(arr);
for(int a:arr) {
	

System.out.println(a);
}
	}
	
	public static void cs(int []arr) {
		int i=0;
		while(i<arr.length) {
			int correct=arr[i]-1;
			if(arr[i]!=arr[correct]) {
				swap(arr,i,correct);
			}
			else {
				i++;
			}
		}
	}
	public static void swap(int []arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
