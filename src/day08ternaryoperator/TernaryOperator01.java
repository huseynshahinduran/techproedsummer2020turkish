package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator01 {

	public static void main(String[] args) {
		
		//Kullanicidan bir sayi aliniz.
		//Sayi pozitif veya 0ise  ekrana "Pozitif veya 0" yaziniz.
		//Sayi negatif ise ekrana "Negatif" yaziniz.
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Bir sayi giriniz:");
		int num1 = scan.nextInt();
		
		
		// if(num1>=0) {
			// System.out.println("Pozitif veya 0");
		// }else {
			// System.out.println("Negatif");
		// }
		
		//Ternary Operator
		//Condition Soru Isareti   Condition Dogru Ise   Iki nokta ust uste   Condirion Yanlis ise                                  
		String sonuc= (num1>=0) ?                  "Pozitif veya 0"             :                "Negatife";
		System.out.println(sonuc);
		
		
		
		
		scan.close();
		
	}

}
