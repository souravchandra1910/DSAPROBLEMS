package miscellaneous;

import java.util.HashMap;
import java.util.Scanner;

public class Intersection2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in)
;
		int n=sc.nextInt();
		int m=sc.nextInt();
		int []a=new int[n];
		int []b=new int[m];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			}
		for(int i=0;i<m;i++) {
			b[i]=sc.nextInt();
		}
		int []k=in(a,b);
	for(int val:k) {
		System.out.println(val);
	}
		}
	public static int []in(int [] a,int [] b){
		HashMap<Integer,Integer>hm=new HashMap<>();
		for(int val:a) {
			hm.put(val, hm.getOrDefault(val,0)+1);
			
		}
		int count=0;
		HashMap<Integer,Integer>map=new HashMap<>();
		for(int val:b) {
			if(hm.containsKey(val)) {
				count++;
				map.put(val, hm.getOrDefault(val,0)+1);
			}
		}
		int []c=new int[count];
		int i=0;
		for(int val:map.keySet()) {
int of=map.get(val);
if(of>0) {
			c[i]=val;
}
		int nf=of-1;
		map.put(val, nf);
			i++;
		}
		
		
		
		return c;
	}
	

}
