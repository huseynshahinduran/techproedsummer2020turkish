package day03operators;

import java.util.Scanner;

public class Wrapper03 {

	public static void main(String[] args) {
		
		//Kullanicidan ad ve soyadini alalim ekrana yazdiralim
	   //Kullanicidan adresini alalim ekrana yazdiralim(2. cadde Bakirkoy Istanbul Turkiye
	  //Kullanicidan yasini alalim ekrana yazdiralim
	 //Kullanicidan "Turkiye'de yasiyorum. Dogru/Yanlis" diye soralim cevabini ekrana yazdiralim
	//true veya false olarak	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Adinizi ve soyadinizi giriniz:");
		String adSoyad  = scan.nextLine();
		System.out.println(adSoyad);
		
		System.out.println("Adresinizi giriniz:");
		String adres = scan.nextLine();
		System.out.println(adres);
		
		System.out.println("Yasinizi giriniz:");
		byte yas = scan.nextByte();
		System.out.println(yas);
		
		System.out.println("Turkiye'de yasiyorum. True/False:");
		boolean yer = scan.nextBoolean();
		System.out.println(yer);
		

	}

}
