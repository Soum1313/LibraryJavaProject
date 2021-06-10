import java.util.Scanner;
public class Management {
	static Scanner sc = new Scanner(System.in);
	static final int size=10;
	static Patient[] PatientArr = new Patient[10];
	static int front=-1,rear=-1;
	public static void enqueue() {
		if(front==-1) {
			front++;
		//	PatientArr[front]=Patient(sc.next(),sc.next());
			rear++;
			return;
		}
		if(front==0&&rear==size-1 || front==size-1&&rear==0||front!=0&&front==rear-1) {
			System.out.println("Circular queue is full");
			return;
		}
		if(front!=0&&rear!=front-1 || front==0&&rear!=size-1) {
			rear++;
		//	PatientArr[rear]=data;
			return;
		}
	}

	

	public static void main(String[] args) {
		//System.out.println("Welcome to the Hospital");
		

	}
	
}
