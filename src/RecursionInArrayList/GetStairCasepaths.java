package RecursionInArrayList;

import java.util.*;

public class GetStairCasepaths {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
ArrayList<String>al=getStairPaths(n);
System.out.println(al);
	}
	
	
	public static ArrayList<String>getStairPaths(int n){
		if(n==0) {
			ArrayList<String>bres =new ArrayList<String>();
			bres.add("");
			return bres;
		}else if(n<0) {
			ArrayList<String>bres=new ArrayList<String>();
			return bres;
		}
		ArrayList<String>paths1=getStairPaths(n-1);
		ArrayList<String>paths2=getStairPaths(n-2);
		ArrayList<String>paths3=getStairPaths(n-3);
		
		
		ArrayList<String>mres=new ArrayList<>();
		for(String val:paths1) {
			mres.add(1+val);
		}
		for(String val:paths2) {
			mres.add(2+val);
		}
		for(String val:paths3) {
			mres.add(3+val);
		}
		return mres;
	}
	

}
