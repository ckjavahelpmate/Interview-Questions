package interview;
import java.util.*;

public class Space_Formating {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			System.out.println("================================");
			System.out.println("Enetr the word");
			String s1=sc.next();
			System.out.println("Enetr the number");
			int x=sc.nextInt();
			System.out.printf( "%-15s%03d", s1, x);
			System.out.println();
		}
		sc.close();
	}
}
