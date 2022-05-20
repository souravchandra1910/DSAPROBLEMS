package string;

import java.util.*;

public class CheckDuplicateCharacters {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
HashMap<Character,Integer>hm=new HashMap<>();
for(int i=0;i<str.length();i++) {
	char ch=str.charAt(i);
	hm.put(ch,hm.getOrDefault(ch,0)+1);
}
for(Character k:hm.keySet()) {
	
	if(hm.get(k)>1) {
		System.out.println(k+ " count is  "+ hm.get(k));
		
	}
}

	}

}
