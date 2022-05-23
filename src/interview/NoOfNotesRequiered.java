package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Note{
	int value ;
	int count ;
	public Note(int value, int count) {
		super();
		this.value = value;
		this.count = count;
	}
	@Override
	public String toString() {
		return "[" + value + "==>" + count + "]";
	}	
}
public class NoOfNotesRequiered {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in) ;
		System.out.println("Enter the amount");
		
		System.out.println("Notes required: "+(getNoOfNOtes(sc.nextInt())));
	}
	public static List getNoOfNOtes(int amt) {
		
		List notes = new ArrayList();
		
		while(amt > 0) {
			if(amt>=2000) {
				int noNote = amt / 2000 ;
				 amt = amt % 2000 ;
				 notes.add(new Note(2000, noNote)) ;
			}
			else if(amt >= 500) {
				int noNote = amt / 500 ;
				amt = amt % 500 ;
				notes.add(new Note(500, noNote)) ;
			}
			else if(amt >= 200) {
				int noNote = amt / 200 ;
				amt = amt % 200 ;
				notes.add(new Note(200, noNote)) ;
			}
			else if(amt >= 100) {
				int noNote = amt / 100 ;
				amt = amt % 100 ;
				notes.add(new Note(100, noNote)) ;
			}
			else if(amt >= 50) {
				int noNote = amt / 50 ;
				amt = amt % 50 ;
				notes.add(new Note(50, noNote)) ;
			}
			else if(amt >= 20) {
				int noNote = amt / 20 ;
				amt = amt % 20 ;
				notes.add(new Note(20, noNote)) ;
			}
			else if(amt >= 10) {
				int noNote = amt / 10 ;
				amt = amt % 10 ;
				notes.add(new Note(10, noNote)) ;
			}
			else  {
				notes.add(new Note(1, amt)) ;
				amt = 0 ;
			}
			
			
		}
		
		return notes ;
		
	}

}
