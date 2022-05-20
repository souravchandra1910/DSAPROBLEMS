import java.util.Scanner;

public class RecursionBasics2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
//		int n=sc.nextInt();
//		int[]arr=new int[n];
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=sc.nextInt();
//		}
//		swap(arr,0,arr.length-1);
//		
//       for(int i:arr) {
//    	   System.out.println(i);
//       }
      String str=sc.nextLine();
      boolean val=isPalindrome(str,0,str.length()-1);
      System.out.println(val);
	}

	private static boolean isPalindrome(String str,int i,int j) {
		
		if(i>=str.length()/2)return true;
			if(str.charAt(i)==str.charAt(j))
		  return isPalindrome(str,i+1,j-1);
			return false;
		
	}

	private static void swap(int[] arr, int i, int j) {
		  if(i>=arr.length/2) {
			  return;
		  }
	     int temp=arr[i];
	     arr[i]=arr[j];
	     arr[j]=temp;
	     swap(arr,i+1,j-1);
}	
	}


