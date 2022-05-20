package string;

import java.util.Scanner;

public class PrintFirstCharacterOfString {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String str=sc.nextLine();
		char []ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]!=' ' &&  (i==0 || ch[i-1]==' ')) {
				// agar character space nahi hai aur i 
//				zeroth index pe hai ya (i-1)th character space hai to 
//				print the string
				System.out.print(ch[i]+" ");
			}
		}

	}

}
