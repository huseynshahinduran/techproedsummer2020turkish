package day16overloading;

import java.util.Scanner;

public class OdevSorusu02 {

	public static void main(String[] args) {

		/*
		 Kullanicidan isim ve soyisim alin.
		 Kullanicinin isim ve soyisim ilk harflerini buyuk
		 diger harflerini kucuk harf olarak ekrana yazdiran programi yaziniz.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ilk isminizi giriniz:");
		String ilkIsim = scan.next().toLowerCase();
		
		System.out.println("Soy isminizi giriniz: ");
		String soyIsim = scan.next().toLowerCase();
		
		isimYazma(ilkIsim, soyIsim);
		
		scan.close();
	}
public static void isimYazma(String ilkIsim, String soyIsim) {
	ilkIsim = ilkIsim.substring(0,1).toUpperCase()+ilkIsim.substring(1);
	soyIsim = soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1);
	
	System.out.println(ilkIsim+" "+soyIsim);
}
	
}
