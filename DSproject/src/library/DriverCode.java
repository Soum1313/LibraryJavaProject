package library;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class DriverCode {
	static Scanner sc = new Scanner(System.in);
	public static void borrow() throws IOException {
		String date="10-06-2020";
		
		
		System.out.println("Enter book ID");
		int VID = sc.nextInt();
		if(Book.search(VID)) {
			System.out.println("Book found \nEnter your Library membership number : ");
			Long mem=sc.nextLong();
			RecordHandler.writedown(VID,mem,date);
		}
		else {
			System.out.println("Not Found");
		}
		
	}
	private static void ret() throws FileNotFoundException, ParseException {
		String date="10-06-2020";
		System.out.println("Enter the book number you are returning and your membership number");
		String VID = sc.next();
		String mem=sc.next();
		
		RecordHandler.retcheck(VID,mem,date);
		
	}
	
	private static void FineCheck() throws FileNotFoundException, ParseException {
		String date="10-06-2020";
		System.out.println("Enter the Library member ID : ");
		RecordHandler.FineChe(sc.next(), date);
		
	}

	public static void main(String[] args) throws ParseException, IOException {
		boolean rep=true;
		
		System.out.println("1.Borrow a book \n2.Return a book \n3.Add a book \n4.Delete a book \n5.Check fine \n6.Generate fine record");
		while(rep) {
			System.out.println("Enter your choice : ");
			int ch=sc.nextInt();
			switch(ch) {
			case 1: borrow();
				break;
			
			case 2:ret();
				break;
			case 3: Book.add();
				break;
			case 4: 
				Book.delete();
				break;
			case 5:
				FineCheck();
				break;
			case 6:
				System.out.println("Members who need to be notified");
				System.out.println(RecordHandler.FineRecord("10-06-2020"));;
				break;
				
				default: rep=false;
			}
		}
	}
	
	

	

}
