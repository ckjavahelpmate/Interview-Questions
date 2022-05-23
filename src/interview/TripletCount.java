package interview;
import java.util.Scanner;

public class TripletCount {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter Array size");
		int[] arr=new int[s.nextInt()];
		System.out.println("enter array element");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("enter lower limit");
		int lowerlimit=s.nextInt();
		System.out.println("enter upper limit");
		int upperlimit=s.nextInt();
		System.out.println(tripletCheck(arr,lowerlimit,upperlimit));
		
		s.close();
	}
	public static int tripletCheck(int[] arr,int lowerlimit,int upperlimit) {
		int count=0;
		for (int i = 0; i < arr.length-2; i++) {
			for (int j = i+1; j < arr.length; j++) {
				for (int k = j+1; k < arr.length; k++) {
					int sum=arr[i]+arr[j]+arr[k];
					if(sum>=lowerlimit && sum<=upperlimit)count++;
				}
			}
		}
		return count;
		
	}
}
