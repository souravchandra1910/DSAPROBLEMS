package maylongchallenge;
import java.util.*;
public class FastExponenet {
	static int power(int x, int y)
	{
	    int res = 1;     // Initialize result
	  
	    while (y > 0)
	    {
	       
	        // If y is odd, multiply x with result
	        if ((y & 1) != 0)
	            res = res * x;
	  
	        // y must be even now
	        y = y >> 1; // y = y/2
	        x = x * x;  // Change x to x^2
	    }
	    return res;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int val=power(2,n);
		System.out.println(val);

	}

}
