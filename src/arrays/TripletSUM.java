package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TripletSUM {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int [n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		Arrays.sort(arr);
		int ans=0;
for(int i=0;i<arr.length-2;i++) {
		int j=i+1;
		int k=arr.length-1;
		while(j<k) {
			if(arr[i]+arr[j]+arr[k]==x) {
				ans+=1;
				break;
			}
			else if(arr[i]+arr[j]+arr[k]>x) {
				k--;
			}
			else {
				j++;
			}
			
		}
		if(ans==1)break;
		
}
System.out.println(ans);
		
		
	
	}

}
