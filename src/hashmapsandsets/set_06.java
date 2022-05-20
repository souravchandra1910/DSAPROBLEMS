package hashmapsandsets;

import java.util.*;

public class set_06 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner (System.in);
		 int n1=sc.nextInt();
		 int a1[]=new int[n1];
		 for(int i=0;i<a1.length;i++){
		     a1[i]=sc.nextInt();
		 }
		  int n2=sc.nextInt();
		 int a2[]=new int[n1];
		 for(int i=0;i<a2.length;i++){
		     a2[i]=sc.nextInt();
		 }
		 Set<Integer>set=new HashSet<>();
		 for(int val:a1){
		   set.add(val);
		 }
		 for(int val:a2){
		     if(set.contains(val)){
		         System.out.println(val);
		         set.remove(val);
		     }
		 }

	}

}
