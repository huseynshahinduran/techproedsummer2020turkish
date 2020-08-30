package day18statickeyword;

public class Static01 {
	static int en = 12;
	static int boy = 10;
	static int yaricap = 4;
	static double pi;
	static int alan;
	
	/*
	 *Eger bir variable'i olustururken hesap yapmamiz gerekirse
	 *"static block" olusturmak iyidir. Yani int alan = en*boy demek yerine
	 *"static block" olusturup bu isimleri static block'un icine yazmak daha iyidir.
	 *"static block" variable'lara deger atamak icin de kullanilabilir.
	 */
	
	/*
	 * "static block " class'in icinde butun method'larin(main dahil) ve constructorlarin
	 * disinda olusturulmalidir.
	 */
	
	//static block class olustuurldugu zaman olusturulur.
	
	//"static block" tum methodlardan(main method dahil) ve constructorlardan once calistirilir.
	
	//Birden fazla static block varsa ustteki once calisir.
	
	static {
		pi=3.14;
	}
	
	static {
		alan = en*boy;
	}
	
	public static void main(System[] args) {
		
		System.out.println(pi);
		
	}
	
	/*
	 * Static class olusturulabilir ama alt classlar (inner class) static class olabilir.
	 * Ust classlar (outer class) static olmazlar.
	 */
	
	static class AltClass{
		
	}

}
