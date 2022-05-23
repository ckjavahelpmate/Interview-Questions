package website;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class CalenderDate {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int day=s.nextInt();
		int month=s.nextInt();
		int year=s.nextInt();
		System.out.println(findDay(day,month,year));
		s.close();
	}
	public static String findDay(int day,int month,int year) {
		Calendar c=Calendar.getInstance();
		c.set(year, month, day);
		return LocalDate.of(year, month, day).getDayOfWeek().toString();
	}
}
