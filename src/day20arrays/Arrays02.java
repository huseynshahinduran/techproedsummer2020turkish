package day20arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		/*
		 * Bir integerin array’in elemanlarini kucukten buyuge diziniz 
		 * ve ekrana iki durumu da yazdiriniz
		 */
		
		int arr[]= {2,11,0,23,7};
		
		System.out.println("Siralamadan once: " + Arrays.toString(arr));
		
		//Arrays.sort() methoduna parametre olarak arry'in ismi yazilirsa 
	   //o array'in elemanlari kucukten buyuge siralanmis olur.
		
		Arrays.parallelSort(arr);
		System.out.println("Siralamadan sonra: " + Arrays.toString(arr));
		
		System.out.println("------------------------------------");
		
		//Soru: char'lardan olusan bir String olusturunuz ve "ascending order" yapiniz. 
	   //char'lar siralanirken Java ASCII kodlari kullanir.
	  //Buyuk harflerin ASCII kodlari harflerden azdir; bu yuzden siralmada
	 //buyuk harfler one gecer.
		char arr1[]= {'a','d','c','b'};
		System.out.println("Siralamadan once: " + Arrays.toString(arr1));
		
		Arrays.sort(arr1);
		System.out.println("Siralamadan sonr: " + Arrays.toString(arr1));
		
		System.out.println("------------------------------------");

		//Soru: String'lerden olusan bir array olusturun ve ascending orde yapin.
		
		String arr2[]= {"Huseyn","Mehmet Ali","Zehranur","Zarife Nur", "Abdullah Nicat"};
		System.out.println("Siralamadan once: " + Arrays.toString(arr2));
		
		Arrays.sort(arr2);
		System.out.println("Siralamadan sonra: " + Arrays.toString(arr2));
		
		System.out.println("-------------------------------------------------------------------------------");
		
		//Soru: boolean bir annay olusturun ascending order yapin.
	   //*boolean'lar icin sort methodu kullanilmaz.
		
 //		boolean arr3[]= {true,false,false};
//		System.out.println("Siralamadan once: " + Arrays.toString(arr3));
		
//		Arrays.sort.sort(arr3);
		
		
	
		
		
		
		

	}

}
