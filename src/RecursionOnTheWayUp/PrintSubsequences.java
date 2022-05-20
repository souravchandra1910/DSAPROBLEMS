package RecursionOnTheWayUp;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintSubsequences {

	

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int []arr=new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	subsequece(arr,new ArrayList<Integer>(),0,arr.length);
	
	
	}
	// firstly there can only be 2^n subsets including the null set
	// each member can either be the part of subset or can't


	private static void subsequece(int[] arr, ArrayList<Integer> al, int i, int j) {
		if(i==arr.length) {
			for(int val:al) {
				System.out.print(val+" ");
			}
			System.out.println();
			return;
		}
		al.add(arr[i]);// tum mere subsequence ke part ho
		subsequece(arr,al,i+1,j);
		// once all the subsets are printed when arr[i] was the part of the 
//		subset then we remove it from the datastructure
		
		al.remove(al.size()-1);
		subsequece(arr,al,i+1,j);// getting all the subsets without arr[i]being the
//		part of the subset
		
		
	}
}
