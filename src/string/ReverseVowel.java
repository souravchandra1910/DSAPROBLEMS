package string;

import java.util.Scanner;

public class ReverseVowel {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String str=sc.nextLine();
		String res=swapVowel(str);
		
			System.out.println(res);
		}
	
	public static boolean isVowel(char [] arr,int idx) {
		char ch=arr[idx];
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'
			||	ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'	) {
			return true;
			
		}
		return false;
	}
	public static void swap(char []arr,int i,int j) {
		char temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static String swapVowel(String S) {
		char []arr=S.toCharArray();
int i=0;
int j=arr.length-1;
while(i<j) {
while(i<j && isVowel(arr,i)==false) {
	i++;
}
while(i<j && isVowel(arr,j)==false) {
	j--;
}
swap(arr,i,j);
i++;
j--;
}
String str="";
for(Character val:arr) {
	str+=val;
}
return str;
	}
}
