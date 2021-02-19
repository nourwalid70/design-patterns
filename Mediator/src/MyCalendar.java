import java.util.Calendar;

public class MyCalendar {
	
 	public int GetTime() {
 		Calendar c = Calendar.getInstance();
 		int DayOfWeek = c.get(Calendar.DAY_OF_WEEK);
 		return DayOfWeek; 
 	}
 	
}
