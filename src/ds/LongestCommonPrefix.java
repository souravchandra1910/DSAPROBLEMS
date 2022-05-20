package ds;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[]a= {"flower","flow","floot"};
		 String s=longestCommonPrefix1(a);
System.out.println(s);
	}
	 public  static String longestCommonPrefix1(String[] strs) {
		 if(strs.length==0)return "";
		 String prefix=strs[0];
		    for(int i=1;i<strs.length;i++){
		    	while(strs[i].indexOf(prefix)!=0) {
		    		
		    		prefix=prefix.substring(0,prefix.length()-1);
		    		
		    	}
		    	
		    }  
		    
		    return prefix;
		    
		    }
	
	
	
	
	
}
