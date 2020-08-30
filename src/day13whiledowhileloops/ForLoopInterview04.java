package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterview04 {

	public static void main(String[] args) {

		//Kullanicidan bir sayi alin
				//Bu sayinin tersini ekrana yazdirin.
				
				Scanner scan = new Scanner(System.in);
				
				System.out.println("Bir sayi giriniz:");
				String num1 = scan.next();
		
		String ters ="";
		
		for(int i=num1.length()-1; i>=0; i--) {
			ters = ters+num1.charAt(i)+""; //char'i String'e cevirmek icin sonuna +"" ekleyebilirsiniz
		}
			System.out.println(ters);
			
			int tersInt= Integer.valueOf(ters);
		tersInt = tersInt+2;
		
		System.out.println(tersInt); //123 ==>321 ==> 321+2=323
		
scan.close();
	}

}
