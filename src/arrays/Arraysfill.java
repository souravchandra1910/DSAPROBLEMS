package arrays;

import java.util.Arrays;

public class Arraysfill {

	public static void main(String[] args) {	
		int []arr= {1,4,2,5,3};
	
	
//		Arrays.fill(arr,100);
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			max=Math.max(max,arr[i]);
		}
		for(int f=max;f>=1;f--) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>=f) {
					System.out.print("*\t");
				}
				else {
					System.out.print("\t");
				}
			}
				System.out.println();
			
		}
		System.out.println(Arrays.toString(arr));
//		

	}

}
