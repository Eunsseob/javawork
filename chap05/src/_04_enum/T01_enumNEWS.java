package _04_enum;

import java.util.Calendar;

public class T01_enumNEWS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NEWS news1 = NEWS.EAST;
		System.out.println(news1);
		
		NEWS news2 = NEWS.valueOf("WEST");
		System.out.println(news2);
		
		NEWS news3 = NEWS.valueOf(NEWS.class, "SOUTH");
		System.out.println(news3);
		
		switch(news1) {
		case EAST : 
			System.out.println("동쪽입니다.");
			break;
		case SOUTH : 
			System.out.println("남쪽입니다.");
			break;
		case WEST : 
			System.out.println("서쪽입니다.");
			break;
		case NORTH : 
			System.out.println("북쪽입니다.");
		}
		
		Calendar cal = Calendar.getInstance();
		
		// 오늘의 요일 얻기
		int day = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("요일 : " + day);
		
		WEEK today = null;
		
		switch(day) {
		case 1 : 
			today = WEEK.SUNDAY;
			break;
		case 2 : 
			today = WEEK.MONDAY;
			break;
		case 3 : 
			today = WEEK.TUESDAY;
			break;
		case 4 : 
			today = WEEK.WEDNESDAY;
			break;
		case 5 : 
			today = WEEK.TURSDAY;
			break;
		case 6 : 
			today = WEEK.FRIDAY;
			break;
		case 7 : 
			today = WEEK.SATURDAY;
		}
	
		System.out.println(today);
		
		if(today == WEEK.SUNDAY)
			System.out.println("일요일에는 푹 쉽니다.");
		else
			System.out.println("자바 공부를 열심히 합니다.");
		
		// 오늘이 해당하는 달 얻기(0~11)
		int month = cal.get(Calendar.MONTH);
		System.out.println("현재 월 : " + month);
		
		MONTH todaymonth = null;
		
		switch(month) {
		case 0 : 
			todaymonth = MONTH.JANUARY;
			break;
		case 1 : 
			todaymonth = MONTH.FEBRUARY;
			break;
		case 2 : 
			todaymonth = MONTH.MARCH;
			break;
		case 3 : 
			todaymonth = MONTH.APRIL;
			break;
		case 4 : 
			todaymonth = MONTH.MAY;
			break;
		case 5 : 
			todaymonth = MONTH.JUNE;
			break;
		case 6 : 
			todaymonth = MONTH.JULY;
			
		case 7 : 
			todaymonth = MONTH.AUGUST;
			break;
		case 8 : 
			todaymonth = MONTH.SEPTEMBER;
		}
		System.out.println(todaymonth);
	}

}
