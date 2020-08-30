package day06ifstatement;

public class IfStatement03 {

	private static final char P = 0;

	public static void main(String[] args) {
		
		//Bir char variable olusturun ve bir buyuk harf deger atayin.
		//Eger atanan deger, haftanin gunlerinde herhangi birinin ilk harfi ise o gunler yazdirin
		//Eger atanan deger, haftanin gunlerinde herhangi birinin ilk harfi ise o gunler yazdirin
		//ekrana "Boyle bir gun yok" yazdirin.
		
		
		char day = 'H';
		
		if(day=='P') {
			System.out.println("Pazartesi, Presembe, Pazar");
		}
		
		if(day=='C') {
			System.out.println("Carsamba,Cuma, Cumartesi");
		}
		
		if(day=='S') {
			System.out.println("Sali");
		}
		
		//"P" olmamak VEYA "C" olmamak VEYA "S" olmamak ==> VEYA islemi icin || ==> | ->Pipe denir
	   //VEYA isleminden True sonucu alabilmek bir tanesinin True olmasi yeterlidir
	  //True || True = True <--> True || False = True <--> False || False = False	
	 
    //"P" olmamak VE "C" olmamak VE "S" olmamak ==> VE islemi icin &&	
   // VE isleminden True  sonucu alabilmek icin tum condition'lar true almalidir.	
  //True && True = True <--> True && False = False <--> False && False = False 	
		
		if (day!='P' && day!='C' && day!='S') {
			System.out.println("Boyle bir gun yok.");
		}
		
		
		
		

	}

}
