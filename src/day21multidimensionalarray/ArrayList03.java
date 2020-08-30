package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {

	public static void main(String[] args) {
		// ["Ali", "Can", "Ayse", "Ali"] olusturun.
		
		List<String> list = new ArrayList<>();
		
		list.add("Ali");
		list.add("Can");
		list.add("Ayse");
		list.add("Ali");
		System.out.println(list);
		
//		list.remove("Ali");
//		System.out.println(list); 
		
		list.remove("Ali"); //Birden fazla eleman varsa ilkini siler
		System.out.println(list); //[Can, Ayse, Ali]
		
		//remove() methodu listede olmayan elemanlar icin error vermez. 
		list.remove("Kemal");
		System.out.println(list);
		
		System.out.println(list.remove("Ali"));
		System.out.println(list.remove("Kemal"));
		
		System.out.println(list.remove(0)); //Bu Can elemanini siler ve ekrana silinen eleman yazar
		System.out.println(list);
		
		//"Ayse" elemanini "Aysegul" yapin. set() methodu kullanilir.
		list.set(0, "Aysegul");
		System.out.println(list); //[Aysegul]
		
		//List'e "Kenan" ve "Zeynep" ekleyin.
		
		list.add("Kenan");
		list.add("Zeynep");
		System.out.println(list); //[Aysegul,Kenan,Zeynep]
		
		list.clear();
		System.out.println(list.isEmpty()); //true
		System.out.println(list);//[]

	}

}
