package day06ifstatement;

public class IfStatement04 {

	public static void main(String[] args) {

       //Bir tane string variable olusturun ve bir gun ismini kucu harflerle deger olarak atayin
	  
	 //Eger atadiginiz deger hafta ici gunlerinde birinin ilk harfi ise 	
	//ekrana "hafta ici" yazdirin.
   
  //Eger atadiginiz deger hafta sonu gunlerinden biri is 
 //ekrana "hafta sonu" yazdirin.
		
		
		String day1 = "pazartesi";
		
		if(day1.equals("pazartesi") || day1.equals("sali") || day1.equals("carsamba") || day1.equals("persembe") || day1.equals("cuma")) {
			System.out.println("Hafat ici");
		}
		
		if(day1.equals("cumartesi" )|| day1.equals("pazar") ) {
			System.out.println("Hafta sonu");
		}
		
		
		
		
		
		
		
		
	}

}
