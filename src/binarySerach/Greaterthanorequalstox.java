package binarySerach;

public class Greaterthanorequalstox {

	public static void main(String[] args) {
		int []arr= {2,3,5,6,8,10,12};
		int data=4;
		int l=0;
		int h=arr.length-1;
		while(l<=h) {
			int mid=(l+h)/2;
			if(data>arr[mid]) {
				l=mid+1;
			}
			else if(data<arr[mid]) {
				h=mid-1;
				
			}else
				System.out.println(arr[mid]+" "+mid);
			
		}
System.out.println(-1);
	}

}
