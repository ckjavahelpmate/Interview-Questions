package interview;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram_String2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st String");
		String s1=sc.nextLine();
		System.out.println("Enter the 1st String");
		String s2=sc.nextLine();

		// converting string1 to char array
		char[] arr1=s1.toCharArray();
		//sorting array1
		Arrays.sort(arr1);
		s1=String.valueOf(arr1);

		// converting string2 to char array
		char[] arr2=s2.toCharArray();
		//sorting array2
		Arrays.sort(arr2);
		s2=String.valueOf(arr2);
	
		//checking the string is anagram or not
		if(s1.equals(s2))
			System.out.println(s1+" & "+s2+" is anagram");
		else
			System.out.println(s1+" & "+s2+" is not anagram");
sc.close();
	}
}
