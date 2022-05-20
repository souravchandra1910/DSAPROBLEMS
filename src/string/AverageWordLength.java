package string;

import java.util.*;


public class AverageWordLength {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="Eric";
		int n=2;
		String person="Adam Caroline Rebecca Frank";
	
		int val=func(str,n,person);
		System.out.println(val);
	}

	private static int func(String str, int n, String person) {
	 ArrayList<String>al=new ArrayList<>();
	 String []arr=person.split(" ");
	 for(int i=0;i<arr.length;i++) {
		 if(arr[i].compareTo(str)<=1)
			 al.add(arr[i]);
		 else if(arr[i].compareTo(str)>1){
			 al.add(str);
			 al.add(arr[i]);
		 }
	 }
	 if(al.contains(str)==false)al.add(str);

	 int time=20,cnt=0,a=0;;
	 while(al.size()>0){
         cnt++;
		 for(int i=1;i<=n;i++) {
			 String val=al.remove(0);
			 if(val==str) {
				 a++;
				 break;
			 }
		 }
			 if(a==1)break;
		 
	 }
	 time=time * cnt;
	 return time;
  }
}
	
	


