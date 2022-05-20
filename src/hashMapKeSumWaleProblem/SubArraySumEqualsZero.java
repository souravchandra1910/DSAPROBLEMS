package hashMapKeSumWaleProblem;
import java.util.*;
public class SubArraySumEqualsZero {
	public static int solution(int[] arr) {
	 int sum=0,i=-1,ans=0;
	  HashMap<Integer,Integer>hm=new HashMap<>();
	  hm.put(sum,-1);
	  while(i<arr.length-1){
	      i++;
	      sum+=arr[i];
	      if(hm.containsKey(sum)==true){
	          int pidx=hm.get(sum);
	          int len = i - pidx;
	          if(len > ans){
	              ans=len;
	          }
	      }
	      else{
	          hm.put(sum,i);
	      }
	      
	  }

		return ans;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(solution(arr));
	

}


}
