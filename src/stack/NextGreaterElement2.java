package stack;
import java.util.*;
public class NextGreaterElement2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int []a=new int[n];
		int []b=new int[m];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<b.length;i++) {
			b[i]=sc.nextInt();
		}
		int[] val=nextGreaterElement (a,b);
		for(int x:val) {
			System.out.println(x);
 
		}
	}
	 public static int[] nextGreaterElement(int[] nums1,int[] nums2) {
	        int []nge=nger(nums2);
	        HashMap<Integer,Integer>hm=new HashMap<>();
	        for(int i=0;i<nums2.length;i++){
	         hm.put(nums2[i],nge[i]);
	        }
	        int []ans=new int[nums1.length];
	        for(int i=0;i<nums1.length;i++){
	        ans[i]=hm.get(nums1[i]);
	        }
	        return ans;
	    }
	    public static int [] nger(int []arr){
	    int []nge=new int [arr.length];
	        Stack<Integer>st=new Stack<>();
	        st.push(arr[arr.length-1]);
	        nge[arr.length-1]=-1;
	        for(int i=arr.length-2;i>=0;i--){
	         while(st.size()>0 && arr[i]>st.peek()){
	        st.pop();
	         }
	            if(st.size()==0){
	           nge[i]=-1;
	            }
	            else{
	             nge[i]=st.peek();  
	            }
	            st.push(arr[i]);
	        }
	        return nge;
	    }
	

	
}
