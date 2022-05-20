package string;

import java.util.*;

public class CountAndSay {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
		String str=sc.nextLine();
		String val=a(str);
		System.out.println(val);

	}
	public static String a(String str) {
		StringBuilder sb=new StringBuilder();
//		String str=Integer.toString(n);
		HashMap<Character,Integer>hm=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			hm.put(str.charAt(i),hm.getOrDefault(str.charAt(i),0)+1);
			
		}
		for(Character key:hm.keySet()) {
			int val=hm.get(key);
			sb.append(val+""+key);
		}
		return sb.toString();
	}

}
