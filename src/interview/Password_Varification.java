package interview;
import java.util.*;
public class Password_Varification {
	static int upper;
	static int lower;
	static int digit;
	static int spl;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Password: ");
		String pwd=s.nextLine();
		if(pwd.length()>=8){
			char sl=pwd.charAt(0);
			if(sl>='A' && sl<='Z' || sl>='a' && sl<='z'){
				if(pwd.contains(" ")==false) {
				  for (int i = 0; i < pwd.length(); i++) {
					   char ch=pwd.charAt(i);
					   if(ch>='A' && ch<='Z')
						   upper++;	
					   else if(ch>='a' && ch<='z')
						   lower++;	
					   else if(ch>='0' && ch<='9')
						   digit++;
					   else
						   spl++;  
				   }
				   if(upper>0 && digit>0 && spl>0)
						System.out.println("Password is validated successfully");
				   else
						System.out.println("password must contain minimum 1 Uppercase, 1 Digit and 1 spl character");
				}
				else
					System.out.println("Password should not contain space");
			}
			else
				System.out.println("Password must start with Alphabets only");
		}
		else
			System.out.println("Passsword length must contain 8 character");
		
		s.close();
		}
	}
