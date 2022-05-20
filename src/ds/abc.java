package ds;
import java .util.*;

public class abc{
	public static void main(String []args) {
		int []nums= {1,2,2,4};
		
		findErrorNums(nums);
		
	}






 

	
		
		    public static int[] findErrorNums(int[] nums) {
		        HashMap<Integer,Integer> hm=new HashMap<>();
		        int i=0;
		        int v1=0;
		        int index = 0;
		        for(int val:nums){
		if(hm.containsKey(val)){
		 v1  = val;
		     index = i+1;
		    
		i++;
		}
		      else{
		          hm.put(nums[val],i);
		          i++;
		      }      
		        
		        }
		        
		        
		        return new int[]{v1, index};
		    }
		

	

}
