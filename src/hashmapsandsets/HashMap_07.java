package hashmapsandsets;

import java.util.*;


public class HashMap_07 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n1=sc.nextInt();
		int []a1=new int[n1];
		for(int i=0;i<a1.length;i++) {
			a1[i]=sc.nextInt();
		}

		int n2=sc.nextInt();
		int []a2=new int[n2];
		for(int i=0;i<a2.length;i++) {
			a2[i]=sc.nextInt();
		}
		HashMap<Integer,Integer>hm=new HashMap<>();
		for(int val:a1) {
			if(hm.containsKey(val)) {
				int of=hm.get(val);
				int nf=of+1;
				hm.put(val, nf);
			}
			else {
				hm.put(val,1);
			}
		}
		for(int val:a2) {
			if(hm.containsKey(val) && hm.get(val)>0) {
		System.out.println(val);
		int of=hm.get(val);
		int nf=of-1;
		hm.put(val, nf);
		}}
	}

}
