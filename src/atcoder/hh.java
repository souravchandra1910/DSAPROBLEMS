package atcoder;
import java.util.*;
public class hh {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		HashMap<Character,Integer>hm1=new HashMap<>();
		HashMap<Character,Integer>hm2=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='0' && ch<='9') {
				hm1.put(ch,hm1.getOrDefault(ch,0)+1);
			}
		}
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if((ch>='A' && ch<='Z') ||(ch>='a' && ch<='z')) {
				hm2.put(ch,hm2.getOrDefault(ch,0)+1);
			}
		}
		char mfc=str.charAt(0);
		int mf=0;
		char mfn='0';
		int mn=0;
		
		for(char key:hm2.keySet()) {
			if(hm2.get(key)>mf) {
				mfc=key;
				mf=hm2.get(key);
			}
		}
		for(char key:hm1.keySet()) {
			if(hm1.get(key)>mn) {
				mfn=key;
				mn=hm1.get(key);
			}
		}
		int sp=Math.abs(mf-mn);
		char a=str.charAt(sp);
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch==a && ch!=' ') {
				// nothing to do
			}
			else if(ch==' ') {
				sb.append("$");
			}else {
				sb.append(ch);
			}
			
		}
		System.out.println(sb.toString());
		

	}

}
