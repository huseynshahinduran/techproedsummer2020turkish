package day04operators;

import java.util.Scanner;

public class Modulus02 {

	public static void main(String[] args) {
		
		//Kullanicinin girdigi 4 basmakli sayinin ilk ve son rakaminin toplamini veren program yaziniz.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("4 basmakli bir tamsayi giriniz:");
		
		int s= scan.nextInt(); //Bir tamsayinin 1 ler basamagini bulmak icin sayiyi 10 a boluruz.
		int sonRakam = s%10;
		int ilkRakam = s/1000; 
		
		System.out.println("Sonuc:");
		System.out.println(sonRakam + ilkRakam); //1+4=5
		
		
		
		
	}

}
