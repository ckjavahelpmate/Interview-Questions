package website;
import java.util.Scanner;

public class StringOrder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int k=sc.nextInt();
		String minsub=s.substring(0, k);
		String maxsub=s.substring(0, k);
		for(int i=1 ; i<s.length()-k+1 ; i++) {
			String sub=s.substring(i, i+k);
			if(sub.compareTo(minsub)<0)
				minsub=sub;
			if(sub.compareTo(maxsub)>0)
				maxsub=sub;
		}
		System.out.println(minsub+"\n"+maxsub);	
		sc.close();
	}
}
