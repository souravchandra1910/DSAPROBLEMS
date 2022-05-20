package string;

import java.util.Scanner;

public class RotationofstringExist {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	String goal=sc.nextLine();
	boolean val=a(str,goal);
	System.out.println(val);

	}
	public static boolean a(String str,String goal) {
		int l1=str.length();
		int l2=goal.length();
		if(l1!=l2)return false;
		String temp=str+str;
		if(temp.contains(goal))return true;
		else return false;
	}

}
