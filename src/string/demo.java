package string;

public class demo {
public static void main(String []args) {
	String s1="Hello";
	String s2="Hello";
	String s3=new String("Hello");
	
//	implications of interning 
//	== checks only address
//	equals checks address then  || character by character check any one true return true
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
	System.out.println(s1==s3);
	System.out.println(s1.equals(s3));
}
}
