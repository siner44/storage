package exam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	public static void main(String[] args) throws ParseException {
		String date1 = "11:30";
		String date2 = "11:10";

		Date format1 = new SimpleDateFormat("mm:ss").parse(date1);
		Date format2 = new SimpleDateFormat("mm:ss").parse(date2);

		long time = format1.getTime() - format2.getTime();

		System.out.println(time + "ms");
		System.out.println(time / 1000 + "초");

	}
}
