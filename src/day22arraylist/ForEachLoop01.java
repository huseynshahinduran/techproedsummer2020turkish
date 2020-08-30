package day22arraylist;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01 {

	public static void main(String[] args) {
		/*
		 * For Each Loop, for loop'un ust versiyonudur. 
		 * Diger adi "Enhanced(Zenginlestirilmis) For Loop". 
		 */
		
		int arr[] = {12,21,13,43};
		
		//for loop kullanarak elemanlari ekrana yazdir.
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("------");
		
		//for each loop kullanarak ekrana yazdir.
		
		for(int w:arr) {
			System.out.println(w);
		}
		
		System.out.println("------");
		
		//String iceren bir array olusturun, elemanlarini yanyana aralarina bosluk koyarak
		//for each loop ile kerna yazdirin.
		
		String arr1[] = {"Ali", "Can", "Kemal"};
		
		for(String w:arr1) {
			System.out.print(w + " ");
		}
		
		System.out.println();
		System.out.println("------");
				
		/*
		 * Integer elemanlar iceren bir list olusturun. For each loop kullanarak
		 * bu elemanlarin toplamini ekrana yazdirin.
		 */
		
		List<Integer> toplama = new ArrayList<>();
		
		toplama.add(11);
		toplama.add(21);
		toplama.add(33);
		toplama.add(23);
		
		int sum=0;
		
		for(int w:toplama) {
			sum=sum+w;
		}
		
		System.out.println(toplama+ "=>" + sum);
		
		System.out.println("------");
		
		//{ {1,2}, {5}, {6,7,8} } array'indeki tum elemanlarin toplamini bulunuz
		
		int arr2[][] = { {1,2}, {5}, {6,7,18} };
		int sum1=0;
		
		for(int[] w : arr2 ) {
			
			for(int z : w) {
				sum1=sum1+z;
			}
			
		}
		System.out.println(sum1);
		

	}

}
