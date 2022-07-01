package datetime;
import java.time.LocalTime;
public class LocalTime1 {

	public static void main(String[] args) {
		//get the current local time
		LocalTime now=LocalTime.now();
		System.out.println("present time:" + now);
		
		//get hour
		int hour=now.getHour();
		
		//get min
		int minute=now.getMinute();
		
		//get sec
		int second=now.getSecond();
		
		//get nano
		int nanosecond=now.getNano();
		
		//all values together
		System.out.println("time is now"+ hour +":"+minute+":"+second);
		
		//old time
		LocalTime oldTime=LocalTime.of(15, 25, 48);
		System.out.println("old time :"+oldTime);
		}

}
