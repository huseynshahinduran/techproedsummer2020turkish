package day11stringmethod;

public class StringMethods04 {

	public static void main(String[] args) {

		/*valueOf() rakamlarla olusturulna String'leri sayiya donustutur.
		 Boylece rakamlarla olusturulan Stringlerle matamatiksel islemler yapabilmemizi saglar.
		*/
		
		/* valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var.
		   Integer wrapper classinin icinde olan valueOf() methodu String'in integer'a cevirir. 
		   String'in icindeki valueOf() methodu integer'i String'e cevirir.
		 
		 */
		
		
		String paraErkek = "1900";
		String paraKadin = "2000";
		
		//Bu ailenin toplam gelirini bulunuz.
		
		System.out.print("£");
		System.out.println(Integer.valueOf(paraErkek)+Integer.valueOf(paraKadin)); //3900
		
		System.out.println("-----------------");
		
		int maasErkek = 1900;
		int maasKadin = 2000;
		
		//maasErkek ve maasKadin sayilarini String'e donusturen ve concatenation yapin
		
		System.out.print("£");
		System.out.println(maasErkek+maasKadin); //3900
		
		System.out.println("-----------------");
		
		System.out.println(String.valueOf(maasErkek)+String.valueOf(maasKadin)); //19002000
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
