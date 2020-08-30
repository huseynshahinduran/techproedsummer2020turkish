package day37maps;

import java.util.Hashtable;

public class Maps02 {

	public static void main(String[] args) {
		/*
		 * HashTable: HashMap ile hemen hemen yanidir.
		 *       Farklari:
		 *          1)HashTable key ve value'larda null'a musaade etmez.
		 *          2)HashTable thread safe'dir. Bir kac isi ayni anda yapabilir.
		 *          3)HashTable daha yavastir.
		 */
		
		Hashtable<String, String> hTable=new Hashtable<>();
		hTable.put("Dil", "Kalp");
		hTable.put("Gonul", "Kalp");
		hTable.put("Dil", "Tad alama organi");
		hTable.put("Ali", "");
//		hTable.put(null, "Agizlik"); ==> Run Time Error verir.
//		hTable.put("Kanaat", null); ==> Run Time Error verir.
		//Ayni key degerini tekrar kullanirsaniz son value'yu kabul eder
		System.out.println(hTable);//{Dil=Tad alama organi, Gonul=Kalp}
		
		//HashMap'de kullandigimiz methodlarin tamami HashTable'da da kullanilir.
		

	}

}
