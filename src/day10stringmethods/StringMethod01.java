package day10stringmethods;

public class StringMethod01 {

	public static void main(String[] args) {
		
		//indexOf() method'u Stringin icindeki characterin yerini belirlemek icin kullanilir.
		
	//indexOf() 1. versiyonu.	
		String str1 = "Javva World";
		
		System.out.println(str1.indexOf('v')); //Ekrana 2 yazdirir. Cunku index sayimi 0 dan baslar.
		System.out.println(str1.indexOf('W')); //Ekrana 6 yazdirir. space Java icin bir character dir.
		System.out.println(str1.indexOf('w')); //Java index bulamaz cunku Java "case sensetive" dir.
		                                      //Kucuk "w" Stringde yok. Java Character bulamayinca -1 return eder.
		System.out.println(str1.indexOf('a')); //Ekrana 2 yazdirir. Birden fazla kullanilan character icin Java 
		                                      //ilk character'in indexini verir.
		
		
		
		
		
	//indexOf() 2. versiyonu
		System.out.println(str1.indexOf('a',2)); //String deki ikinci 'a' characterinin indexini bulunuz.
	                                            // Ekrana 4 yazdiralim.
        System.out.println(str1.indexOf('a',4)); // Ekrana 4 yazdirir.
		
        System.out.println(str1.indexOf('a', 1)); //Ekrana 1 yazdirir.
        
        System.out.println(str1.indexOf('a', 5)); //Ekrana -1 yazdirir. Cunku Stringde 'a' almasina ragmen 
                                                 //benim aramaya basla dedigim yerde 'a' yok
        
    //"Alamanya" Stringindeki ikinci 'a' characterinin indexini bulunuz.
        
        String str2 = "Alamanya";
        
        System.out.println(str2.indexOf('a')); //Bu birinci 'a' nin indexi ==>2
        int idx = str2.indexOf('a');
        System.out.println(str2.indexOf('a', idx+1)); //Ekrana 4 yazdirmali.
        
      
    //indexOf() 3. versiyonu:
        
        String str3 = "Missisippi";
        
        System.out.println(str3.indexOf("is")); //Ilk "is" Stringini bulur ve ilk indexini return eder. Bu ornekte ilk "is" deki 
		                                       //i harfiniin indexi olan 1 return eder.
        System.out.println(str3.indexOf("si")); //Ekrana 3 yazdirir
        
		
		

	}

}
