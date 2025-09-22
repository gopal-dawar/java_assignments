package assignments_2;

public class DateTimePrint_5 {
	public static void main(String[] args) {

		TimeDate t = new TimeDate();
		
		String date = t.printDate("15/01/2004");
		System.out.println("Date : " + date);
		
		String time = t.printTime("12:00");
		System.out.println("Time : " + time);
		
	}
}

class TimeDate {
	public String printTime(String time) {
		return time;
	}

	public String printDate(String date) {
		return date;
	}
}
