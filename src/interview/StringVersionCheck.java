package interview;

import java.util.Scanner;

public class StringVersionCheck {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in) ;
		System.out.println("Enter 1st version");
		String str1 = sc.nextLine() ;
		System.out.println("Enter 2nd version");
		String str2 = sc.nextLine() ;
		
		System.out.println("Latest version is: "+getLatestVersion(str1, str2));
		
	}
	public static String getLatestVersion(String str1,String str2) {
		
		String v1=str1.replace(".", "") ;
		String v2=str2.replace(".", "") ;
		
		int version1 = Integer.parseInt(v1) ;
		int version2 = Integer.parseInt(v2) ;
		
		if( version1 > version2 ) {
			return str1 ;
		}
		else {
			return str2 ;
		}
			
	}

}
