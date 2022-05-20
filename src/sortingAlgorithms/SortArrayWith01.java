package sortingAlgorithms;

public class SortArrayWith01 {

	public static void main(String[] args) {
		Scanner scn= = new Scanner(System.in);
	    int n = scn.nextInt();
	    int[] arr = new int[n];
	    for(int i = 0 ;i < n; i++){
	      arr[i] = scn.nextInt();
	    }
	    sort01(arr);
	    print(arr);
	  }

	}
	}

}
