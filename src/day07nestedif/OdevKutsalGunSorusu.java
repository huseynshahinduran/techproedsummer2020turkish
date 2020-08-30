package day07nestedif;

import java.util.Scanner;

public class OdevKutsalGunSorusu {

	public static void main(String[] args) {
		
		//Kullanicidan bir gunalin eger gun"Cuma" ise ekrana "Muslumanlar icn kutsal gun" yazdirin
	   //"Cumartesi" ise ekrana "Yahudile icin kutsal gun" yazdirin.
	  //"Pazar" ise ekrana "Hiristiyanlar icin kutsal gun" yazdirin.
	 //Diger gunler icin ekrana "Kutsal gun degil" yazdirin.
		
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Gun giriniz:");
		String gun = scan.next();
		
	  if(gun.equalsIgnoreCase("Cuma")) {                                //equalsIgnoraCase() buyuk kucuk harf dikkate almadan esitlige bakar.
			
		  System.out.println("Muslumanlar icin kutsal gun");           //equalsIgnorCase() icin cuma = Cuma = CUMA = CuMa ayni kabul edilir.
		
		}else if(gun.equalsIgnoreCase("Cumartesi")) {
			
			System.out.println("Yahudiler icin kutsal gun");
			
		}else if(gun.equalsIgnoreCase("Pazar")) {
			
			System.out.println("Hiristiyanlarin kutsal gun");
			
		}else {
			
			System.out.println("Kutsal gun degil");
			
		}
		
		
		
		
		
		

	}

}
