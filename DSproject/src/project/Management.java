package project;

import java.util.Scanner;
public class Management {
	static Patient p = new Patient("Soumya", "Prasad", "Jeypore", "NO", "25/05/2020", 2000031337);
	static Patient q = new Patient("Sampath", "Kumar","Jeypore", "NO", "28/02/2020", 2000031315);
	static Patient r = new Patient("Thattishetty", "Aakash", "Hyderabad", "NO", "26/09/2020", 2000031377);
	static Scanner sc = new Scanner(System.in);
	static final int size=10;
	static Patient[] PatientArr = new Patient[size];
	static int front=-1,rear=-1;
	public static void enqueue() {
		if(front==-1) {
			front++;
			PatientArr[front]=IN.input();
			rear++;
			return;
		}
		if(front==0&&rear==size-1 || front==size-1&&rear==0||front!=0&&front==rear-1) {
			System.out.println("Circular queue is full");
			return;
		}
		if(front!=0&&rear!=front-1 || front==0&&rear!=size-1) {
			rear++;
			PatientArr[rear]=IN.input();
			return;
		}
	}
	public static void Dequeue() {
		if(front==-1) {
			System.out.println("Queue is Empty");
			return;
		}
		if(front==0) {
			Patient ret=PatientArr[front];
			front++;
			
			System.out.println("Records of : Mr./Mrs. "+ret.FirstName+" has been removed");
		}
		if(front==rear) {
			Patient ret=PatientArr[front];
			front=rear=-1;
			System.out.println("Records of : Mr./Mrs. "+ret.FirstName+" has been removed");
		}
		else {
			if(front==size-1) {
				Patient ret=PatientArr[front];
				front=0;
				System.out.println("Records of : Mr./Mrs. "+ret.FirstName+" has been removed");
			}
		}
	}
	public static void Search(Long ID) {
		if(front==-1) {
			System.out.println("Queue is empty");
			return;
		}
		int i ;
		for( i =front;i<=rear;i++) {
			if(PatientArr[i].ID==ID)
			System.out.println(PatientArr[i]+" ");
		}
		if(i==rear) {
			System.out.println("No such ID found.Please try again");
		}
	}
	
	public static void display() {
		if(front==-1) {
			System.out.println("Queue is empty");
			return;
		}
		for(int i =front;i<=rear;i++) {
			System.out.println(PatientArr[i]+" ");
		}
	}
	public static void def(Patient A) {
		if(front==-1) {
			front++;
			PatientArr[front]=A;
			rear++;
			return;
		}
		if(front==0&&rear==size-1 || front==size-1&&rear==0||front!=0&&front==rear-1) {
			System.out.println("Circular queue is full");
			return;
		}
		if(front!=0&&rear!=front-1 || front==0&&rear!=size-1) {
			rear++;
			PatientArr[rear]=A;
			return;
		}
	}

	

	public static void main(String[] args) {
		
		
		def(p);
		def(q);
		def(r);
		
		
		System.out.println("-------------");
		System.out.println("Welcome to the Hospital");
		System.out.println("-------------");
		System.out.println("Select a Task to be performed from the menu");
		System.out.println("-------------");
		boolean rep=true;
		while(rep) {
			System.out.println("1. Add Data of a Patient \n2.Display Previous records \n3.Search For Patient's record \n4.Remove record of the first patient");
			switch(sc.nextInt()) {
			case 1 : enqueue();
				break;
			case 2 : display();
				break;
			case 3 : System.out.println("Enter Patient ID to be searched");
			Search(sc.nextLong());
				break;
			case 4 : Dequeue();
			break;
			default : 
				rep=false;
				break;
			
			}
		}
		

	}
	
}

