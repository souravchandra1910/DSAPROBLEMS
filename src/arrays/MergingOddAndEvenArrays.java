package arrays;

public class MergingOddAndEvenArrays {

	public static void main(String[] args) {
		int []a= {2,4,6};
		int []b= {1,3,5};
		int []c=new int[a.length+b.length];
		int i=0;
		int k=0;
		while(i<a.length) {
			c[k]=a[i];
			i++;
			k++;
			
		}
		int j=0;
		while(j<b.length) {
			c[k]=b[j];
			j++;
			k++;
		}
for(int val:c) {
	System.out.println(val);
}
		
		
		
		
	}

}
