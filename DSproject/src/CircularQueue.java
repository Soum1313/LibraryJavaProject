
public class CircularQueue {
	static final int size=3;
	static int cq[]=new int[size];
	static int front=-1, rear=-1;
	public static void enqueue(int data) {
		if(front==-1) {
			front++;
			cq[front]=data;
			rear++;
			return;
		}
		if(front==0&&rear==size-1 || front==size-1&&rear==0||front!=0&&front==rear-1) {
			System.out.println("Circular queue is full");
			return;
		}
		if(front!=0&&rear!=front-1 || front==0&&rear!=size-1) {
			rear++;
			cq[rear]=data;
			return;
		}
	}
	public static void dequeue() {
		if(front==-1) {
			System.out.println("Queue is Empty");
			return;
		}
		if(front==0) {
			int ret=cq[front];
			front++;
			
			System.out.println("Value : "+ret+" has been removed");
		}
		if(front==rear) {
			int ret=cq[front];
			front=rear=-1;
			System.out.println("Value : "+ret+" has been removed");
		}
		else {
			if(front==size-1) {
				int ret=cq[front];
				front=0;
				System.out.println("Value : "+ret+" has been removed");
			}
		}
		
	}
	public static void display() {
		if(front==-1) {
			System.out.println("Queue is empty");
			return;
		}
		for(int i =front;i<=rear;i++) {
			System.out.print(cq[i]+" ");
		}
	}

	public static void main(String[] args) {
    

	}

}
