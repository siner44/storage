package chapter07;

import java.util.Calendar;

public class Calender01 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println(today);
	
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1;
		int date = today.get(Calendar.DATE);
		
		int day = today.get(Calendar.DAY_OF_WEEK);
		String week = "";
		switch(day) {
			case 1 : week = "일요일";break;
			case 2 : week = "월요일";break;
			case 3 : week = "화요일";break;
			case 4 : week = "수요일";break;
			case 5 : week = "목요일";break;
			case 6 : week = "금요일";break;
			case 7 : week = "토요일";break;
		}
		
		System.out.println(year + "년 " + month + "월 " + date + "일 " + week);
		
		int ampm = today.get(Calendar.AM_PM);
		String str = ampm == Calendar.AM ? "오전" : "오후";
		int hour = today.get(Calendar.HOUR);
		int min = today.get(Calendar.MINUTE);
		int second = today.get(Calendar.SECOND);
		
		System.out.println(str + " " + hour + "시 " + min + "분 " + second + "초 ");
		
	}
}
