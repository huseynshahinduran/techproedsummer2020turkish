package day16overloading;

public class Constructor01 {

	int price = 20000;
	int year = 2020;
	String make = "Honda";
	String type = "Civic";
	
	public static void main(String[] args) {

		/*
		 * Class olusturdugumuzda Java classla beraber bir constructor olusturur, biz onu
		   herhangi bir kod yazmadan direkt kullanabiliriz. Bu constructor'a "default constructor" denir.
		 * Default constructor'larda parametre olmaz.
         * Default constructor class olusturuldugu anda Java tarafindan olusturulur.
	     * Biz kendimiz bir constructor olusturdugumuzda Java default constructor'i imha eder.
 
		 */
		
		
		Constructor01 hondaAraba = new Constructor01(); //Bor tane object uretildi.
		
		System.out.println("Make: " + hondaAraba.make);
		
		System.out.println("Type" + hondaAraba.type);
		
		System.out.println("Price: " + "$" + hondaAraba.price);
		
	    System.out.println("Year: " + hondaAraba.year);
		
    
		
		
		
		
		
		
	}

}
