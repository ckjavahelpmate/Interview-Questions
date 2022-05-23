package interview;

import java.util.Scanner;

public class RemovingExtraSpaceInString {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the sentence");
	    String str =s.nextLine();
	    System.out.println(str.replaceAll("\\s+"," ").trim());
	    s.close();
	  }
}
