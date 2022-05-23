package interview;
import java.util.Scanner;

public class threenumberQuery {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter no. of lines");
		int lines=s.nextInt();
		for (int i = 0; i < lines; i++) {
			System.out.println("enter a,b & n values");
			int a=s.nextInt();
			int b=s.nextInt();
			int n=s.nextInt();
			for (int j = 0; j < n; j++) {

				a+= b * (int) Math.pow(2, j);
				System.out.println(a+" ");
			}
			System.out.println();
		}
		s.close();
	}
}
