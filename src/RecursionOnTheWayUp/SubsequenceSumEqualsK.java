package RecursionOnTheWayUp;

import java.util.ArrayList;
import java.util.Scanner;

public class SubsequenceSumEqualsK {

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
public static boolean f1(int i,int []arr,ArrayList<Integer>ds,int n,int k,int sum){
     if(i==n) {
    	 if(k==sum) {
    		
    		 for(int it:ds) {
    			 System.out.print(it+" ");
    		 }
    	
    		 System.out.println();
    		 return true;
    	 }
    	 return false;
     }
       sum+=arr[i];
       ds.add(arr[i]);
       if(f1(i+1,arr,ds,n,k,sum)==true)return true;
       sum-=arr[i];
       ds.remove(ds.size()-1);
       if(f1(i+1,arr,ds,n,k,sum)==true)return true;
       
       return false;
    
	}

}
