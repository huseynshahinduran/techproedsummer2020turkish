package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator06 {

	public static void main(String[] args) {
		
		//Kullanicidan bir sayi aliniz.
	   //Sayi cift ise ona bolunup bolunmedigini kontrol ediniz.
	  //Sayi 10 a bolunuyorsa "Woow 10" yazdiriniz, 10 bolunmuyorsa "Yazik 10" yazdiriniz.
	 //Sayi tek ise 5 e bolunup bolunmedigini kontrol ediniz.
	//Sayi 5 e bolunuyorsa "Woow 5" yazdiriniz, 5 e bolunuyorsa "Yazik 5" yazdiriniz.
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Bir sayi giriniz:");
		int num = scan.nextInt();
		
		
		                //Condition     Soru Isareti                    True                       :                   False   
		String result = num % 2 == 0        ?           (num % 10 == 0 ? "Woow 10" : "Yazik 10")   :    (num % 5 == 0 ? "Woow 5" : "Yazik 5");
		System.out.println(result);
				
		scan.close();

	}

}
