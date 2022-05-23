package interview;

public class StringPrintingSeperatly {
	 public static void main(String[] args) {
	     //   Scanner scan = new Scanner(System.in);
	        String s = "          He is a very    very    good boy, isn't       he?";
	       // scan.close();

	        // Write your code here.
	        s = s.trim();
	        System.out.println(s);
	        if (s.length() == 0) {
	            System.out.println(0);
	        } else {
	            String[] strings = s.split("['!?,._@ ]+");
	            System.out.println(strings.length);
	            for (String str : strings)
	                System.out.print(str);
	        }
	    }
}
