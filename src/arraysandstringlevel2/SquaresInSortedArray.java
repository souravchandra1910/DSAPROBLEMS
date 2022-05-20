package arraysandstringlevel2;
import java.util.*;
public class SquaresInSortedArray {
public static int []sorted(int []nums){
	 int []res=new int[nums.length];
     int i=0;
     int j=nums.length-1;
     int idx=res.length-1;
     while(i<=j){
         int val1=nums[i]*nums[i];
          int val2=nums[j]*nums[j];
          if(val1>val2){
             res[idx]=val1; 
             i++;
          }else{
              res[idx]=val2;
              j--;
          }
        idx--;
        
    }
     
     return res;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int []val=sorted(arr);
		for(int i=0;i<val.length;i++) {
			System.out.print(val[i]+" ");
		}

	}

}
