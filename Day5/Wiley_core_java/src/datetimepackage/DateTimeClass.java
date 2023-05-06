package datetimepackage;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeClass {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalTime time = LocalTime.now();
		System.out.println(time);
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String modDateTime = dateTime.format(formatter);
		System.out.println(modDateTime);
	}
}
