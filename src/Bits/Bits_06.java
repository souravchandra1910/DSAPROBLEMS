package Bits;
import java.util.*;
public class Bits_06 {
	 public static List<Integer> grayCode(int n) {
		 if(n<=0)return new ArrayList<Integer>();
         if(n==1){
                List <Integer> bres= new ArrayList<>();
                bres.add(0);
                bres.add(1);
                return bres;
         }
      List <Integer> rres= grayCode(n-1);
        List <Integer> mres= new ArrayList<>();
        for(int i=0;i<rres.size();i++){
           int a=rres.get(i);
            mres.add(0+""+a);
        }
         for(int i=rres.size()-1;i>=0;i--){
         int b=rres.get(i);
            mres.add(1+""+b);
        }
        return mres;
     }
 
     public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         List<Integer> ans=grayCode(scn.nextInt());
         Collections.sort(ans);
         System.out.println(ans);
     }
 }
