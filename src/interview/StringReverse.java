package interview;

import java.util.Scanner;

public class StringReverse {

//	"10 20 50" ===> "50 20 10"    "1 2 3" ===> "3 2 1".
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		String[] strings = s.split(" ");
		String str="";
        for (String str1 : strings)
        {
        	str=str1+" "+str;
        }
		System.out.println(str);
		
		sc.close();
	}

}
