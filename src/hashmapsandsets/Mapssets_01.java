package hashmapsandsets;
import java.util.*;

public class Mapssets_01 {

	public static void main(String[] args) {
		int []a1= {2,3,3,4};
		int []a2= {2,3,3};
		System.out.println (intersection(a1,a2));
	}
	public static ArrayList<Integer> intersection(int []a1,int []a2){
		ArrayList<Integer>ans=new ArrayList<>();
//		SET APPROACH
//	Set<Integer>set =new HashSet<>();
//	for(int val:a1) {
//		set.add(val);
//		
//	}
//	Set<Integer>st =new HashSet<>();
//		for(int val:a2) {
//			if(set.contains(val)) {
//				ans.add(val);
//			}
//			
//			
//			
//		}
//		
		  
		
//		HASHMAP APPROACH
	HashMap<Integer,Integer>hm=new HashMap<>();
	for(int val: a1) {
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
		if(hm.containsKey(val)&& hm.get(val)>0) {
			ans.add(val);
			int of=hm.get(val);
			int nf=of-1;
			hm.put(val, nf);
			
		}
	}
		
		
		return ans;
		}
		
	}


