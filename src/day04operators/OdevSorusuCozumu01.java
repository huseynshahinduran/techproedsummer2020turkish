package day04operators;

import java.util.Scanner;

public class OdevSorusuCozumu01 {

	public static void main(String[] args) {
		
		//Kullanicidan Integer aldiktan sonra String alamiyoruz.
		
		Scanner scan = new Scanner(System.in);
		
	//Java'da nexInt() kullandiktan sonra nexLine() kullanirsak kod calismaz.
   //nextInt() yerine nextLine() kullan sonra elde ettigin String'i
  //Integer.parseInt() kullanarak integer'a cevirir.	
		
		System.out.println("Yasinizi giriniz:");
		String yas = scan.nextLine();
		int yeniYas = Integer.parseInt(yas); //String'i tamsayiya cevirme metodu
		                                    //Integer.parseInt(yas) sadecerakam iceren Stringler icin calisir.  
		System.out.println(yeniYas+1);
		
		System.out.println("Adinizi ve soyadinizi giriniz:");
		String isim  = scan.nextLine();
		System.out.println(isim);
		
		
		
		
	}

}
