package day17constructors;

public class Constructors02 {
	
	/*
	 *buyume() methodu bu class'da degil Constructors01 class'inda.
	 *O yuzden Java kullanmama musade etmiyor.
	 *Eger siz baska bir class'daki methodu kullanmak istiyorsaniz o class'dan bir tane object
	 *olusturup o object sayesinde istediginiz methodu kullana bilirsiniz.
	 */

	public static void main(String[] args) {

	Constructors01 obj1 = new Constructors01();	

	     //buyume() methodu static oldugundan java Object kullanarak buyume() methodunu
        //cagirmamiz istemez ve kodun altini renkle cizer. 	
		obj1.buyume(33);
		Constructors01.buyume(45);
		
		 //isimDegistirme() methodu static oldugundan java Object kullanarak isimDegistirme() methodunu
        //cagirmamiz istemez ve kodun altini renkle cizer. 
		obj1.isimDegistirme("Kemal Can");
		Constructors01.isimDegistirme("Huseyn");
		
		System.out.println(obj1.isim);
		System.out.println(obj1.yas);
		
		/*
		 * Bir variable veya method static olarak olusturulmussa, o variable veya methods
		 * object olusturmadan sadece class ismini kullanarak ulasabilirsiniz.
		 */
		System.out.println(Constructors03.ad);
		System.out.println(Constructors03.kilo);
		Constructors03.artirma(45); //46
		Constructors03.degistirme("Merhaba Naci"); //merhaba Naci
		
	}
	
	

}
