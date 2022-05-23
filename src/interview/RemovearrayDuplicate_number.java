package interview;
import java.util.*;


public class RemovearrayDuplicate_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enter Array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		TreeSet<Integer> s=new TreeSet<>();
		for (int i = 0; i < arr.length; i++) {
			s.add(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(s);
		
		sc.close();
		
	}
}
