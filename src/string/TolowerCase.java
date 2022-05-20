package string;

import java.util.*;

public class TolowerCase {
public static String toLowerCase(String str) {
	StringBuilder sb=new StringBuilder();
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch>='A'&& ch<='Z') {
			char l=((char)(ch+32));
			sb.append(l);
		}
	}
	return sb.toString();
	
	
	
	
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String l=toLowerCase(str);
		System.out.println(l);

	}

}
