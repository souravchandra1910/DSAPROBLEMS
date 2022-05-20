package cylicSOrt;

import java.util.Scanner;

public class SetMisMAtch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int []val=cs(arr);
	for(int a:val) {
		

	System.out.println(a);
	}
		}
		
		public static int[] cs(int []arr) {
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
			int []ans=new int[2];
			for(int i1=0;i1<arr.length;i1++) {
				if(arr[i1]!=i1+1) {
					ans[0]=arr[i1];
					ans[1]=i1+1;
				}
			}
			return ans;
			
		}
		public static void swap(int []arr,int i,int j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}

	}
