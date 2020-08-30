package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		// List olusturun ismi list01 olsun elemanlar integer  olsun.
		
		
		/*
		 * list'ler data type olarak primitive'leri kabul etmez.
		 * Primitive'lerde data type'ini non-primitive yapmak icin wrapper class'lari kullaniriz.
		 */
		List<Integer>list01 = new ArrayList<>();
		
		/*
		 * Bu list'in icinde eleman olup olmadigini kontrol edin. isEmpty() methodu kullanilir.
		 * isEmpty() methodu list bos ise tru, dolu ise false return eder.
		 */
		System.out.println(list01.isEmpty()); //true
		
		//Bu list'e bir eleman ekleyin ve tekrar isEmpty() kullanin
		list01.add(123);
		System.out.println(list01.isEmpty());//false
		
	 	//List'den eleman silmek. remove() methodu kullanilir.
		
		list01.add(124);
		list01.add(125);
		list01.add(124);
		System.out.println(list01);
		list01.remove(1); //Indexi'i 1 olan elemani siler
		System.out.println(list01);//[123,125,124]
		
		//123'u silin.
		
		list01.remove(0);
		System.out.println(list01);
		
		//List'deki son elemani silin.
		list01.remove(list01.size()-1);
		System.out.println(list01);
	
	}

}
