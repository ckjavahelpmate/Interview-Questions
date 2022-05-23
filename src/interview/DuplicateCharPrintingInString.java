package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DuplicateCharPrintingInString {

	public static void main(String[] args) {
		Scanner sc = new 
				Scanner(System.in);
		int repeat = sc.nextInt() ;sc.nextLine();
		List<Character> chars = new ArrayList() ;
		while( repeat > 0 ) {
			String str = sc.nextLine() ;
			
			chars.add(getRepeatChar(str) );
			repeat-- ;
		}
		for(char ch: chars) {
			System.out.println(ch);
		}
	}
	public static char getRepeatChar(String str) {
		
		List<Character> chars = new ArrayList() ;
		for (int i = 0; i < str.length(); ) {
			char ch = str.charAt(0) ;
			int count=1 ;
			for (int j = 0; j < str.length()-1; j++) {
				if( ch == str.charAt(j+1)) 
				{
					count ++ ;
				}
			}
			if( count > 1) {
				chars.add(ch) ;
			}
			str = str.replaceAll(ch+"", "") ;
		}		
		Collections.sort(chars);
		
		return chars.get(0) ;
	}

}
