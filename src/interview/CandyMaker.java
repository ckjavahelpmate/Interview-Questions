package interview;

import java.util.Scanner;

public class CandyMaker {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of machine");
		int m=sc.nextInt();
		System.out.println("Enter the Number of workers");
		int w=sc.nextInt();
		System.out.println("Enter the Cost to puchase");
		int p=sc.nextInt();
		System.out.println("Total Candy to be produced");
		int n=sc.nextInt();
		long pass=0;
		for (int prod = 0; prod <n ; ) {
			prod=prod+m*w;
			if(prod>=p && m<=w)
			{
				m=m+prod/p;
				
			}
			else if(prod>=p && m>=w)
			{
				w=w+prod/p;
				
			}
			pass++;
		}
		System.out.println("Number of pass required: "+pass);
	}
}
