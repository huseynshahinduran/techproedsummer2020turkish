package day21multidimensionalarray;

import java.util.Arrays;

public class SplitMethodSorusu {

	public static void main(String[] args) {

		//Verilen bir cumledeki bosluklari haric character sayisini bulunuz.
		//Cumel: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
		
		
		//First way:
		String str = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
		str=str.replace(" ", "");
		String harf[] = str.split("");
		
		System.out.println(Arrays.toString(harf));
		System.out.println("Harf sayisi: " + harf.length);
		
		System.out.println("-------------------------");
		
		//Second way:
		    //Bosluk sayisi kelime sayisindan bir azdir
		   //Bosluk sayisi = Kelime sayisi-1
		String str1 ="Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
		
		String kelime[] = str1.split(" ");
		System.out.println(Arrays.toString(kelime));
		int boslukSayisi = kelime.length-1;
		System.out.println("Kelime sayisyi: " + boslukSayisi);
		
		String character[] = str1.split("");
		System.out.println(Arrays.toString(character));
		System.out.println("Harf sayisi: " + (character.length-boslukSayisi));
		
		
	}

}
