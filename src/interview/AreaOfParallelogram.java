package interview;
import java.util.Scanner;

public class AreaOfParallelogram {
	public static void main(String[] args) {
		if(b>0 & h>0)
			System.out.println(b*h);
		else
			System.out.println("java.lang.Exception: Breadth and height must be positive");
	}
	static{
		Scanner s=new Scanner(System.in);
		b=s.nextInt();
		h=s.nextInt();
		s.close();
	}
	static int b;
	static int h;

}
