package day34collections;

import java.util.Arrays;
import java.util.Scanner;

public class Review01 {

	public static void main(String[] args) {
		
		/*
		 * Kullanicidan adini ve soyadini aliniz:
		 *   1)Ad ve soyadini console'a yazdirin
		 *   2)Sadece adini console'a yazdirin 
		 *   3)Ad ve soyadinin ilk harflerini console'a yazdirin
		 *   4)Ad ve soyadini console’a tersten yazdirin
		 *   5)Ad ve soyadinda kullanilan tum karakterleri alfabetik sirada console'a yazdirin
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Lutfen adinizi giriniz: ");
		String name=scan.nextLine();
		System.out.print("Lutfen soyadiniz giriniz: ");
		String surname=scan.next();
		
		//1) Ad ve soyadi
		System.out.println(name+" "+surname);
		
		//2) )Sadece adi
		System.out.println(name);
		
		//3) Ad ve soyadinin ilk harfleri
		System.out.println("Adin ilk harfi: "+name.charAt(0));
		System.out.println("Soyadin ilk harfi: "+ surname.charAt(0));
		
		//4) Ad ve soyadin tersten yazilisi
		  //1. Yontem:
		 for(int i=name.length()-1; i>=0; i--){
		      System.out.print(name.charAt(i));
		    }
		 System.out.print(" ");
		 
		 for(int i=surname.length()-1; i>=0; i--){
		      System.out.print(surname.charAt(i));
		    }
		 
		 System.out.println();
		 
		//2. Yontem:
		 StringBuilder strB=new StringBuilder(name+" "+surname);
		 System.out.println(strB.reverse());
		 
		 //5) Ad ve soyadinda kullanilan tum karakterleri alfabetik sirada
//		 String arrName[] = name.split("");
//			String arrSurname[] = surname.split("");
//			Arrays.sort(arrName);
//			Arrays.sort(arrSurname);
//			System.out.print(Arrays.toString(arrName)+Arrays.toString(arrSurname));
//			System.out.println("");
		 
		 String fullName=name+surname;
		 String letterArr[]=fullName.split("");
		 Arrays.sort(letterArr);
		 System.out.println("Harfler alfabetik sirada: "+Arrays.toString(letterArr));

			scan.close();
	}

}
