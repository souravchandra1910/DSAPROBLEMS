package hashmapsandsets;
import java .util.*;
public class HashMapWorking {

	public static void main(String[] args) {
//		HashMap<String,Integer>hm=new HashMap<>();
//		hm.put("India", 120);
//		hm.put("sourav", 120);
//		hm.put("kt", 120);
//		hm.put("hello", 120);
//		System.out.println(hm);
//
//		
//		
//	System.out.println(hm.containsKey("India"));
//	System.out.println(hm.containsKey("Utopia"));
//	
//	
//	
//	for(String key:hm.keySet()) {
//		int val=hm.get(key);
//		System.out.println(key+" "+ val);
//	}
		 Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
		  int []arr=new int[n];
		  for(int i=0;i<arr.length;i++){
		      arr[i]=sc.nextInt();
		  }
		  
		  HashMap<Integer,Integer>hm=new HashMap<>();
		  for(int val:arr){
		      hm.put(val,hm.getOrDefault(val,0)+1);
		  }
		  System.out.println(hm);
		  
		  for(int key:hm.keySet()) {
			 System.out.println(key+" "+hm.get(key));
		  }
		}

}
