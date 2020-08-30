package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterview03 {

	public static void main(String[] args) {

		//Kullanicidan bir sayi alin
		//Bu sayinin tersini ekrana yazdirin.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir sayi giriniz:");
		String num1 = scan.next();
		
		int length =num1.length()-1;
		
		while(length>=0) {
			System.out.print(num1.charAt(length));
			length--;
		}
		
	scan.close();	
	}

}
