package LearningProgramming.random;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarDemo {
	public static void main(String[] ar)
	{
		Calendar calendar = new GregorianCalendar();
	    //calendar.setTime(new Date());
		//calendar= new GregorianCalendar(2015,7,5);
		calendar= new GregorianCalendar(2017,7,14);
	    System.out.println("ERA: " + calendar.get(Calendar.ERA));
	    System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
	    System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
	    System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
	    System.out.println("WEEK_OF_MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));
	    System.out.println("DATE: " + calendar.get(Calendar.DATE));
	    System.out.println("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
	    System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
	    System.out.println("DAY_OF_WEEK_IN_MONTH: " + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
	    System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));
	    System.out.println("MILLISECOND: " + calendar.get(Calendar.MILLISECOND));
	    System.out.println("ZONE_OFFSET: "+ (calendar.get(Calendar.ZONE_OFFSET)/(60*60*1000)));
	    System.out.println("DST_OFFSET: "+ (calendar.get(Calendar.DST_OFFSET)/(60*60*1000)));
	    DayOfWeek dayOfWeek = DayOfWeek.from(LocalDate.now());
	    System.out.println(""+DayOfWeek.from(LocalDate.now()));
	    String[] strDays = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday",
	            "Friday", "Saturday" };
	    System.out.println("Current day is : " + strDays[calendar.get(Calendar.DAY_OF_WEEK) - 1]);
	    System.out.println(calendar.getFirstDayOfWeek()+"");
	}
	
	
}
