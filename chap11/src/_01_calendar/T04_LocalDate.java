package _01_calendar;

import java.time.LocalDate;
import java.util.Locale;

public class T04_LocalDate {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		// getter 메소드 사용
		System.out.println(ld.getYear()+ "년");
		
		System.out.println(ld.getMonth()+ "월");
		
		System.out.println(ld.getMonthValue()+ "월");
		
		System.out.println(ld.getDayOfMonth()+ "일");
		
		System.out.println("365일 중 " + ld.getDayOfYear()+ "일");
		
		System.out.println(ld.getDayOfWeek()+ ": 요일");
		
		System.out.println(ld.getDayOfWeek().getValue());
		
		System.out.println("이 달의 총 " + ld.lengthOfMonth()+ "일까지 있다");
		
		System.out.println("올 해는 총 " + ld.getDayOfYear()+ "일까지 있다");
		
		System.out.println("올 해는 윤년인가? " + ld.isLeapYear());
		
		System.out.println("================================");
		
		LocalDate day = LocalDate.of(2025, 4, 10);
		System.out.println(day);

	}

}
