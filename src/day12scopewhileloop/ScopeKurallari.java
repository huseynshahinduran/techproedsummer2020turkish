package day12scopewhileloop;

public class ScopeKurallari {

	public static void main(String[] args) {

		/*
		 Scope kapsam demektir. Olusturdugunuz bir variable'i nerelerde kullanabileceginizi
		 gosterir.
		 */
	}
		public void toplama() {
			int num1=12;
			System.out.println("Toplama");
		}
		
		public void carpma(int num, String str, char ch) {
			int num2;
			num2 = 3;
			System.out.println("Carpma");
		}
		

}


/*
 1. Kural:
 Claass'in icinde, method'larin disinda olan variable'lari butun 
 methodlar istedikleri zaman istedikleri kadar kullanabilirler.
 Bu variable'lara "Class Variable" veya "Instance Variable" denir.
 Class variable'lara deger atamasi yapmazsak Java onlara default() degerleri verir.
 Java tum sayilara icin default olarak 0 degerini verir.
 
 */

/*
  2. Kural:
  Bir method'un body'si icinde olusturulan variable'lar sadece o methodun
  icinde kullanilabilir. O method'un disindaki methodlar o varianle'i kullanamazlar.
  Methodun icinde olusturulan bu variable'lara "Lockal Variable" denir.
  Body icinde olusturulan variable'lara deger atamak zorundayiz.
  Java onlara default value vermez.
 */

/*
  3. Kural:
  Method'larin prantezleri icinde olusturulan variabel'lar
  local variable'lar gibi sadece o methodlarin
  body leri icinde kullanilabilir. Bu variable'lara da local variable
  denir. Parantez icinde olusturulan variable'lara ise deger atamasi yapmayiniz.
 */

/*
  4. Kural:
  Bir variable'i kullanmaya baslamadan once tanimlamaliyiz.
  Once num = num + 2 sonr int num = 12; diyemeyiz.
  Once int num = 12; sonra num = num +2 demeliyiz.
 */













