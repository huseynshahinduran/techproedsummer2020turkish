package day10stringmethods;

public class StringMethod02 {

	public static void main(String[] args) {
		
		//lastIndexOf() method aradiginiz character'in String icindeki son gorunumunun indexini return eder.
		
		//lastIndexOf() method 1. versiyon:
		
		String str1 = "Sivrihisar";
		System.out.println(str1.lastIndexOf('i')); /* Ekrana 6 yazdirir. 
		                                              Cunku 'i' characterinin String icinde
		                                              son gorunumun indexi 6 dir.
		                                              */
		
		System.out.println(str1.lastIndexOf('r'));//Ekrana 9 yazdirir.
		
		
		//lastIndexOf() method 2. versiyon:
		
		System.out.println(str1.lastIndexOf('i', 7)); /* Ilk 7 indexin icinde 'i' harfinin son gorunumunun indexini 
		                                               return eder.
		                                               */
		
		//lastIndexOf() method 3. versiyon
		
		String str2 = "Rivrihisari";
		System.out.println(str2.lastIndexOf("ri")); /* Stringin icindeki 'ri' nin son gorunumunu bulacak.
		                                               son 'ri' deki 'r' harfinin indexi olan 9 u return edecek.
		                                            */
		
		
		

	}

}
