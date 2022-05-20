
public class HeapImplementation {

	public static void main(String[] args) {
		int[]a= {50,30,40,10,5,20,30,60,0};
		
		int b=45;
		insert(a,a.length-1,b);
		for(int i:a) {
			System.out.println(i);
		}
		

	}
	public static void insert(int[]arr,int n,int b) {
		
		arr[n]=b;
		int i=n;
		while(i>1) {
			int parent =i/2;
			if(arr[parent]<arr[i]) {
			swap(arr,parent,i);
			i=parent;
			
		}
		
			else { 
				return;
			}
		}
	}
	public static void swap(int[]arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
