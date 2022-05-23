package interview;

import java.util.*;

public class ArrayList1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList<String> ls=new ArrayList<>();
		System.out.println("Enter the Array size");
		int size=s.nextInt();
		s.nextLine();
		System.out.println("Enter the String values");
		for (int i = 1; i <= size; i++) {
			ls.add(s.nextLine());
		}
		System.out.println(ls);
		s.close();
	}
}
