package dict;

import java.util.Scanner;


public class Dictionary {
static node head,last;
	
	public static void create(String data){
		if(head==null) {
			node newnode=new node();
			newnode.word=data;
			newnode.next=null;
			head=last=newnode;
		}
		else {
			node newnode=new node();
			newnode.word=data;
			newnode.next=null;
			last.next=newnode;
			last=newnode;
			
		}
		
	}
	public static void deleteAtPosition(int position) {
		if(head.next==null) {
			head=null;
			return;
		}
		node current = head;
		for(int i =0;i<position -1;i++) {
			current=current.next;
		}
		node dest=current;
		dest=current.next;
		dest=dest.next;
		current.next=dest;
		
	}
	public static void display() {
		node current=head;
		while(current!=null) {
			System.out.println(current.word);
			current=current.next;
		}
	}
	public static void search(String sv) {
		node current=head;
		int pos=0;
		boolean flag=false;
		while(current!=null) {
			if(current.word.equals(sv)) {
				flag=true;
				System.out.println("Element Found at position : "+pos);
				break;
			}
			current=current.next;
			pos++;
		}
		if(flag==false) {
			System.out.println("Element not found");
		}
	}
	public static void deleteSearch(String sv) {
		node current=head;
		int pos=0;
		boolean flag=false;
		while(current!=null) {
			if(current.word.equals(sv)) {
				flag=true;
				System.out.println("Element Deleted");
				node current1 = head;
				for(int i =0;i<pos -1;i++) {
					current=current.next;
				}
				node dest=current1;
				dest=current1.next;
				dest=dest.next;
				current1.next=dest;
				break;
			}
			current=current.next;
			pos++;
		}
		if(flag==false) {
			System.out.println("Element not found");
		}
	}
	
	
	
	public static void main(String[] args) {
		
		boolean rep = true;
		Scanner sc = new Scanner (System.in);
		System.out.println("1.Add a word\n2.Search for a word \n3.Display dictionary \n4.Delete a word  \n\n Any other key results to exit");
		while(rep) {
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				create(sc.next());break;
			case 2:
				search(sc.next());break;
			case 3:
				display();break;
			case 4:
				System.out.println("1.Search and delete a word\n2.Delete a word by position");
				switch(sc.nextInt()) {
				case 1:deleteSearch(sc.next());
					break;
				case 2 : 
					System.out.println("Enter position : ");
					deleteAtPosition(sc.nextInt());
					break;
				}
				break;
				
			default:
					rep =false;
			
			}
			
		}
		
		sc.close();
		
		
	}
	

}
