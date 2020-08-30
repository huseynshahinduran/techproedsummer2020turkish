package day09switchoperator;

import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {
		
		//Kullanici ay ismini girsin 
		//Program kacinic ay oldugunu ekrana yazsin
		//Buyuk harf kucuk harf hepsi icin calisisin
		//Yanlis ay ismi girerse "Gecerli ay ismi giriniz"
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ay ismini giiniz:");
		String aylar =scan.next();
		aylar= aylar.toLowerCase(); //toLowerCase() ==> Bu method String'leri kucuk harfe cevirmek icin kullanilir.
		                           //toUpperCase() ==> Bu method String'leri buyuk harfe cevirmek icin kullanilir.
		
		switch(aylar) {
		case "ocak":
			System.out.println("1. ay");
			break;
		case "subat":
			System.out.println("2. ay");
			break;
		case "mart":
			System.out.println("3. ay");
			break;
		case "nisan":
			System.out.println("4. ay");
			break;
		case "mayis":
			System.out.println("5. ay");
			break;
		case "haziran":
			System.out.println("6. ay");
			break;
		case "temmuz":
			System.out.println("7. ay");
			break;
		case "agustos":
			System.out.println("8. ay");
			break;
		case "eylul":
			System.out.println("9. ay");
			break;
		case "ekim":
			System.out.println("10. ay");
			break;
		case "kasim":
			System.out.println("11. ay");
			break;
		case "aralik":
			System.out.println("12. ay");
			break;
		default:
			System.out.println("Gecerli ay ismi giriniz");
		}
		
		scan.close();
	}

}
