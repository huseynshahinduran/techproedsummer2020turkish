package day34collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorVeForEachLoop {

	public static void main(String[] args) {
		
		List<String> list1=new ArrayList<>();
		list1.add("X");
		list1.add("Y");
		list1.add("Z");
		System.out.println(list1);
		
		Iterator<String> iterator=list1.iterator();
		//hasNext() methodu bir sonraki eleman var mi yok mu kontrol eder.
	   //==>X, Y, Z
		
		/*
		 * Asagidaki kod iterator kullanarak list deki tum elemanlari ekrana
		 * yazdirmaya yarar.
		 */
		
   //		while(iterator.hasNext()) {
  //			System.out.print(iterator.next());
 //		}
//		

		
		  //for-ecah loop kullanarak list1'in tum elemanlarini ekrana yazdiriniz.
		
		for(String w: list1) {
			//System.out.print(w);
			w=w+"1";
		}
		
		System.out.println(list1);
		
		//for-each loop ile degisim yapmaya calisalim
	   //Iterator ile for-each loop farki:
	  //for-each loop elemnalar arasinda gezer ama collection'i degistirmez
	 //iterator ise elemanlar arasinda gezer ve collection'i degistirebilir.
		for(String w:list1) {
			w=w+"A";
		}
		System.out.println(list1);
		

		//iterator ile degisim yapmaya calisalim degisim olur
		while(iterator.hasNext()) {
			iterator.next();
			iterator.remove(); //remove() methodu eleman siler
		}
		 System.out.println(list1);
		
		

	}

}
