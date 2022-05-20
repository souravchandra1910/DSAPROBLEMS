package hashmapsandsets;
import java .util.*;
public class Hm_04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	       String str=sc.nextLine();
	       HashMap<Character,Integer>hm=new HashMap<>();
	       for(int i=0;i<str.length();i++){
	           char ch=str.charAt(i);
	         hm.put(ch, hm.getOrDefault(ch,0)+1);
	       }
	       
	     char mf=str.charAt(0);
	       for(Character key : hm.keySet()){
	          
	           if(hm.get(key)>hm.get(mf)){
	               mf=key;
	           }
	       }
	       System.out.println(mf);
	    }

	}


