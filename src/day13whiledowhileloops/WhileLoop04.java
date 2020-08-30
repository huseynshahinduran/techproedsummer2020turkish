package day13whiledowhileloops;

import java.util.Scanner;

public class WhileLoop04 {

	public static void main(String[] args) {

		//Kullanicidan girdigi sayi icin carpim tablosunu ekrana yazdirin.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Carpim tablosunu gormek icin bir sayi giriniz:");
		int num = scan.nextInt();
		
		System.out.println("For loop ile cosum:");
		for(int i=1; i<11; i++) {
			System.out.println(num+"x"+num+"="+(num*1));
		}
		
/////////////////////////////////////////////////////////////////		
		System.out.println();
		System.out.println("-----------------");
		System.out.println();
///////////////////////////////////////////////////////////////
		
		System.out.println("While loop ile cozum:");
		
		int num1 = 1;
		
		while(num1<11) {
			System.out.println(num1+"x"+num1+"="+(num1*1));
			num1++;
		}
		
		scan.close();
		
		
		
		
		
		
		
		
	}

}
