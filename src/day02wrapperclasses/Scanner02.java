package day02wrapperclasses;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
		/*
		  Kullanici karenin bir kenarin uzunlugunu girsin
		  Karenin cevresini ve alanini ekrana yazdiralim
		  Karenin cevresi a+a+a+a, alani a*a dir.
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen karenin bir kenar uzunlugunu giriniz.");
		
		int kenarUzunlugu = scan.nextInt();
		
		System.out.println(kenarUzunlugu + kenarUzunlugu + kenarUzunlugu + kenarUzunlugu); //40, cevresi
		System.out.println(kenarUzunlugu * kenarUzunlugu); //100, alani
		
		

	}

}
