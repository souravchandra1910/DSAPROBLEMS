package string;

public class Time {

	public static void main(String[] args) {
		int a=1000000;
		long s=System.currentTimeMillis();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<a;i++) {
			sb.append(i);
		}
		long e=System.currentTimeMillis();
	
		System.out.println(e-s);
	}

}
