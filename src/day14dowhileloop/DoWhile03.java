package day14dowhileloop;

import java.util.Scanner;

public class DoWhile03 {
	
	int num;

	public static void main(String[] args) {

		//Kullanicidan sayi alin.
		//sayi 10 dan kucuk ise ekrana "Kazandiniz" yazdirin.
		//Sayi 10 veya 10 dan buyuk ise ekrana "Tekrar deneyin" yazdirin.
		
		Scanner scan = new Scanner(System.in);
			

		int num = 0;
		
		do {
		   System.out.println("Bir sayi giriniz:");
		   num = scan.nextInt();
		}while(num>=10);
		
		System.out.println("Kazandiniz");
		
		scan.close();
		
	}

}
