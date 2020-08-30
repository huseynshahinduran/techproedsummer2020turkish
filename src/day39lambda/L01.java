package day39lambda;

import java.util.ArrayList;
import java.util.List;

public class L01 {
	
	/*
	 * Lambda = Functional Programming 
	 */

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		list.add("Ali");
		list.add("Can");
		list.add("Kemal");
		list.add("Mucella");
		list.add("Ayse");
		list.add("Emine");
		System.out.println(list);
		
		//list'in tum elemanlarini ekrana yazdiriniz
		
		//1.Yol: Structured Programming
		for (String w:list) {
			System.out.print(w+" ");
		}
		
		System.out.println("\n--------------------------------------------");
		
		//2.Yol: Functional Programming
		list.stream().forEach(t->System.out.print(t+" "));
		
		System.out.println("\n--------------------------------------------");
		
		for (String w : list) {
			if(w.length()<5) {
				System.out.print(w+" ");
			}
		}
		
		System.out.println("\n--------------------------------------------");

		list.
			stream().
			filter(t->t.length()<5).
			forEach(t->System.out.print(t+" "));
		
		System.out.println("\n--------------------------------------------");
		
		list.
			stream().
			filter(t->t.endsWith("e")).
			forEach(t->System.out.print(t+" "));
		
		System.out.println("\n--------------------------------------------");
		
		list.
			stream().
			filter(t->t.contains("a")).
			forEach(t->System.out.print(t+" "));
		
		System.out.println("\n--------------------------------------------");
		
		list.
			stream().
			filter(t->t.length()>4).
			map(t->t.toUpperCase()).
			forEach(t->System.out.print(t+" "));
		
		System.out.println("\n--------------------------------------------");
		
		list.
			stream().
			map(t->t.length()).
			forEach(t->System.out.print(t+" "));
		
		System.out.println("\n--------------------------------------------");
		
		list.
			stream().
			filter(t->t.contains("e")).
			map(t->t.length()*t.length()).
			forEach(t->System.out.print(t+" "));
		
		System.out.println("\n--------------------------------------------");
		
		
		
	}
	
}
