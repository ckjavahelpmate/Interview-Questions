package interview;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enter Array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}

		Arrays.sort(arr);
		int count=0;
		for (int i = 0; i < arr.length-1; i++) {
				if(arr[i]==(arr[i+1])) {
					count++;break;
				}
		}
		if(count==0)
			System.out.println(1);
		else
			System.out.println(0);
		sc.close();
	}
}
