package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement02 {
	
	public static void main(String[] args) {
		
		//Kullanicidan sinav notunu tmasayi olarak girmesini isteyein
	   //Negatif girerse ekrana "Yanlis deger girdiniz" yazdirin
		//0 den buyuk ve esit  50 den kucuk girerse ekrana "kaldiniz"yazdirin
		//50 den buyuk ve esit  80 den kucuk ise ekrana "gectiniz" yazdirin
		//80 den buyuk ve esit 100 den kucuk esit ise ekrana "tebrikler" yazdirin
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen sinav notunuzu giriniz:");
		int sinav = scan.nextInt();
		
		if(sinav<0) {
			System.out.println("Negatif deger girdiniz");
		}else if(sinav<50) {
			System.out.println("Kaldin");
		}else if(sinav<80) {
			System.out.println("Gectiniz");
		}else if(sinav<=100) {
			System.out.println("Tebrikler");
		}else {
			System.out.println("100 den buyuk deger giremezsiniz");
		}
		
		
		
		
	}
	
	

}
