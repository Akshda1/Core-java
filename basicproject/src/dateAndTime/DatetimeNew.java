package dateAndTime;

import java.time.LocalDate;

public class DatetimeNew {
	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println(date);
		System.out.println(date.getDayOfWeek());
	}

}
