////1. You are given an array(arr) of integers and a number K.
////2. You have to find the count of distinct numbers 
//in all windows of size k.
//7
//1 2 1 3 4 2 3        
//4
package hashMapAndHeap;
import java.util.*;
public class CountDistinctElementsInEveryWindowOfSizeK {
public static ArrayList<Integer>list(int []arr,int k){
//ArrayList<Integer>al=new ArrayList<>();
//HashMap<Integer,Integer>hm=new HashMap<>();
//for(int i=0;i<k-1;i++) {
//	hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
//	
//}
//for(int j=0,i=k-1;i<arr.length;) {
//	hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
//	
//	
//	al.add(hm.size());
//	
//	
//	int freq=hm.get(arr[j]);
//	if(freq==1) {
//		hm.remove(arr[j]);
//	}else {
//		hm.put(arr[j],freq-1);
//	}
//	i++;
//	j++;
//			}
//
//	return al;
//}


ArrayList<Integer>al=new ArrayList<>();
HashMap<Integer,Integer>hm=new HashMap<>();
int i=0;
while(i<k-1){
	
    hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
    i++;
}
i--;
int j=-1;
while(i<arr.length-1){
i++;
 hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
 
al.add(hm.size());

j++;
int freq=hm.get(arr[j]);
if(freq==1){
   hm.remove(arr[j]);
}
else{
   hm.put(arr[j],freq-1);
}
 
}
	return al;}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int k = scn.nextInt();
		ArrayList<Integer> ans =list(arr,k);
		for(int a : ans){
			System.out.print(a + " ");
		}

	}

}
