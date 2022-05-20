import java.util.Scanner;

public class RecursionInArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []arr=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		boolean val=issorted(arr,0);
		System.out.println(val);
	}

	private static boolean issorted(int[] arr,int i) {
		if(i==arr.length-1) {
			return true;
		}
		if(arr[i]<=arr[i+1]) {
		 boolean val=issorted(arr,i+1);
		 return val;
	}
		else
		return false;

}
}
