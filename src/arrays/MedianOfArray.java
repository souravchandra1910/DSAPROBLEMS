package arrays;

import java.util.*;

public class MedianOfArray {
public static int median(int []v) {
	 Arrays.sort(v);
      int mid=v.length;
 
	 
  return (v[mid/2]);
  
	
  
}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int mid=median(arr);
		System.out.println(mid);

	}

}
