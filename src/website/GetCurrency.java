package website;
import java.text.NumberFormat;
import java.util.*;
import java.util.Scanner;

public class GetCurrency {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double payment=s.nextDouble();
		NumberFormat n=NumberFormat.getCurrencyInstance(Locale.US);
		String us = n.format(payment);
		NumberFormat n3=NumberFormat.getCurrencyInstance(new Locale("id" , "in"));
		String india = n3.format(payment);
		NumberFormat n1=NumberFormat.getCurrencyInstance(Locale.CHINA);
		String china = n1.format(payment);
		NumberFormat n2=NumberFormat.getCurrencyInstance(Locale.FRANCE);
		String france = n2.format(payment);

		System.out.println("US: "+us);
		System.out.println("India: "+india);
		System.out.println("China: "+china);
		System.out.println("France: "+france);
		s.close();
	}
}
