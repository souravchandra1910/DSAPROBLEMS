package competitiveProgramming;

import java.util.Scanner;

public class FOODCHAIN {

	public static void main(String[] args) {
		try{
		    Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0){
		    int x=sc.nextInt();
		    int k=sc.nextInt();
		    int c=0;
	        while(x>0) {
	        	c++;
	        	int val=(x/k);
	        	x=val;
	        }
	        System.out.println(c);
		}
		}
		catch(Exception e){
		    
		}

	}

}
