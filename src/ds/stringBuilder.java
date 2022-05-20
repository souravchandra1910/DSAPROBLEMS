package ds;
import java.util.*;
public class stringBuilder {

	public static void main(String[] args) {
	StringBuilder sb=new StringBuilder("Hello");
	System.out.println(sb);
	char c=sb.charAt(0);//get
	
	System.out.println(c);
	
	sb.setCharAt(0,'d');// set
	
	System.out.println(sb);
	
	sb.insert(2, 'k');// insert
	System.out.println(sb);
	
	sb.deleteCharAt(2);// remove
	System.out.println(sb);
	
	sb.append('g');// add at last
	System.out.println(sb);
	
	System.out.println(sb.length());
	}

}
