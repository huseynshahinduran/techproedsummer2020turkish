package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement03 {

	public static void main(String[] args) {
		
		//Kullanicidan 6 basamakli bir tamsayi isteyin. 0 ile de basliyabilir
	   //Kazanma ihtimali %30, amorti ihtimali %30, kaypet me ihtimali %50 olan bir
	  //jackpot oyunu icin program yaziniz.
     //000000-000001-000002-....-999998-999999 ==> 1000000		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("6 basamakli bir sayini girinz:");
		int num = scan.nextInt();
		
		
		if(num<200000) {
			System.out.println("Kazandiniz");
		}else if(num<500000) {
			System.out.println("Tekrar deneyin");
		}else {
			System.out.println("Kaybettiniz");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
