package _01_calendar;

import java.util.Calendar;

public class T01_calendar_get {

	public static void main(String[] args) {
		java.util.Calendar today = java.util.Calendar.getInstance();

		System.out.println("현재 년도 : " + today.get(Calendar.YEAR));
		
		System.out.println("현재 월 : " + today.get(Calendar.MONTH)+1);
		System.out.println("이달의 몇번째 주 : " + today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("올 해의 몇번 째 주 : " + today.get(Calendar.WEEK_OF_YEAR));
		
		System.out.println("몇 일 : " + today.get(Calendar.DATE));
		
		// 출력 오전이면 시간 AM 09시 오후면 시간 PM 09시
		
	
		int ampm = today.get(Calendar.AM_PM);
		System.out.println(ampm);
		
		if(ampm == 0)
			System.out.println("오전입니다 시간 : AM"+Calendar.HOUR);
		else
			System.out.println("오후입니다 시간 : PM"+Calendar.HOUR);
	}

}
