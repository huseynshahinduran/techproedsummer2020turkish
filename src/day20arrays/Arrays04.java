package day20arrays;

import java.util.Arrays;

public class Arrays04 {

	public static void main(String[] args) {

		/*
		 * Bir array'in icinde belli bir elemanin var olup olmadigini kontrol ediniz.
		 * binarySearch() methodu bu is icin kullanilir.
		 * Not: binarySearch() methodunu kullanmadan once sort() methodunu
		 * kullanmak zorundasiniz. Aksi takdirde; binarySearch() methodu manali bir sonuc vermez.
		*/
		
		int arr[]= {1,12,12,4,3};
		
		//Yukariida verilen array'de 3 elemani olarakvar mi?
		
//		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, 3));//1
      
		//Ayni elemandan birden fazla oldugunda ilkinin indexini verir.
		
		System.out.println(Arrays.binarySearch(arr, 12)); //3
		
		//binarySearch() methodu olmayan elemanlar icin negatif sayilar return eder.
		//negatif olmasi o elemanin arrayde olmadigi anlamina gelir.
		//Sayi kismi ise  o eleman var olasaydi kacinci eleman olurdu anlamindadir.
		System.out.println(Arrays.binarySearch(arr, 5)); //-4 verir. Cunk; 5 var olsaydi
		                                                //3 ten hemen sonra olurdu, bu da 4. eleman demektir.
		                                               //{1,2,3,12,12}
		
		
		
		
		
	}

}
