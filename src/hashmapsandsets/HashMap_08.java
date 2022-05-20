package hashmapsandsets;

import java.util.*;

public class HashMap_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); 
			int n1=sc.nextInt();
			int []arr=new int[n1];
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
		

	HashMap<Integer,Boolean> hm=new HashMap<>();
	for(int val:arr) {
		hm.put(val,true);
		
		
	}
	
	for(int val:arr) {
		if(hm.containsKey(val-1)) {
		hm.put(val, false);
	}
	}
	int ml=0;
	int msp=0;
	for(int val:arr) {
		if(hm.get(val)==true) {
			int tl=1;
			int tsp=val;
			while(hm.containsKey(tsp+tl)) {
				tl++;
			}
			if(tl>ml) {
				ml=tl;
				msp=tsp;
			}
			
			
		}
		
		
	}
	
	
	for(int i=0;i<ml;i++) {
		
		System.out.println(msp+i);
	}
}
}