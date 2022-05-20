//1. You are given an array which represents
//heights of consecutive buildings.
//2. You can move from the roof of a building 
//to the roof of next adjacent building. 
////3. You need to find the maximum number of
//consecutive steps you can put forward such that 
//you gain an increase in altitude with each step.


package arrays;

import java.util.Scanner;

public class RoofTop {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	int []arr=new int [n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
		}
	int val=rt(arr);
	System.out.println(val);
	}
	public static int rt(int []arr) {
		int maxl=0;
		int temp=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1]>arr[i]) {
				temp++;
			}else {
				if(temp>maxl) {
					maxl=temp;
					
				}
				temp=0;
			}
		}
		if(temp>maxl) {
			maxl=temp;
			
		}
		
		return maxl;
	}

}
