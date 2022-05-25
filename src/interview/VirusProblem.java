package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VirusProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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
		int max = 2 ;
		char ch1 = 'z'  ;
		for (int i = 0; i < str.length(); ) {
			char ch = str.charAt(0) ;
			int count=1 ;
			for (int j = 0; j < str.length()-1; j++) {
				if( ch == str.charAt(j+1)) 
				{
					count ++ ;
				}
			}
			if( count == max) {
				if(ch < ch1) {
					ch1 = ch ;
				}
			}
			else if(count > max ) {
				ch1 = ch ;
				max = count ;
			}
			System.out.println(ch);
			System.out.println(count);
			str = str.replaceAll(ch+"", "") ;
		}		
			
		return ch1 ;
	}

}
