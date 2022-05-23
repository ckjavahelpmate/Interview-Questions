package interview;

import java.util.Arrays;
import java.util.Scanner;

public class MissingElementInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter Array size");
		int[] arr = new int[sc.nextInt()] ;
		
		System.out.println("Enter the Array Elements");
		for (int i = 0; i < arr.length; i++) {

		arr[i] = sc.nextInt() ;
		
		}
		
		Arrays.sort(arr) ;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println();

		int missingElement = getMissingElement(arr) ;
		
		System.out.println( missingElement );

	}
	public static int getMissingElement(int[] a) {
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]>0) {
				if(a[i+1] - a[i] != 1 ) {
					return (a[i]+1) ;
				}
			}
				
		}
		return 0 ;
	}

}
