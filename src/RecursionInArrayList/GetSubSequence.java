package RecursionInArrayList;

import java.util.*;

public class GetSubSequence {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
ArrayList <String>al=gss(str);
System.out.println(al);

	}
	
	
	public static ArrayList<String> gss(String str){
		if(str.length()==0) {
		ArrayList<String>bres=new ArrayList<>();
		bres.add("");
		return bres;
		}
	char ch=str.charAt(0);
	String res=str.substring(1);
	ArrayList<String>ros=gss(res);

	ArrayList<String>mres=new ArrayList<> ();
	for(String val:ros) {
		mres.add(""+val);
	}
	for(String val:ros) {
		mres.add(ch+val);
	}	
		
	return mres;	
		
	}

}
