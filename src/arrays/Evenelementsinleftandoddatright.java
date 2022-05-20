//chaar hi case ho sakte hai
//1)arr[i] ,arr[j] both even hai to i++;
//2)arr[i] ,arr[j] both odd hai to j--;
//3)arr[i] odd and arr[j] even hai to swap i++,j--;
//4)arr[i] even and arr[j] odd hai to i++;

package arrays;

import java.util.*;

public class Evenelementsinleftandoddatright {
public static int []val(int []arr){
	int i=0;
	int j=arr.length-1;
	while(i<j) {
		if(arr[i]%2==0 && arr[j]%2==0) {
			i++;
		}
		else if(arr[i]%2==1 && arr[j]%2==1) {
			j--;
		}
		else if(arr[i]%2==0 && arr[j]%2==1) {
			i++;
		}
		else if(arr[i]%2==1 && arr[j]%2==0) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
	}
	return arr;
}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int [n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	int []a=val(arr);
	for(int k=0;k<a.length;k++) {
		System.out.print(a[k]+" ");
	}
	
	
	}

}
