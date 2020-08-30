package day03operators;

import java.util.Scanner;

public class Wrapper02 {

	public static void main(String[] args) {
		
		//Kullanicidan ilk ilsmini alin ekrana yazdirin.
		//kullanicidan soy ismini alin ekrana ilk isminin altina yazdirin.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen ilk isminizi giriniz");
		
		String ilkIsim =scan.nextLine();
		
		System.out.println("Lutfen soy isminizi giriniz");
		
		String soyIsim = scan.nextLine();
		
		System.out.println(ilkIsim);
		System.out.println(soyIsim);

	}

}
