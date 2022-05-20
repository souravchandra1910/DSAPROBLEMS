package string;

import java.util.Scanner;

public class AddTwoStrings {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	String str=sc.nextLine();
	String s=sc.nextLine();
	String val=Add(str,s);
	System.out.println(val);
	}
	public static String  Add(String nums1,String nums2) {
	StringBuilder res=new StringBuilder();
		
	int i=nums1.length()-1;
	int j=nums2.length()-1;
	
	int carry=0;
	while(i>=0 || j>=0 || carry!=0) {
		int ival=i>=0?nums1.charAt(i)-'0':0;
		int jval=j>=0?nums2.charAt(j)-'0':0;
		i--;
		j--;
		int sum=(ival+jval)+carry;
		res.append(sum%10);
		carry=sum/10;
		
		
		
		
	}
	res.reverse();
	
	
	
	return res.toString();
	}

}
