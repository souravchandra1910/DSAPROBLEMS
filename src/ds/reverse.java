package ds;

public class reverse {

	public static void main(String[] args) {
		int a=78;
		int val=rev(a);
		System.out.println(val);

	}
	
	public static int rev(int x) {
		
	boolean nve=false;
	if(x<0) {
		nve=true;
		x*=-1;
		
	}
	long reversed=0;
	while(x!=0) {
		reversed=(reversed * 10)+ x % 10;
		x/=10;
	}
	if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE  ) {
		
		return 0;
	}
	
	return nve?(int)(reversed*-1):(int)reversed;
	
	}

}
