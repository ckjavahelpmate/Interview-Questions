package interview;

import java.util.Scanner;

public class FindNumberOfSwapOfArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int[] a=new int[sc.nextInt()];
		System.out.println("Enter the Array elements");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		int count=0;
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1-i; j++) {
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					count++;
				}
			}
		}
		System.out.println("Array is sorted in "+count+" swaps.");
		System.out.println("First Element: "+a[0]);
		System.out.println("Last Element: "+a[a.length-1]);
		sc.close();
	}
}
