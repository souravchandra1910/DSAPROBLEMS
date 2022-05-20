package hashMapAndHeap;
//Given a string s, rearrange the characters of s so that any two adjacent characters are not the same.
//Return any possible rearrangement of s or return "" if not possible.
import java.util.*;
public class ReorganiseString {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String str=sc.nextLine();
			String s=reorganizeString(str);
			System.out.println(s);
		}
	}
	public static class pair implements Comparable<pair>{
		char ch;
		int f; 
		public pair(char ch,int f) {
			this.ch=ch;
			this.f=f;
		}
		@Override
		public int compareTo(pair o) {
			
			return o.f-this.f;
		}

	}
	 public static String reorganizeString(String s){
		 int []map=new int[26];
		 for(int i=0;i<s.length();i++) {
			 map[s.charAt(i)-'a']++;
		 }
		 
		 PriorityQueue<pair>pq=new PriorityQueue<>();
		 for(int i=0;i<26;i++) {
			 if(map[i]>0){
				 pq.add(new pair((char)('a'+i),map[i]));
			 }
		 }
		 StringBuilder sb=new StringBuilder();
		 pair curr=pq.remove();
		 sb.append(curr.ch);
		 curr.f--;
		 
		 while(pq.size()>0) {
			 pair p=pq.remove();
			 sb.append(p.ch);
			 p.f--;
			 if(curr.f>0) {
				pq.add(curr);
			 }
			 curr=p;
			 
		 }
		 if(curr.f>0)return "";
		 return sb.toString();
		 
		 
		 
		 
	 }
	
}
