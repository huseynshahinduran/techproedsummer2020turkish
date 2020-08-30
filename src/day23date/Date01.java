package day23date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date01 {

	public static void main(String[] args) {
		// Bugunun tarihini ekrana yazdiralim.	
		System.out.println(LocalDate.now());
		
	    //Bugunun zamanini saat, dakika, saniye ve salise olarak ekrana yazdiralim.
		System.out.println(LocalTime.now());
		
		//Bugunun tarihini ve zamanini ekrana yazdiralim
		System.out.println(LocalDateTime.now()); //2020-05-21T13:40:12.671 Buradaki "T" tarihi ile zamani ayirmak icin konuluyor.
		

	}

}
