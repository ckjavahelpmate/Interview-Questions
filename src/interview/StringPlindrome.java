package interview;

public class StringPlindrome {

	public static void main(String[] args) {
		String str="Noel - sees Leon";
		String str1="";
		String str2="";
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z')
			{
				str1=str1+ch;
				str2=ch+str2;
			}
		}
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		if(str1.equals(str2)){
			System.out.println(true);
		}
		else {
			System.out.println(false);;
		}	
	}
}
