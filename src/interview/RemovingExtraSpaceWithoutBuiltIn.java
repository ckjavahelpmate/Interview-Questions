package interview;

import java.util.Scanner;

public class RemovingExtraSpaceWithoutBuiltIn {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String s=sc.nextLine();
		String s1="";
		for (int i = 0; i < s.length(); i++) {
			char a=s.charAt(i);
			if(a==' ') {
				char b=s.charAt(i+1);
				if(a!=b)
					s1+=a;
			}
			else
				s1+=a;
		}
		System.out.println(s1);
		sc.close();
	}
}
