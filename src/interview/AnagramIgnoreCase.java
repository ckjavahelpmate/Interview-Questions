package interview;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramIgnoreCase {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		if(sortedString(s.nextLine().toUpperCase()).equals(sortedString(s.nextLine().toUpperCase())))
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");
		s.close();
	}
	public static String sortedString(String s)
	{
		char[] ch=s.toCharArray();
		Arrays.sort(ch);
		return String.valueOf(ch);
	}
}
