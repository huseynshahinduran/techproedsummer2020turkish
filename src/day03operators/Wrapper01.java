package day03operators;

import java.util.Scanner;

public class Wrapper01 {

	public static void main(String[] args) {
		
		//Kullanicidan ad ve soyadini alip ekrana yazdiran bir program yaziniz.
		//(String kullaniniz)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen adinizi ve soyadinizi giriniz");
		
		String isim = scan.next(); //String'leri kullanicidan almak icin ya next() veya nextLine() kullaniriz
                                       //next() tek kelimelik String'leri icin kullanilir.
		                              //Space gorunce String'i almayi birakir.
		                             //nextLine() girilen tum String'i almak icin kullanilir.
		
		System.out.println(isim);
		
		

	}

}
