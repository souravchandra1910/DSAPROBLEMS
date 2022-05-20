package ds;

public class LengthofLastword {

	public static void main(String[] args) {
		
String str="Hello world";
int val=lengthOfLastWord(str);
System.out.println(val);
	}
	
	public static int lengthOfLastWord(String s) {
        if(s.length()==0)return 0;
         int j=s.length()-1;
        int count=0;
        while(j<0){
            if(s.charAt(j)!=' '){
            count++;
               j--; 
               return count; }                 
        
        
        else {
       return count;
        }
        } 
    }
    }


