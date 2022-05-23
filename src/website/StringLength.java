package website;
import java.util.Scanner;

public class StringLength {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		String b=s.nextLine();

		System.out.println(a.length()+b.length());
		System.out.println((a.compareTo(b)>0?"Yes":"No"));
		System.out.println(a.substring(0, 1).toUpperCase()+a.substring(1)+" "+b.substring(0, 1).toUpperCase()+b.substring(1));
		s.close();
	}
}
