/*class Test {
    static int arr[] = new int[] { 1, 5, 7, -1, 5 };
 
    // Returns number of pairs in arr[0..n-1] with sum equal
    // to 'sum'
    static int getPairsCount(int n, int sum)
    {
        HashMap<Integer, Integer> hm = new HashMap<>();
 
        // Store counts of all elements in map hm
        for (int i = 0; i < n; i++) {
 
            // initializing value to 0, if key not found
            if (!hm.containsKey(arr[i]))
                hm.put(arr[i], 0);
 
            hm.put(arr[i], hm.get(arr[i]) + 1);
        }
        int twice_count = 0;
 
        // iterate through each element and increment the
        // count (Notice that every pair is counted twice)
        for (int i = 0; i < n; i++) {
            if (hm.get(sum - arr[i]) != null)
                twice_count += hm.get(sum - arr[i]);
 
            // if (arr[i], arr[i]) pair satisfies the
            // condition, then we need to ensure that the
            // count is decreased by one such that the
            // (arr[i], arr[i]) pair is not considered
            if (sum - arr[i] == arr[i])
                twice_count--;
        }
 
        // return the half of twice_count
        return twice_count / 2;
    }
 
    // Driver method to test the above function
    public static void main(String[] args)
    {
 
        int sum = 6;
        System.out.println(
            "Count of pairs is "
            + getPairsCount(arr.length, sum));
    }
}*/



package arrays;

import java.util.*;

public class AllPairsOfArrayEqualToGivenSum {
public static int count(int []arr,int n,int k) {
	HashMap<Integer,Integer>hm=new HashMap<>();
	
	for(int i=0;i<arr.length;i++) {
//		if (!hm.containsKey(arr[i])) {
//            hm.put(arr[i], 0);

        hm.put(arr[i], hm.getOrDefault(arr[i],0) + 1);
    }
		
	
	int c=0;
	for(int i=0;i<arr.length;i++) {
		int diff=k-arr[i];
		if(hm.get(diff)!=null) {
			c+=hm.get(arr[i]);
			}
		
		if(diff==arr[i]) {
		c--;
	}
		}
return c;
	
}
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int target=sc.nextInt();
int []arr=new int [n];
for(int i=0;i<arr.length;i++) {
	arr[i]=sc.nextInt();
}

int val=count(arr,n,target);
System.out.println(val);
	}

}
