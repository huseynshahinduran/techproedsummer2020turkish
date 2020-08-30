package day29polymorphismexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception02 {

	/*
	 * Checked Exception'lari (Compile Time Exception) handle etmek icin iki yol var;
	 * birincisi "throws" keyword'unu kullanmak. Bunu kullanirsaniz console'da teknik mesajlar
	 * gorursunuz. Bu yuzden cok tercih edilmez.
	*/
	
	public static void main(String[] args) throws FileNotFoundException {

		
		@SuppressWarnings({ "resource", "unused" })
		FileInputStream file=new FileInputStream("C:/ogrenci.txt");
	}
}


    /*
     * Ikincisi try-catch block kullanmaktir. Bunu kullanirsaniz console'da teknik mesajlar yerine
     * kendi yazdiginiz mesajlari gorebilirsiniz. Bu yuden try-catch kullanmak tercih edilir.
     */
class ExceptionTryCatch{
	public static void main(String[] args) {
		try {
			@SuppressWarnings({ "unused", "resource" })
			FileInputStream file=new FileInputStream("C:/ogrenci.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Dosya'nin path'i yanlis veya dosya silinmis olabilir!");
	    }
    }
}
