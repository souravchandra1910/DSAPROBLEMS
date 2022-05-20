package hashMapAndHeap;

import java.util.*;

public class FractionToRecurringDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		
		
    String str=fractionToDecimal(n,d);
    System.out.println(str);

	}
		public static String fractionToDecimal(int num,int den) {
			if(num==0) 
				return "0";	
			
			StringBuilder ans=new StringBuilder();
			if(num<0 && den >0 ||num>0 &&  den<0) {
				ans.append("-");
			}
	        long a =Math.abs((long)num);
	        long b=Math.abs((long)den);
	        long q=(a/b);
	        long r=(a%b);
	        ans.append(q);
	        if(r==0)return ans.toString();
	        else {
	        	ans.append(".");
	        HashMap<Long,Integer>hm=new HashMap<>();
	        while(r!=0) {
	        	if(hm.containsKey(r)==true) {
	        		int len=hm.get(r);
	        		ans.insert(len, "(");
	        		ans.append(")");
	        		break;
	        		}
	        		else {
	               hm.put(r,ans.length());							
	        		r=r*10;
	        		q=r/b;
	        		ans.append(q);
	        		r=r%b;
	        	}
	        }
	        }
			return ans.toString();
						}
	}	
