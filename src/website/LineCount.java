package website;
import java.util.Scanner;

public class LineCount {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		for (int i = 1; s.hasNext(); i++) {
			System.out.println(i+" "+s.nextLine());
		}
		s.close();
	}
}
