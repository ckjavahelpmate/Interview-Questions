package website;
import java.util.Scanner;

public class SubString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int strat=sc.nextInt();
		int end=sc.nextInt();
		System.out.println(s.substring(strat, end));
		sc.close();
	}
}
