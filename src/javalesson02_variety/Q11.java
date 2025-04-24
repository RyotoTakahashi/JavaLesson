package javalesson02_variety;

import java.util.Calendar;
import java.util.Date;

public class Q11 {

	public static void main(String[] args) {
		Date date = new Date();
		Calendar calendartoday = Calendar.getInstance();
		calendartoday.setTime(date);

		Calendar calenderbirth = Calendar.getInstance();
		calenderbirth.set(Calendar.MONTH, Calendar.FEBRUARY);
		calenderbirth.set(Calendar.DAY_OF_MONTH, 6);
		calenderbirth.set(Calendar.YEAR, calendartoday.get(Calendar.YEAR));
		if (calenderbirth.before(calendartoday)) {
			calenderbirth.add(Calendar.YEAR, 1);
		}
		long diffMillis = calenderbirth.getTimeInMillis() - calendartoday.getTimeInMillis();
		long diffDays = diffMillis / (1000 * 60 * 60 * 24);
		System.out.println("あと" + diffDays + " 日");
	}
}