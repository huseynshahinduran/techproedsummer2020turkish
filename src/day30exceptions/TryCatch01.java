package day30exceptions;

public class TryCatch01 {

	public static void main(String[] args) {

		 int num1=12;
		 int num2=0;
		 
		 /*
		  * finally{} block exception olsa da olmasa da her zaman calisir.
		  * finally{} block try-catch block'dan sonra kullanilir.
		  */
		 
		 try {
			 System.out.println(num1/num2);
		 }catch(ArithmeticException e){
			 System.out.println("Sifir ile bolme yapilamaz.");
		 }finally {
			 System.out.println("Islem bitmistir.");
		 }
		 
		 
	// Interview Question: final,finally,finalize keyword'lerinin farki nedir?
		/* 
	     * 1)finally{} (block) ==> try-catch block'dan sonra kullanilir.
	     *                         Exception olsa da olmasa da calisir.
	     *             
	     * 2)final(keyword) ==> Variable'larda final kullanilirsa, o variable'in degeri 
	     *                      degistirilemez. Mesela pi sayisi final yapildigi zaman
	     *                      degeri degistirilemez. (final String shipName = "POS";)
	     *             
	     *         ==> Method'larda final kullanilirsa, method body'leri degistirilemez
	     *             dolayisiyla overriding yapilamaz.
	     *             
	     *         ==> Class'larda final kullanilirsa, o class extend edilemez
	     *             Inheritance mumkun degildir.
	     *             public final class Animal{  } ==> public class dog extends Animal{  } OLMAZ
	     *             
	     * 3)finalize() (method) ==> finalize() methodu, Garbage collector in imha 
	     *                           edecegi datalari imha edilecek hale getirir.                                
	    */
		 
		 
		 
		 

	}

}
