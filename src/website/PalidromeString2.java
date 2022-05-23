package website;
import java.util.Scanner;

public class PalidromeString2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=new StringBuilder(s).reverse().toString();
		System.out.println(s.equals(s1)?"Palidrome":"Not Palindrome");
		sc.close();
	}
}
