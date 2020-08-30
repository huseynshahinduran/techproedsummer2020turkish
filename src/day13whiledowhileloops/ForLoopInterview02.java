package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterview02 {

	public static void main(String[] args) {

		//Kullanicidan bir String alin ve bu String'i ekrana tersten yazdirin.
		//While Loop kullanin
				Scanner scan = new Scanner(System.in);
				
				System.out.println("Bir cumle veya kelime giriniz:");
				
				String str1 = scan.nextLine();
		
		int length = str1.length()-1;
		
		while(length>=0) {
			System.out.println(str1.charAt(length));
			length--;
		}
		
		scan.close();
		
	}

}
