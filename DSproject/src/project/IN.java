package project;
import java.util.*;
public class IN {
	static Scanner sc= new Scanner(System.in);
	public static Patient input() {
		System.out.println("Enter First name and Last name :");
		String f=sc.next(), l=sc.next();
		System.out.println("Enter the Address of "+f);
		String a=sc.next();
		System.out.println("Mention any previous or on going diseases");
		String d = sc.next();
		System.out.println("Enter the date "+ f+" was admitted into the hospital");
		String date=sc.next();
		System.out.println("Enter Patient ID of "+f);
		long ID = sc.nextLong();
		Patient p = new Patient(f, l,a,d,date,ID);
		return p;
	}

}
