package day06ifstatement;

import java.util.Scanner;

public class IfStatement05 {

	public static void main(String[] args) {
		
		//Kullanicidan bir dikdortgen en ve boyunu alin.
	   //En ve boy esit ise ekrana "Bu bir karedir" yazdirin.
	  //En ve boy farkli ise ekrana "Bu bur dikdortgendir" yazdirin.	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("En:");
		double en = scan.nextDouble();
		
		System.out.println("----------------");
		
		System.out.println("Boy:");
		double boy = scan.nextDouble();
		
		System.out.println("------------------");

//////////////////////////////////////////////////////////////////////////////////////		
		
	//	if(en==boy) {
	//		System.out.println("Bu bir karedir");
	//	}
		
	//	if(en!=boy) {
	//		System.out.println("Bu bir dikdortgen");
	//	}

//////////////////////////////////////////////////////////////////////////////////////		
		
		
		//else ==> diger ihtimallerin tamami
	   //en ile boy ya esittir ya da degildir
		
		if(en==boy) {
			System.out.println("bu bir karedeir");
		}else {
			System.out.println("bu bir dikdortgendir");
		}
		
		
		
		
		
		
		
		
		
	}

}
