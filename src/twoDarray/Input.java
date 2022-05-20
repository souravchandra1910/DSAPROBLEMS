package twoDarray;

import java.util.Arrays;

public class Input {

	public static void main(String[] args) {
		int[][]arr= {
				     {1 ,2, 3, 4 },
					 {5 ,6, 7, 8 },
					 {9,10,11,12 },
					 {13,14,15,16}
					};
	
       for(int j=arr.length-1;j>=0;j--) {
    	  if((j & 1)!=0) {
    		  for(int i=0;i<arr.length;i++) {
    			  System.out.print(arr[i][j]+" ");
    		  }
    	  }
    		  else {
    			  for(int i=arr.length-1;i>=0;i--) {
    				  System.out.print(arr[i][j]+" ");
    		  }
    	  }
    	
       }
       
	}

}
