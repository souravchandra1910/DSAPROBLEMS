////1. Your friend is typing her name into a faulty keyboard. 
////2. Sometimes, when typing a character 'c', 
//the key might get long pressed, and the character
//will be typed 1 or more times.
////3. You examine the typed characters of the keyboard. 
//Return 'True' if it is possible that it was 
//your friends name, with some characters 
//(possibly none) being long pressed.
////

/*  example 
 * name ="Kaavya" typed = "Kaaaaaaaaavvyaaaaaaaaaaaaa"
 *    
 *    
 *    
 *    */

package arraysandstringlevel2;
import java.util.*;
public class FaultyKeyBoard {
public static boolean isPossible (String name ,String typed) {
	if(name.length() > typed.length()) {
		return false;
	}
	int i=0;
	int j=0;
	while(i<name.length() && j<typed.length()) {
		if(name.charAt(i)==typed.charAt(j)) {
		i++;
		j++;
		
	}else if(i>0 && name.charAt(i-1)==typed.charAt(j)) {
		j++;// string index out of bound exception will be given without i>0
	}else {// agar koi character match nahi hua to false return kare
		return false;
	}
	
	}	
	while(j<typed.length()) {
		if(name.charAt(i-1)!=typed.charAt(j)) {
			return false;
		}
		j++;
		}
	return i<name.length()?false:true;
	}

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        
        String name = sc.next();
        String typed = sc.next();

        boolean res = isPossible(name, typed);

        System.out.println(res);

	}

}
