package string;

import java.util.Scanner;

public class reverseString {
	 public static String reverseWord(String str)
	    {
	      char []ch=str.toCharArray();
	      int i=0,j=ch.length-1;
	      while(i<j){
	          char temp=ch[i];
	          ch[i]=ch[j];
	          ch[j]=temp;
	          i++;
	          j--;
	          
	      }
	      
	      return new String(ch);
	      }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String res=reverseWord(str);
		System.out.println(res);

	}

}
