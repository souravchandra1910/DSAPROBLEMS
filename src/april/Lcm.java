package april;

import java.util.Scanner;

public class Lcm {

	public static void main(String[] args) {
		try{	
			Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0){
		long n=sc.nextInt();
		long m=sc.nextInt();
		long on=n;
		long om=m;
		
		while(n%m!=0){
			long  rem=n%m;
		    n=m;
		    m=rem;
		}
		long  gcd=m;
		long  lcm=(on*om)/gcd;
		System.out.println(gcd+" "+lcm);
		
		}}
		catch(Exception e){
			
		}

	}

}
