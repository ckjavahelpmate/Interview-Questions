package website;
import java.util.*;

public class A1b2C3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int a=sc.nextInt();
		int k=0;
		char[] c=new char[s.length()];	
		for (int i = 0; i <s.length(); i+=2) {
			int n=s.charAt(i+1);
			char ch=s.charAt(i);
			for (int j = 0; j < n-'0'; j++) {
				if(k<s.length())
				c[k++]=ch;
			}
		}
		if(a>c.length)
			System.out.println(-1);
		else 
			System.out.println(c[a-1]);
		sc.close();
	}
}
