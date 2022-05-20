package slidingWindow;
import java.util.*;
public class SlidingWindowMax {

	public static void main(String[] args) {
		int arr[] = { 1,3,-1,-3,5,3,6,7};
        int k = 3;
//        int val=max(arr,k);
//        System.out.println(val);
//        maxineach(arr,k);
        int n=arr.length;
        int []ans=new int[n-k+1];
  		 int[] nge = new int[arr.length];

  	    Stack<Integer> st = new Stack<>();
  	    st.push(arr.length - 1);
  	    nge[arr.length - 1] = arr.length;

  	    for(int i = arr.length - 2; i >= 0; i--){
  	      while(st.size() > 0 && arr[i] >= arr[st.peek()]){
  	        st.pop();
  	      }

  	      if(st.size() == 0){
  	        nge[i] = arr.length;
  	      } else {
  	        nge[i] = st.peek();
  	      }

  	      st.push(i);
  	    }

  	    

  	    int j = 0,idx=0;
  	    for(int i = 0; i <= arr.length - k; i++){
  	      if(j < i){
  	        j = i;
  	      }

  	      while(nge[j] < i + k){
  	        j = nge[j];
  	      }
  	      ans[idx++]=arr[j];
  	    }
  		
		for(int val:ans) {
			System.out.println(val);
		}
		
//        slidingwindow(arr,arr.length,k);
      
        
	}
	public static int max(int []arr,int k) {
		int i=0,j=k-1;
		int maxs=Integer.MIN_VALUE;
		while(i<arr.length && j<arr.length) {
			int sum=0;
			for(int a=i;a<=j;a++) {
				sum+=arr[a];
			}
			if(sum>maxs)
				maxs=sum;
			i++;
			j++;
		}
		return maxs;
	}

	public static void maxineach(int []arr,int k) {
		int i=0,j=k-1;
		
		while(i<arr.length && j<arr.length) {
			int max=0;
			for(int a=i;a<=j;a++) {
				max=Math.max(arr[a],max);
			}
			System.out.print(max+" ");
			i++;
			j++;
		}
	}
}
	
//	import java.io.*;
//	import java.util.*;
//
//	public class Main{
//	  
//
//	public static void main(String[] args) throws Exception {
//	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//	    int n = Integer.parseInt(br.readLine());
//	    int[] arr = new int[n];
//	    for(int i = 0; i < n; i++){
//	       arr[i] = Integer.parseInt(br.readLine());
//	    }
//	    int k = Integer.parseInt(br.readLine());
//
//	    // code
//
//	    // nge begin
//	    int[] nge = new int[arr.length];
//
//	    Stack<Integer> st = new Stack<>();
//	    st.push(arr.length - 1);
//	    nge[arr.length - 1] = arr.length;
//
//	    for(int i = arr.length - 2; i >= 0; i--){
//	      while(st.size() > 0 && arr[i] >= arr[st.peek()]){
//	        st.pop();
//	      }
//
//	      if(st.size() == 0){
//	        nge[i] = arr.length;
//	      } else {
//	        nge[i] = st.peek();
//	      }
//
//	      st.push(i);
//	    }
//
//	    // nge end
//
//	    int j = 0;
//	    for(int i = 0; i <= arr.length - k; i++){
//	      if(j < i){
//	        j = i;
//	      }
//
//	      while(nge[j] < i + k){
//	        j = nge[j];
//	      }
//	      System.out.println(arr[j]);
//	    }
//	 }
//	}
//	                        
//}          
