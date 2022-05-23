
package interview;

import java.util.Arrays;
import java.util.Scanner;

public class Remove_Duplicate_Strings {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word/number");
		String s=sc.nextLine();
		String alphabet="";
		String number="";
		String spl="";
		for (int i = 0; i < s.length(); i++) {
			int count=0;
			for ( int j = i+1; j < s.length(); j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;break;
				}
			}
			if(count==0) {
				char ch=s.charAt(i);
				if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z')
					alphabet+=ch;
				else if(ch>='0'&&ch<='9')
					number+=ch;
				else
					spl+=ch;
			}
		}
		System.out.println(sort(alphabet.toCharArray()));
		System.out.println(sort(number.toCharArray()));
		System.out.println(sort(spl.toCharArray()));
		sc.close();
	}
	public static char[] sort(char[] s1) {
		Arrays.sort(s1);
		return s1;
	}
}
