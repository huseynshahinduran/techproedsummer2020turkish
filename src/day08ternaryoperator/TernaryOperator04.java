package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator04 {

	public static void main(String[] args) {
		
		          //Ternary Operator (If Else If)
		
		//Kullanicidan bir sayi aliniz
		//Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
		//10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
		//Sayi 0 dan kucuk ise ekran "Negatif Sayi" yazdiriniz.
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir sayi giriniz:");
		double num = scan.nextDouble();
		
		String result = num>=0 ? num<10 ? "Rakam" : "Pozitif Sayi" : "Negatif Sayi";
		System.out.println(num+" "+result+"'dir");
		
		
		scan.close();
		

	}

}
