package day23date;

import java.time.LocalTime;

public class Date03 {

	public static void main(String[] args) {
		// Time Manipulation (Zamani degistiriniz)
		
		LocalTime time = LocalTime.now();
		System.out.println(time);//13:59:18.551
		
		//plus ve minus methodlarini saat, dakika ve saniye icin kullaniniz
		
		System.out.println(time.plusHours(2));//15:59:18.551
		System.out.println(time.plusMinutes(15));//14:14:18.551
		System.out.println(time.plusSeconds(20));//13:59:38.551
		
		System.out.println("------------------------------");
		
		System.out.println(time.minusHours(3));//10:59:18.551
		System.out.println(time.minusMinutes(10));//13:49:18.551
		System.out.println(time.minusSeconds(25));//13:58:53.551
		
		LocalTime time1 = LocalTime.now();
		System.out.println(time1);

	}

}
