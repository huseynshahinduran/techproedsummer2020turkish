package day07nestedif;

import java.util.Scanner;

public class OdevCharSorusu {

	public static void main(String[] args) {
		
		//Kullanicidan bir character alin eger character bir harf ise ekrana "Harf" yzdirin.
	   //Diger durumlarda ekrana "Harf degil" yazdirin.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir character girin:");
		char harf = scan.next().charAt(0); //Kullanicidan char almak icin next().charAt(0) kullanilir.
		
		if((harf<=122 && harf>=65) || (harf<=90 && harf>=65)) {
			System.out.println("Bu bur harftir");
		}else {
			System.out.println("Bu bur harf degildir");
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
