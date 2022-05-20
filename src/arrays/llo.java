package arrays;
import java.util.*;

public class llo{

public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
  String str=sc.next();
  solve(str,str.length());
  System.out.println( solve(str,str.length()));
  
 }
static int solve(String s, int n) {
    HashMap<Integer,Integer>hm=new HashMap<>();
    char []arr=s.toCharArray();
    int j=0;
    int i=0;
    while(i<arr.length) {
    	if(arr[i]=='1') {
    	j=i;
    	while(i<arr.length && arr[i]=='1'){
    		i++;
    	}
    	hm.put(i-j,hm.getOrDefault(i-j,0)+1);
    }else {
    	i++;
    }
    }
  System.out.println(hm);
    int mf=0;
      for(int key:hm.keySet()) {
    	  if(hm.get(key)>=mf) {
    		  mf=key;
    	  }
      }
     
      int diff=0;
      for(int key:hm.keySet()){
    	  System.out.println(mf+"   "+key);
    	  diff+=(Math.abs(mf-key)*hm.get(key));
      }
     
      return diff;
}

}