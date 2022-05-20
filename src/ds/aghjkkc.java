package ds;
import java.util.*;
public class aghjkkc {

	public static void main(String[] args) {
		char [] ch= {'a','b','b','b','b','b'};
		int c= compress(ch);
System.out.println(c);
	}
	
	
	    public static int compress(char[] chars) {
	        String str=String.valueOf(chars);
	        String s=str.charAt(0)+"";
	        int count =1;
	        for(int i=1;i<str.length();i++){
	char curr=str.charAt(i);
	  char prev=str.charAt(i-1);
	    if(curr==prev){
	count++;

	}else{
	if(count>1 && count<10){
	s+=count;
	    count=1;

	}
	
	        else if(count>=10){
	int rem=count%10;
	      int divd= count/10;
	          s+=rem;
	          s+=divd;
	      }
	        
	 s+=curr;       
	        
	    
	    }
	        }
	        
	      if(count>1 && count<10){
	s+=count;
	    count=1;

	}  else if(count>=10){
	int rem=count%10;
	      int divd= count/10;
	          s+=rem;
	          s+=divd;
	      }
	    char[]chs= s.toCharArray();
	      return chs.length;
	        
	    }
	}
	
	
	

