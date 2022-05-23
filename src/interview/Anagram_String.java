  package interview;
import java.util.Scanner;

public class Anagram_String {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st String");
		String s1=sc.nextLine();
		System.out.println("Enter the 1st String");
		String s2=sc.nextLine();

		// converting string1 to char array
		char[] arr1=s1.toCharArray();
		//sorting array1
		s1=arraySorting(arr1,s1);

		// converting string2 to char array
		char[] arr2=s2.toCharArray();
		//sorting array2
		s2=arraySorting(arr2,s2);

		//checking the string is anagram or not
		if(anagram(s1,s2))
			System.out.println(s1+" & "+s2+" is anagram");
		else
			System.out.println(s1+" & "+s2+" is not anagram");
		sc.close();
	}
	public static String arraySorting(char[] arr,String s) {
		// sorting the array	
		for(int i=0; i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				char temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		// converting the char array to string
		s=String.valueOf(arr);	
		return s;
	}
	public static boolean anagram(String s1,String s2) {
		System.out.println(s1.equals(s2));
		return s1.equals(s2);
	}
}
