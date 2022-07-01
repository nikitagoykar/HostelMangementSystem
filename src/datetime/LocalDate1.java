package datetime;
import java.time.LocalDate;
import java.time.Month;
public class LocalDate1 {

	public static void main(String[] args) {
		//getting the current local objects
		LocalDate now= LocalDate.now();
		System.out.println("present Date "+ now);
		
		//get year
		int year=now.getYear();
		
		// get month
	 Month month=now.getMonth();
	 
	 //get date
	 int day=now.getDayOfMonth();

	 //print all values together
	 System.out.println("today date:"+year +"/"+ month + "/" +day);
	
	 LocalDate oldDate=LocalDate.of(2021, 12, 25);
	 System.out.println("old date "+oldDate);
	 
	}

}
