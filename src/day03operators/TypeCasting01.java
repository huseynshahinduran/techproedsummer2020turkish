package day03operators;

public class TypeCasting01 {

	public static void main(String[] args) {
		
		byte by = 58;
		int sayi1 = by; //Kucuk data tipini buyuk data tipini cevirmek icin extre bir kod yazmaya gerek yok
		              //Java bunu otamatik olarak yapar. (Auto Widening)
		System.out.println(sayi1); //58
		
		int sayi2 = 53;
		byte by2 = (byte)sayi2; //Buyuk data tipini kucuk data tipine cevirmek Java tarfindan yapilmaz.
		                       //Ornekteki gibi sag tarfa donusturmek istedigimiz data tipini
		                      //parantes icinde yazmaliyiz.      
		System.out.println(by2);
		
		double sayi3 = 23.9;
		int by3 = (int)sayi3;
		System.out.println(by3); //23
		
		
		float sayi4 = -23.9f;
		short by4 = (short)sayi4;
		System.out.println(by4); //-23
		
		double sayi5 = 4.8;
		double sayi6 = 1.4; 
		
		double sonuc1 = sayi5/sayi6;
		System.out.println(sonuc1); //3.428571428571429
		
		int sonuc2 = (int)(sayi5/sayi6);
		System.out.println(sonuc2); //3
		
		
		int sayi7 = 5;
		int sayi8 = 3;
		
		int sonuc3= sayi7/sayi8;
		System.out.println(sonuc3); //Normalde 5/3=1.666.... ama data type'i int yaparsiniz
		
	  
		int sayi9 = 255;
		byte by5 = (byte) sayi9;
		
		System.out.println(by5); //Normalde byte'ta (-128....-1,0,1,...127) 256 sayi var, 255 bir tane eksik
		                        //bu yuzden -1 ekrana yazilir
		
		
		

	}

}
