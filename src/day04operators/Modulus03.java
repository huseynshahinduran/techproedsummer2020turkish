package day04operators;

import java.util.Scanner;

public class Modulus03 {

	public static void main(String[] args) {
		
		//Kullanicidan 3 basamakli bir tamsayi alin bu sayinin rakamlarini toplamini bulun
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("3 basamakli bir tamsayi giriniz:");
		
		int s = scan.nextInt();
		
		int sonRakam = s % 10;
		
		int v = s / 10; // Orta rakami bulmak icin bu islem yapilir.
		int ortaRakam = v % 10;
		
		int ilkRakam = s / 100; // 3 basamakli sayilarin ilk rakamlarini bulmak icin sayi 100 e bolunur.
	                           // 4 basamakli sayilarin ilk rakamlarini bulmak icin sayi 1000 e bolunur.
		
		System.out.println(sonRakam + ortaRakam + ilkRakam);
		
		
		
		

	}

}
