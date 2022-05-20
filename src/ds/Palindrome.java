package ds;

public class Palindrome {

	public static void main(String[] args) {
		int val=-121;
		boolean a=isPalindrome(val);
System.out.println(a);
	}
	
	
public static boolean isPalindrome(int x) {
        if(x<0) {
        	
        	return false;
        }
        
        else {
        	int temp=x;
        	int val=0;
        	while(temp!=0) {
        		val=(val*10)+temp%10;
        		temp/=10;
        		
        	}
        	if(val==x) {
        		return true;
        	}
        	
        	return false;
        	
        	
        }
    }


}
