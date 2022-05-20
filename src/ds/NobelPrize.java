package ds;
import java.util.*;

public class NobelPrize {

	public static void main(String[] args) {
		try {
		 Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0) {
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		Set<Integer> set=new HashSet<>();
		for(int val:arr) {	
			if(!set.contains(val)) {
			set.add(val);}
		}
		
		if(m > set.size()) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}}
		}
catch(Exception e) {
			
		}
	}

}
