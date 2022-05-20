package stack;
import java.util.*;
public class BalancedParenthesis {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
	   boolean val=isBalanced(str);
	   System.out.println(val);
	    

	}
	public static boolean isBalanced(String str) {
	  Stack<Character>st=new Stack<>();
	  char []s=str.toCharArray();
      for(int i=0;i<s.length;i++) {
	  if(s[i]=='(' || s[i]=='{'  || s[i]=='[') {
		 	st.push(s[i]);
				 }
	else {
		if(st.size()==0)return false;
		char ch=st.pop();
		if(s[i]==')' && ch=='(' || s[i]=='}' && ch=='{' || s[i]==']' && ch=='[') {
			continue;
				}
		else {
		return false;
			}
		}
		}
	if(st.isEmpty()==true) return true;
	else return false;	
	}

}
