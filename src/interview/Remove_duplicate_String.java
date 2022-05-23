package interview;

import java.util.*;


public class Remove_duplicate_String {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the word");
		String s=sc.nextLine();
		
	//Converting String to TreeSet to remove duplicate and sort
		TreeSet<Character> st=new TreeSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			st.add(s.charAt(i));
		}
		
	//converting TreeSet to object char[]
		Object[] ch=st.toArray();
		
	//converting Object char[] to String
		String s1="";
		for(Object i:ch) {
			s1=s1+i;
		}
		System.out.println(s1);
		sc.close();
	}
}
