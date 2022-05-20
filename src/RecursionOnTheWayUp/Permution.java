package RecursionOnTheWayUp;
import java.util.*;
public class Permution {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String str=sc.next();
		 ArrayList<String>al=printPermutations(str,"");
		
		   for(String val:al) {
			   System.out.println(val);
		   }
	}
	  public static ArrayList<String> printPermutations(String s, String asf) {
	      String str= sortString(s);
		  ArrayList<String>al=new ArrayList<>();
		  if(str.length()==0){
	           System.out.println(asf);
	           return al;
	       }
	       
	       for(int i=0;i<str.length();i++){
	           char ch=str.charAt(i);
	           String lh=str.substring(0,i);
	           String rh=str.substring(i+1);
	           String res=lh+rh;
	           printPermutations(res,asf+ch);
	       }
	       return new ArrayList<String>();
	       
	       
	        
	    }
	  public static String sortString(String inputString)
	    {
	        // convert input string to char array
	        char tempArray[] = inputString.toCharArray();
	          
	        // sort tempArray
	        Arrays.sort(tempArray);
	          
	        // return new sorted string
	        return new String(tempArray);
	    }

}
