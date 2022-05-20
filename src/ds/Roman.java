package ds;
import java .util.*;

public class Roman {

	public static void main(String[] args) {
		String s="IV";
		int val=romanToInt(s);
		System.out.println(val);

	}
	 public static int romanToInt(String s) {
	 Map<Character ,Integer>hm=new HashMap<>();
	 hm.put('I', 1);
	  hm.put('V', 5);
	 hm.put('X', 10);
	 hm.put('L', 50);
	 hm.put('C', 100);
	 hm.put('D', 500);
	 hm.put('M', 1000);
	 int result=0;
	for(int i=0;i<s.length();i++) {
		if(i>0 && hm.get(s.charAt(i))>hm.get(s.charAt(i-1))) {
			result+=hm.get(s.charAt(i))-2*hm.get(s.charAt(i-1));
		}
		else {
			result+=hm.get(s.charAt(i));
		}
	}
	return result;
	

}}
