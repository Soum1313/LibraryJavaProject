package project;

public class Patient {
	String FirstName,LastName,Address,Disease,Date;
	long ID;
	public Patient(String firstName, String lastName, String address, String disease, String date, long iD) {
		
		FirstName = firstName;
		LastName = lastName;
		Address = address;
		Disease = disease;
		Date = date;
		ID = iD;
	}
	public  String toString() {
		return "Name of the Patient : "+ FirstName + " "+ LastName 
				+"\nPatient ID : "+ ID +" Date Admitted : "+ Date+ 
				"\nAddress : "+Address+" Diseases : "+Disease+"";
	}

}

