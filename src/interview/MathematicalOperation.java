package interview;

import java.util.*;

public class MathematicalOperation {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter initial value");
		int n=sc.nextInt();
		System.out.println("Enter operation sequence");
		String s= sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
			n=operation(s.charAt(i),n);
		}
		System.out.println("The Result is: "+n);
	}
	public static int operation(char ch,int n) {
		if(ch=='a')
			return a(n);
		else if(ch=='s')
			return s(n);
		else if(ch=='m')
			return m(n);
		else if(ch=='d')
			return d(n);
		else
			return 0;

	}
	public static int a(int a) {
		System.out.println("enter value of a");
		int b=sc.nextInt();
		return a+b;
	}
	public static int m(int a) {
		System.out.println("enter value of m");
		int b=sc.nextInt();
		return a*b;
	}
	public static int s(int a) {
		System.out.println("enter value of s");
		int b=sc.nextInt();
		return a-b;
	}
	public static int d(int a) {
		System.out.println("enter value of d");
		int b=sc.nextInt();
		return a/b;
	}
}
