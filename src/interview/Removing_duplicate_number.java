package interview;

import java.util.Arrays;

public class Removing_duplicate_number {
	public static void main(String[] args) {
		int[] arr= {3,2,1,2,2,5,4};
		int[] arr1=new int[arr.length];
		for (int i = 0,k=0; i < arr.length-1; i++) {
			System.out.println();
			System.out.println(arr[i]);
			int count=0;
			for ( int j = i+1; j < arr.length; j++) {
				System.out.print(arr[j]);
				if(arr[i]==arr[j]) {
					count++;break;
				}
			}
			System.out.println("c:"+count);

			if(count==0) {
				System.out.println("i:"+i);
				System.out.println("k:"+k);
				arr1[k++]=arr[i];
			}     
		}
		System.out.println(Arrays.toString(arr1));
	}
}
