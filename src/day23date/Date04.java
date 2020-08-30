package day23date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Date04 {

	public static void main(String[] args) {
		// Date formatini degistirmek
		
		LocalDate date = LocalDate.now();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy"); 
		System.out.println(dtf.format(date)); // 21/May/2020
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		System.out.println(dtf1.format(date)); // 21/05/2020

		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy/M/dd"); 
		System.out.println(dtf2.format(date.plusMonths(7))); // 2020/5/21
		
		//Time formatini degistirmek.
		
		LocalTime time = LocalTime.now();
		
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("hh:mm"); //HH kullanirsaniz 24 luk dilimi kullanir
		System.out.println(dtf3.format(time)); //02:10
		
		//Baska ulkenin local zamanini almak.
		
		System.out.println(LocalTime.now(ZoneId.of("America/Sao_Paulo")));
		
		
		

	}

}
