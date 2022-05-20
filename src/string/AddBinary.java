package string;

import java.util.Scanner;

public class AddBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String val=ab(s1,s2);
		
		System.out.println(val);

	}
	
	
	public static String ab(String s1,String s2) {
		StringBuilder res=new StringBuilder();
		
		int i=s1.length()-1;
		int j=s2.length()-1;
		int carry=0,sum;
		while(i>=0 || j>=0) {
			sum=carry;
			if(i>=0)
			sum+=s1.charAt(i)-'0';
			if(j>=0)
			sum+=s2.charAt(j)-'0';
			
		
			
			int val=sum%2;
			
			res.append(val);
			
			carry=sum/2;
			
			i--;
			j--;
		}
		
	
		if(carry!=0) {
			res.append(carry);
			
		}
	
		
		res.reverse();
		
		return res.toString();
	}

}
