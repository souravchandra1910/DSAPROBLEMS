package string;

public class practice {

	public static void main(String[] args) {
	String s="Sourav";
//	s+=" Kaavya";
//	System.out.println(s);
//	System.out.println(s.replace("Sourav", "Kaavya"));
	int idx=s.indexOf('v');
	System.out.println(idx);
	int idx1=s.indexOf('s');
	System.out.println(idx1);
	int idx2=s.lastIndexOf('v');
	System.out.println(idx2);
	
	System.out.println(s.equals("Sourav"));
	System.out.println(s.equals("sourav"));
	System.out.println(s.equalsIgnoreCase("sourav"));
	}

}
