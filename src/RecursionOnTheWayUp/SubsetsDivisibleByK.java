package RecursionOnTheWayUp;

import java.util.ArrayList;
import java.util.Scanner;

public class SubsetsDivisibleByK {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		ArrayList<Integer>al=new ArrayList<>();
		int k=sc.nextInt();
		int sum=0;
		f1(0,arr,al,arr.length,k,sum);
		}
public static void f1(int i,int []arr,ArrayList<Integer>al,int n,int k,int sum){
			if(i==arr.length) {
				if(sum%k==0) {
				for(int val:al) {
					System.out.print(val+" ");
				}	
				System.out.println();
				}
				return;
		}
			al.add(arr[i]);
			sum+=arr[i];
			f1(i+1,arr,al,n,k,sum);
			al.remove(al.size()-1);
			sum-=arr[i];
			f1(i+1,arr,al,n,k,sum);
			
		}

	}