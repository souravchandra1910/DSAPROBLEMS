package ds;

public class EulidsAlgorithm {

	public static void main(String[] args) {
		int val=gcd(16,10);
		System.out.println(val);
	}

	public static int gcd(int a,int b) {
		
		if(b==0) {
			
			return a;
		}
		else {
			return gcd(b,a%b);
		}
	}
	
	
}
