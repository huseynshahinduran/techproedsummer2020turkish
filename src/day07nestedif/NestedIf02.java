package day07nestedif;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
		
		//Kullanicidan password girmesini isteyin.
	   //Password 4 basmakli bir sayi ise cift olup olmadigini kontrol edin.
	  //Cift ise ekrana "Password tamam" yazdirin, tek sayi ise "Tekrar deneyin" yazdirin.
	 //Password 4 basmakli degil ise "Tekrar deneyin" yazdirin.
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Tamsayi olan bir password giriniz:");
		int password = scan.nextInt();
		
		if(password>999 && password<10000) {
		
			if(password%2==0) {
				
				System.out.println("Password tamam");
			
			}else if(password%2!=0) {
				
				System.out.println("Tekrar deneyin ilk");
			
			}else {
				System.out.println("Tekrar deneyin son");
			}
		}
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
