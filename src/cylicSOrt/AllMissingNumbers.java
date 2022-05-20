package cylicSOrt;

import java.util.*;

public class AllMissingNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	  List<Integer>al=findDisappearedNumbers(arr);
	for(int val:al) {
    System.out.println(val);
	}
	}
	 public static List<Integer> findDisappearedNumbers(int[] nums) {
	        int i = 0;
	        while (i < nums.length) {
	            int correct = nums[i] - 1;
	            if (nums[i] != nums[correct]) {
	                swap(nums, i , correct);
	            } else {
	                i++;
	            }
	        }

	        // just find missing numbers
	        List<Integer> ans = new ArrayList<>();
	        for (int index = 0; index < nums.length; index++) {
	            if (nums[index] != index+1) {
	                ans.add(index + 1);
	            }
	        }

	        return ans;
	    }

	     static void swap(int[] arr, int first, int second) {
	        int temp = arr[first];
	        arr[first] = arr[second];
	        arr[second] = temp;
	    }
	} 