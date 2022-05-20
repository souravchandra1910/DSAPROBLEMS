package miscellaneous;

import java.util.Scanner;

public class ExcelSheet {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String str=sc.nextLine();
		int val=get(str);
		System.out.println(val);

	}
	public static int get(String str) {
	int result=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			result=(result*26)+(ch-'A'+1);
		}
		return result;
		
		
	}

}
