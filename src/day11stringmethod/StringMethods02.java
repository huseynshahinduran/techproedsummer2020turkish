package day11stringmethod;

public class StringMethods02 {

	public static void main(String[] args) {
		
		//substring() methodu bir String'in belli bir bolumunu kesip almak icin kullanilir.
		
		String str1 = "Java calisana kolaydir";
		
		//substring() 1. versiyon
		System.out.println(str1.substring(5)); //calisana kolaydir. 5inexi gosterir.
		
		System.out.println(str1.substring(8)); //isana kolaydir. index 8 dahildir (inclusive) 
		
		System.out.println(str1.substring(22)); //Ekranda hic bir sey goremezsiniz.
		
		//System.out.println(str1.substring(23)); //index 23 yok ama ben olamayan bir yerden kesmek istiyorum.
		                                       //Bu bir hatali istekdir. Java Exception verir, yani beni uyarir
		                                      //hata yapiyorsun der.
		
		System.out.println(str1.substring(0)); // str1.substring(0) = str1 oldugundan substring(0) hic kullanilmaz.
	
		System.out.println("-----------------------------------");
		
		//substring() 2. versiyon
		
		System.out.println(str1.substring(5, 13)); /* Ilk index dahil ikinci index dahil degildir. 
		                                              Ilk index i ekranda gorursunuz ama ikinci indexi ekranda goremezsiniz. 
		                                              [5,13] ==> calisana
		                                           */
		
		System.out.println(str1.substring(6, 12)); //alisan
		
		System.out.println(str1.substring(6, 6)); //Ekranda hic bir sey goremezsiniz. susbstring(6,6) kullanilmaz.
		
		//System.out.println(str1.substring(7, 6)); //Exception verir. Bu hatayi yapmayin, her zaman ilk index kucuk veya esit olmalidir.
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
