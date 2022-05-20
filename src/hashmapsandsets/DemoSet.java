package hashmapsandsets;
import java.util.*;
public class DemoSet {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int []arr=new int [n];
//		
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=sc.nextInt();
//		}
//	Set<Integer>set =new HashSet<>();
//for(int val:arr) {
//	set.add(val);
//}
//System.out.println(set);
	
	
//	}
//		UNION IN SETS
//		Set<Integer>set =new HashSet<>();
//	set.add(10);
//	set.add(30);
//	set.add(20);
//	
//	Set<Integer>s=new HashSet<>();
//	s.add(10);
//	s.add(21);
//	s.add(23);
//	
//	set.addAll(s);
//	System.out.println(set);
	
//	INTERSECTION IN SETS
//	Set<Integer>set =new HashSet<>();
//	set.add(10);
//	set.add(30);
//	set.add(20);
//	
//	Set<Integer>s=new HashSet<>();
//	s.add(10);
//	s.add(21);
//	s.add(23);
//	
//	set.retainAll(s);
//	System.out.println(set);
		
//		SUBSET 
		Set<Integer>set =new HashSet<>();
		set.add(10);
		set.add(30);
		set.add(20);
		
		Set<Integer>s=new HashSet<>();
		s.add(10);
//		s.add(21);
//		s.add(23);
		
		System.out.println(set.containsAll(s));
		
		System.out.println(set);
	}

}
