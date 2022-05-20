package ds;
import java .util.*;
public class Score {

	public static void main(String[] args) {
		try {
		Scanner sc=new Scanner (System.in);
		int r=sc.nextInt();
		int o=sc.nextInt();
		int c=sc.nextInt();
		int ro=20-o;
		int rb=ro*6;
		int maxr=6*rb;
		if((c+maxr) > r) {
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}
	}
catch(Exception e) {
			
		}
	}
}
