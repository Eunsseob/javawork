package _01_calendar;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class T06_LocalDateTime {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);

		LocalDateTime startday = LocalDateTime.of(2025, 8,5,15,0,0);
		LocalDateTime endday = LocalDateTime.of(2026, 8,5,15,0,0);
		System.out.println(startday);
		System.out.println(endday);
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd a hh:mm:ss");
		System.out.println("시작일 : " + dtf1.format(startday));
		
		System.out.println("종료일 : " + endday.format(dtf1)); //날짜와 포맷의 자리가 바뀌어도 된다.
		
		System.out.println("===============================");
		
		// isBefore(). isAfter(), isEqual()
		if(today.isBefore(endday)) {
			System.out.println("수업 준비 중입니다.");
		} else if(today.isAfter(endday)) {
			System.out.println("종료된 수업입니다.");
		} else if(today.isEqual(endday)) {
			System.out.println("수업 마지막 날입니다.");
		}
		System.out.println("===============================");
		Duration d = Duration.between(startday, endday);
		System.out.println(d.getSeconds());
		System.out.println("===============================");
		System.out.println("종료일 까지 " + today.until(endday, ChronoUnit.MONTHS));
		
		System.out.println("===============================");
		
		System.out.println(today.plusYears(3).format(dtf1));
		System.out.println(today.plusMonths(5).format(dtf1));
		System.out.println(today.plusDays(100).format(dtf1));
	}

}
