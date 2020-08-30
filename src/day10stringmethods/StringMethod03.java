package day10stringmethods;

import java.util.Scanner;

public class StringMethod03 {

	public static void main(String[] args) {
		
		//charAt() methodu belli indexteki charcteri return eder.
		
		String str1 = "cimbombom";
		//str1 in 4. indexindeki characteri bulan kodu yaziniz.
		System.out.println(str1.charAt(4)); //indexi 4 olan character 'o' harfidir, bu yuzden ekrana 'o' yazdirir.
		
		System.out.println(str1.charAt(0)); //indexi 0 ilk harf demektir bu yuzden 'c' return eder.
		
		//System.out.println(str1.charAt(10)); ==> Olmayan bir index ile islem yapmaya calisirsaniz console
		                                    //"Exception" alirsiniz. Bu da buyuk bir hata yaptiniz demektir.
		
		
		//length() methodu Stringin icinde kac character oldugunu verir.
		System.out.println(str1.length()); //Ekrana 9 yazdirir. Index saymaya 0'dan baslar, fakat
		                                  // length() sayamaya 1 den baslar.
		
		//Soru: Son index 9 olan bir Stringin length i kactir?
		      //Cevap: 9+1=10 olur.
		            //length = son index + 1
		
		
		
		
		
		//Kullanicidan ismini isteyin.
		//Isminin son harfini ekrana yazdirin.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Isminizi giriniz:");
		
		String str2 = scan.next();
		
		int length = str2.length();
		
		System.out.println(str2.charAt(length-1));
	
scan.close();


	}

}
