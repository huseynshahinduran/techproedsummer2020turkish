package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterview01 {

	public static void main(String[] args) {

		//Kullanicidan bir String alin ve bu String'i ekrana tersten yazdirin.
		//For Loop kullanin.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir cumle veya kelime giriniz:");
		
		String str1 = scan.nextLine();
		
		for(int i=str1.length()-1; i>=0; i--) {
			System.out.print(str1.charAt(i));//naC ilA
		}

		scan.close();
		
	}

}
