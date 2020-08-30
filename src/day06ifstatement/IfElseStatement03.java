package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement03 {

	public static void main(String[] args) {
		
		//Kullanicidan alacagi urun miktarini ve fiyatini alalim
	   //Eger kullanici 1000 den fazla urun alirsa %20 idirim yapin
	  //ve kellanicinin odeyecegi toplam fiyati ekrana yazdirin
	 //Eger kullanici 1000 den az veya 1000 urun alirsa idirim yapmayin
	//ve kellanicinin odeyecegi toplam fiyati ekrana yazdirin
   //Para konularinda "double" kullanin
  //Ornek: 60TL ye %20 indirim ==> 60*80/100
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen fiyatini yazin:");
		double fiyat = scan.nextDouble();
		
		System.out.println("Lutfen kactane urun alacaginiz yazin:");
		double miktar = scan.nextDouble();
		
		if(miktar>1000) {
			System.out.print("£");
			System.out.println((fiyat*80)/100);
		}else {
			System.out.print("£");
			System.out.println(fiyat*miktar);
		}
		
		
		
		
		

	}

}
