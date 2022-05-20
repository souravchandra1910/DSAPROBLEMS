package Bits;

import java.util.Scanner;

public class Bits_07 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int d=divide(n,m);
		System.out.println(d);
	}
		public static int divide(int dividend, int divisor) {
	        if(dividend == 1<<31 && divisor ==-1 )return Integer.MAX_VALUE;
	        boolean val=(dividend >=0)==(divisor>=0)?true:false;
	        int result=0;
	        dividend=Math.abs(dividend);
	        divisor=Math.abs(divisor);
	        while((dividend-divisor)>=0){
	            int count=0;
	            while((dividend-(divisor<<1<<count))>=0){
	                count++;
	            }
	            System.out.println("Count"+count);
	            result+=1<<count;
	            System.out.println("Result"+result);
	           
	            dividend-=divisor<<count;
	            System.out.println("Dividend"+dividend);
	}
	        return val?result:-result;
	    }
	

	}


