package day23date;

import java.time.LocalDate;

public class Date02 {

	public static void main(String[] args) {
		// Date Manipulation (Date uzerinde degisiklik yapmka)
		
		LocalDate date = LocalDate.now();
		System.out.println(date); //2020-05-21
		System.out.println(date.plusDays(3));//2020-05-24
		System.out.println(date.plusDays(13));//2020-06-03
		System.out.println(date.plusDays(-1));//2020-05-20
		System.out.println(date.plusWeeks(2));//2020-06-04
		System.out.println(date.plusMonths(2));//2020-07-21
		System.out.println(date.plusYears(2)); //2022-05-21
		
		System.out.println("--------------------------------");
		
		System.out.println(date.minusDays(3));//2020-05-18
		System.out.println(date.minusWeeks(1));//2020-05-14
		System.out.println(date.minusMonths(2));//2020-03-21
		System.out.println(date.minusYears(4)); //2016-05-21

	}

}
