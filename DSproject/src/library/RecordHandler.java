package library;
import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.text.ParseException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class RecordHandler {
	static File BookRecord = new File("C:/Users/soumy/eclipse-workspace/DSproject/src/library/book track");
	
	
	public static void retcheck(String vid,String mem,String date) throws FileNotFoundException, ParseException {
		
		Scanner sc = new Scanner(BookRecord);
		while(sc.hasNext()) {
			String s = sc.nextLine();
			StringTokenizer st = new StringTokenizer(s," ");
			if(st.nextElement().equals(mem)){
				
				st.nextToken();
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			
				    LocalDate date1 = LocalDate.parse(st.nextToken(), dtf);
				    LocalDate date2 = LocalDate.parse(date, dtf);
				    	
				long days = ChronoUnit.DAYS.between(date1, date2);
				
				if(days>0) {
					System.out.println("Fine of rupees "+ 0.15*days+ " to be levied");
				}
				else {
					System.out.println("No Fine levied");
				}
				
			}
			else {
				
				continue;
			}
			
			
		}
		sc.close();
	}
	public static void writedown(int vid, long mem, String date) throws IOException {

         String appendText = mem +" "+ vid + " "+date + "\n";
         appendUsingFileWriter(BookRecord, appendText);
	
	}
public static void FineChe(String mem,String date) throws FileNotFoundException, ParseException {
		
		Scanner sc = new Scanner(BookRecord);
		while(sc.hasNext()) {
			String s = sc.nextLine();
			StringTokenizer st = new StringTokenizer(s," ");
			if(st.nextElement().equals(mem)){
				
				st.nextToken();
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			
				    LocalDate date1 = LocalDate.parse(st.nextToken(), dtf);
				    LocalDate date2 = LocalDate.parse(date, dtf);
				    	
				long days = ChronoUnit.DAYS.between(date1, date2);
				
				if(days>0) {
					System.out.println("Fine of rupees "+ 0.15*days+ " to be levied");
				}
				else {
					System.out.println("No Fine levied");
				}
				
			}
			else {
				
				continue;
			}
			
			
		}
		sc.close();
	}
public static String FineRecord(String date) throws FileNotFoundException {
	String ret= "\n";
	File FineRecord = new File("C:\\Users\\soumy\\eclipse-workspace\\DSproject\\src\\library\\FineRecord");
	PrintStream printer = new PrintStream(FineRecord);
	Scanner sc = new Scanner(BookRecord);
	while(sc.hasNext()) {
		String s = sc.nextLine();
		StringTokenizer st = new StringTokenizer(s," ");
		
			int vid = Integer.parseInt(st.nextToken());
			st.nextToken();
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
			    LocalDate date1 = LocalDate.parse(st.nextToken(), dtf);
			    LocalDate date2 = LocalDate.parse(date, dtf);
			    	
			long days = ChronoUnit.DAYS.between(date1, date2);
			
			if(days>0) {
				String appenText="Member with ID number : "+vid + " owes "+0.15*days  + " rupees.\n";
				appendUsingFileWriter(FineRecord, appenText);
				
			}
			else {
				String appendtext="Member with ID number : "+vid + " owes "+ 0  + " rupees\n";
				appendUsingFileWriter(FineRecord, appendtext);
				
			}
			if(days>7) {
				ret=ret+vid + "\n";
			}
			
		
	}
	printer.close();
	sc.close();
	if(ret.equals("\\n"))
		return "None";
	return ret;
	
}
private static void appendUsingFileWriter(File file, String text) {
	
	FileWriter fr = null;
	try {
		// Below constructor argument decides whether to append or override
		fr = new FileWriter(file, true);
		fr.write(text);

	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		try {
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
}
