package stack;
import java.util.*;
public class MiddleOfStack {

	public static void main(String[] args) {
		Stack<Integer>st=new Stack<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			st.push(sc.nextInt());
		}
		int val=func(st);
		System.out.println(val);

	}

	private static int func(Stack<Integer> st) {
		int x=st.size()/2;
		if((st.size() & 1)!=0)x++;
		while(st.size()!=x) {
			st.pop();
			
		}
		return st.pop();
	}

}
