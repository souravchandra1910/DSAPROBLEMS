package RecursionOnTheWayUp;

import java.util.*;

public class Subsequences {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int n=sc.nextInt();
	int []arr=new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	ArrayList<Integer>al=new ArrayList<>();
	ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
	
	f1(0,arr,al,arr.length,ans);
	for(ArrayList<Integer>l:ans) {
		System.out.println(l);
	}
	
	}
	public static void f1(int i,int []arr,ArrayList<Integer>al,int n,ArrayList<ArrayList<Integer>> ans){
		if(i==arr.length) {
			ArrayList<Integer>list=new ArrayList<>(al);
			ans.add(list);
			return;
	}
		al.add(arr[i]);
		f1(i+1,arr,al,n,ans);
		al.remove(al.size()-1);
		f1(i+1,arr,al,n,ans);
		
	}

}
