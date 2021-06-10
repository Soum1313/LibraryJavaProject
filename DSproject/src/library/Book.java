package library;

import java.util.LinkedList;
import java.util.Scanner;

public class Book {
	String BookName,author;
	int ID;
	static Scanner sc = new Scanner(System.in);
	public Book(String bookName, String author, int iD) {
		BookName = bookName;
		this.author = author;
		ID = iD;
	}
	
	static LinkedList<Book> barr = new LinkedList<>();
	static void def() {
		Book b0 = new Book("Abc","Sindhu",149);
		Book b1 = new Book("Abc","Sindhu",149);
		Book b2 = new Book("Abc","Sindhu",149);
		barr.add(b0);
		barr.add(b1);
		barr.add(b2);
		
	}
	static void add() {
		
		System.out.println("Enter the name of the book , author of the book,ID of the book");
		Book temp = new Book(sc.next(),sc.next(),sc.nextInt());
		barr.add(temp);
	}
	public static boolean search(int VID) {
		int i=0;
		 for ( i = 0; i < barr.size(); i++) { 
			 if(barr.get(i).ID==VID) {
				 return true;
				 
			 }
			   
	        }
		 if(i==barr.size()-1)
			 return false;
		 else 
			 return true;
	}
	public static void delete() {
		System.out.println("Enter the ID of the book to be deleted");
		int vid = sc.nextInt();
		int i=0;
		 for ( i = 0; i < barr.size(); i++) { 
			 if(barr.get(i).ID==vid) {
				barr.remove(barr.get(i));
				return;
				 
			 }
			   
	        }
		 if(i==barr.size()-1)
			 System.out.println("No such book found.Please try again");
		
	}
	
	
	

}
